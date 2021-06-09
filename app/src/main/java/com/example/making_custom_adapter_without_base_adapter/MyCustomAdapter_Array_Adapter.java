package com.example.making_custom_adapter_without_base_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter_Array_Adapter extends ArrayAdapter<String> {
    public MyCustomAdapter_Array_Adapter(Activity context, String[] web, Integer[] imageId) {
        super(context, R.layout.ba_list_single_1, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }


    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;





    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.ba_list_single_1, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }


}

