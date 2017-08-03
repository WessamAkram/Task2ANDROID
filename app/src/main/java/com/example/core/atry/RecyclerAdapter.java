package com.example.core.atry;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by core on 03/08/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>{
   private List<SecondData>list;
    private Context mContext;
    public RecyclerAdapter(List<SecondData> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    public RecyclerAdapter() {

    }


    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item2_list, parent, false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {

SecondData sData=list.get(position);
        holder.description.setText(sData.getDescription());
        holder.name.setText(sData.getName());
        holder.date.setText(sData.getDate());

        Picasso.with(mContext)
                .load(sData.getImg())
                .error(R.drawable.whats)
                .placeholder(R.drawable.webview)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView date;
        private TextView description;
        public RecyclerHolder(View view) {
            super(view);
            image= (ImageView) view.findViewById(R.id.item_img);
            name= (TextView) view.findViewById(R.id.item_name);
            date=(TextView) view.findViewById(R.id.item_date);
            description=(TextView) view.findViewById(R.id.item_description);

        }
    }
}
