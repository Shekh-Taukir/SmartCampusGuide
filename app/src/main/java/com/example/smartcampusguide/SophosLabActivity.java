package com.example.smartcampusguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class SophosLabActivity extends AppCompatActivity {
    ListView imageDetailList;
    TextToSpeech textToSpeech;
    ImageView speaker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sophos_lab);
        imageDetailList=findViewById(R.id.imageDetailList);
        speaker=findViewById(R.id.textToSpeech);
        String [] HeadingData = {"Sophos Rack","Sophos PC","Sophos LED"};
        String [] DetailData = {"CPU: Core i5 12500H, RAM : 32 GB DDR4, Storage : 2TB SSD, Operating System : Ubuntu 20.04, Web Server : Apache2, Database : MongoDB, Programming : ASP.NET6"};
        Integer [] speakers={R.drawable.ic_microphone,R.drawable.ic_microphone,R.drawable.ic_microphone};
        Integer [] speakersOff={R.drawable.ic_baseline_volume_off_24,R.drawable.ic_baseline_volume_off_24,R.drawable.ic_baseline_volume_off_24};
        Integer [] ImageData={R.drawable.sophos_rack_image,R.drawable.sophos_pc_image,R.drawable.sophos_led_image};
        int [] textToSpeechArray={0,0,0};
        CustomListAdapter_DetailList customAdapter=new CustomListAdapter_DetailList(getApplicationContext(),HeadingData,DetailData,ImageData,speakers,speakersOff);
        try {
            imageDetailList.setAdapter(customAdapter);
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        imageDetailList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SharedClass sc=new SharedClass();
                Toast.makeText(SophosLabActivity.this, "the result is "+String.valueOf(sc.sharedArray[i]), Toast.LENGTH_SHORT).show();
            }
        });
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i!=TextToSpeech.ERROR){
                    textToSpeech.setLanguage(new Locale("HINDI", "IND"));
                }
            }
        });
    }
}
class LabActivityClass{
    public void testFunction(int i){
        Toast.makeText(new SophosLabActivity().getApplicationContext(), "Hello constructor", Toast.LENGTH_SHORT).show();
    }
}