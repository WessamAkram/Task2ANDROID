package com.example.core.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<data> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        list = creatDumyData();
        dataAdapter adapter = new dataAdapter(list, this);
        listView.setAdapter(adapter);


    }


    private List<data> creatDumyData() {
        List<data> datas = new ArrayList<>();
        data d = new data();
        d.setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVMUqHo__seBPfBaPpqjSMwl0HlK67Fd_pXHNFBRwm0TMVT6S2ja9DQ");
        d.setName("Google Drive");
        d.setDescription("8.7MB .Updated june 18");
        d.setButton("UPDATE");
        data d1 = new data();
        d1.setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVMUqHo__seBPfBaPpqjSMwl0HlK67Fd_pXHNFBRwm0TMVT6S2ja9DQ");
        d1.setName("WhatsApp Messenger");
        d1.setDescription("9.1MB .Updated April 16");
        d1.setButton("UPDATE");
        data d2 = new data();
        d2.setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVMUqHo__seBPfBaPpqjSMwl0HlK67Fd_pXHNFBRwm0TMVT6S2ja9DQ");
        d2.setName("Google Chrome: Fast&Security");
        d2.setDescription("19MB .Updated April 18");
        d2.setButton("UPDATE");
        data d3 = new data();
        d3.setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVMUqHo__seBPfBaPpqjSMwl0HlK67Fd_pXHNFBRwm0TMVT6S2ja9DQ");
        d3.setName("Android System WebView");
        d3.setDescription("23MB .Updated APRIL 4");
        d3.setButton("UPDATE");
        data d4 = new data();
        d4.setImg("https://cdn0.iconfinder.com/data/icons/Gloss__Adobe_Products_by_deleket/512/Adobe_Reader.png");
        d4.setName("Adobe Acrobat Reader");
        d4.setDescription("9.5MB .Updated january 27");
        d4.setButton("UPDATE");
        data d5 = new data();
        d5.setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVMUqHo__seBPfBaPpqjSMwl0HlK67Fd_pXHNFBRwm0TMVT6S2ja9DQ");
        d5.setName("Google+");
        d5.setDescription("10.0MB .Updated December 6");
        d5.setButton("UPDATE");
        data d6 = new data();
        d6.setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjVMUqHo__seBPfBaPpqjSMwl0HlK67Fd_pXHNFBRwm0TMVT6S2ja9DQ");
        d6.setName("LinkedIn");
        d6.setDescription("19MB .Updated December 18");
        d6.setButton("UPDATE");
        data d7 = new data();
        d7.setImg("R.drawable.officesuite");
        d7.setName("OfficeSuite : Free Office");
        d7.setDescription("30MB .Updated june 18");
        d7.setButton("UPDATE");


        datas.add(d);
        datas.add(d1);
        datas.add(d2);
        datas.add(d3);
        datas.add(d4);
        datas.add(d5);
        datas.add(d6);
        datas.add(d7);


        return datas;
    }
}
