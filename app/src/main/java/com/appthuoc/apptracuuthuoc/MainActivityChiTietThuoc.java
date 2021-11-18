package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityChiTietThuoc extends AppCompatActivity {
    private ListView listView;
    private String[] listData;
    private ArrayAdapter<String> adapter;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chi_tiet_thuoc);
        context = this;

        listView =(ListView) findViewById(R.id.lv);

        listData = context.getResources().getStringArray(R.array.listThuoc);

        adapter =new ArrayAdapter<>(context, android.R.layout.simple_list_item_1,listData);

        listView.setAdapter(adapter);
    }
}