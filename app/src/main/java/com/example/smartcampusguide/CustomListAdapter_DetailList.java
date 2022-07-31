package com.example.smartcampusguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter_DetailList extends BaseAdapter {
    Context context;
    String[] headingData,detailData;
    Integer [] imageData;
    LayoutInflater inflater;

    public CustomListAdapter_DetailList(Context context, String[] headingData, String[] detailData, Integer[] imageData) {
        this.context = context;
        this.headingData = headingData;
        this.detailData = detailData;
        this.imageData = imageData;
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
        image.setImageResource(imageData[i]);
        heading.setText(headingData[i]);
        details.setText(detailData[0]);
        return view;
    }
}
