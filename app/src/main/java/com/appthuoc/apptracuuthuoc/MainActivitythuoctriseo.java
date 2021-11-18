package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuoctriseo extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocTriSeo> arrayList;
    ThuocKhacAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuoctriseo);
        lv =(ListView) findViewById(R.id.lvThuoctriseo);
        arrayList = new ArrayList<>();



        arrayList.add(new ThuocGayMe("", "", R.drawable.));
        arrayList.add(new ThuocGayMe(" ", "", R.drawable.));
        arrayList.add(new ThuocGayMe(" ", "", R.drawable.));
        arrayList.add(new ThuocGayMe(" ", "", R.drawable.);

        adapter= new ThuocKhacAdapter(this,R.layout.triseo,arrayList);
        lv.setAdapter((ListAdapter) adapter);
    }

}
