package com.example.smartcampusguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ImageDetail extends AppCompatActivity {
    ListView ImageDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);
        ImageDetailList=findViewById(R.id.image_detail);
        String [] HeadingData = {"Sophos Rack","Sophos PC","Sophos LED"};
        String [] DetailData = {"CPU: Core i5 12500H, RAM : 32 GB DDR4, Storage : 2TB SSD, Operating System : Ubuntu 20.04, Web Server : Apache2, Database : MongoDB, Programming : ASP.NET6"};
        Integer [] ImageData={R.drawable.sophos_rack_image,R.drawable.sophos_pc_image,R.drawable.sophos_led_image};
//        CustomListAdapter_DetailList customAdapter=new CustomListAdapter_DetailList(getApplicationContext(),HeadingData,DetailData,ImageData);
//        ImageDetailList.setAdapter(customAdapter);
    }
}