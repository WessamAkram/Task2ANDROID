package com.example.core.atry;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by core on 03/08/2017.
 */

public class SecondActivity extends AppCompatActivity {

private RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(createDummyData(), this);
        recyclerView.setAdapter(adapter);
    }
    private List<SecondData>createDummyData(){
        List<SecondData>secondDatas=new ArrayList<>();
        SecondData s1=new SecondData();
        s1.setName("ALsha3b");
        s1.setDescription("اسبوع مجانا تابع الاخبار");
        s1.setDate("01-6-2016");
        s1.setImg("https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg?w=940&h=650&auto=compress&cs=tinysrgb");
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);
        secondDatas.add(s1);


        return secondDatas;
    }
}
