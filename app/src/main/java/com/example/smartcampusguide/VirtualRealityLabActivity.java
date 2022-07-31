package com.example.smartcampusguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class VirtualRealityLabActivity extends AppCompatActivity {
    ListView imageDetailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_reality_lab);
        imageDetailList=findViewById(R.id.imageDetailList);
        String [] HeadingData = {"Virual Reality Lab"};
        String [] DetailData = {"CPU: Core i5 12500H, RAM : 32 GB DDR4, Storage : 2TB SSD, Operating System : Windows OS, Web Server : Apache2, Database : MongoDB, Programming : ASP.NET6"};
        Integer [] ImageData={R.drawable.virtual_reality_lab_image};
        Integer [] speakers={R.drawable.ic_microphone,R.drawable.ic_microphone,R.drawable.ic_microphone};

        CustomListAdapter_DetailList customAdapter=new CustomListAdapter_DetailList(getApplicationContext(),HeadingData,DetailData,ImageData,speakers);
        try {
            imageDetailList.setAdapter(customAdapter);
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}