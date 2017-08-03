package com.example.core.atry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by core on 03/08/2017.
 */

public class dataAdapter extends BaseAdapter {
    private List<data>list;
    private Context mContext;

    public dataAdapter(List<data> list,Context mContext) {
        this.list = list;
        this.mContext=mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list, parent, false);
        }
        ImageView image=(ImageView) view.findViewById(R.id.img_id);
        TextView name= (TextView) view.findViewById(R.id.name_id);
        TextView description= (TextView) view.findViewById(R.id.description_id);
        Button button= (Button) view.findViewById(R.id.button_id);
        data data=list.get(position);
        Picasso.with(mContext)
                .load(data.getImg())
                .placeholder(R.drawable.google)
                .error(R.drawable.linked)
                .into(image);

        name.setText(data.getName());
        description.setText(data.getDescription());
        button.setText(data.getButton());

        return view;
    }
}
