package com.example.smartcampusguide;

import android.content.Context;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.Locale;

public class CustomListAdapter_DetailList extends BaseAdapter {
    Context context;
    String[] headingData,detailData;
    Integer [] imageData,speakers,speakersOff;
    LayoutInflater inflater;
    TextToSpeech textToSpeech;
    SharedClass sc=new SharedClass();
    int flag=0;


    public CustomListAdapter_DetailList(Context context, String[] headingData, String[] detailData, Integer[] imageData,Integer [] speakers,Integer [] speakersOff) {
        this.context = context;
        this.headingData = headingData;
        this.detailData = detailData;
        this.imageData = imageData;
        this.speakers=speakers;
        this.speakersOff=speakersOff;
//        this.textToSpeechArray=textToSpeechArray;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return headingData.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.custom_list_image_detail,null);
        ImageView image=view.findViewById(R.id.listImage);
        TextView heading=view.findViewById(R.id.listHeading),details=view.findViewById(R.id.listDetails);
        ImageView speaker=view.findViewById(R.id.textToSpeech);
        image.setImageResource(imageData[i]);
        heading.setText(headingData[i]);
        speaker.setImageResource(speakers[i]);
//        textToSpeech = new TextToSpeech(view.getContext(), new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int i) {
//                if(i!=TextToSpeech.ERROR){
//                    textToSpeech.setLanguage(new Locale("HINDI", "IND"));
//                }
//            }
//        });
        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==1) {
                    speaker.setImageResource(speakers[i]);
                    flag=0;
//                    textToSpeech.stop();
//                    textToSpeechArray[i]=0;
                    sc.sharedArray[i]=0;
                }
                else
                {
                    flag = 1;
                    speaker.setImageResource(speakersOff[i]);
//                    textToSpeechArray[i]=1;
                    sc.sharedArray[i]=1;
//                    textToSpeech.speak("Specification of "+headingData[i].toString()+" are "+detailData[0].toString(), TextToSpeech.QUEUE_FLUSH,null);
                }
                LabActivityClass lac=new LabActivityClass();
//                lac.testFunction(sc.sharedArray[i]);
//                SophosLabActivity sla=new SophosLabActivity();
//                try{
//                    sla.testFunction(sc.sharedArray[i]);
//                }
//                catch (Exception e){
//                    Toast.makeText(sla, e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
            }
        });
        details.setText(detailData[0]);
        return view;
    }

//    PreferenceManager.OnActivityStopListener override = new PreferenceManager.OnActivityStopListener() {
//        @Override
//        public void onActivityStop() {
//            textToSpeech.stop();
//        }
//    };
}


