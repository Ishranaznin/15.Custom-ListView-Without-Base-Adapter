package com.example.making_custom_adapter_without_base_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] web = {
            "Java",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "C++",
            "C#",
            "HTML",
            "CSS"
    } ;
    Integer[] imageId = {
            R.drawable.arrow,
            R.drawable.face,
            R.drawable.done,
            R.drawable.face,
            R.drawable.arrow,
            R.drawable.done,
            R.drawable.slideshow_black_24dp,
            R.drawable.arrow,
            R.drawable.slideshow_black_24dp,
            R.drawable.face,
            R.drawable.done,
            R.drawable.arrow,
            R.drawable.slideshow_black_24dp,
            R.drawable.done,
            R.drawable.face,
            R.drawable.arrow,
            R.drawable.slideshow_black_24dp,
            R.drawable.done,
            R.drawable.arrow,
            R.drawable.face,
            R.drawable.arrow,
            R.drawable.slideshow_black_24dp,
            R.drawable.face,
            R.drawable.face,
            R.drawable.done,
            R.drawable.arrow,
            R.drawable.slideshow_black_24dp,
            R.drawable.face,
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.face,
            R.drawable.slideshow_black_24dp
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCustomAdapter_Array_Adapter listAdapter = new MyCustomAdapter_Array_Adapter(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(listAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
            }
        });

    }

}

