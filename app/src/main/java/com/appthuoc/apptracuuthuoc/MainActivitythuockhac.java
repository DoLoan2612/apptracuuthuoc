package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuockhac extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocKhac> arrayList;
    ThuocKhacAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuockhac);
        lv =(ListView) findViewById(R.id.lvThuockhac);
        arrayList = new ArrayList<>();



        arrayList.add(new ThuocKhac("Dầu Cá Kim Cương", "Công ty dược phẩm Wingfirrm", R.drawable.as));
        arrayList.add(new ThuocKhac("Etabone", "Công ty TNHH ADC - Việt Nam", R.drawable.zx));

        adapter=new ThuocKhacAdapter(this,R.layout.thuockhac,arrayList);
        lv.setAdapter((ListAdapter) adapter);
    }

}

