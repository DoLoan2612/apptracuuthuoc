package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuocdiung extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocDiUng> arrayList;
    ThuocDiUngAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuocdiung);
        lv =(ListView) findViewById(R.id.lvThuocdiung);
        arrayList = new ArrayList<>();



        arrayList.add(new ThuocDiUng("Inflagic 5ml", "Công ty cổ phần Dược phẩm CPC1 Hà Nội", R.drawable.ta));
        arrayList.add(new ThuocDiUng("  Desbebe", "Công ty dược phẩm Gracure Pharmaceuticals Ltd - Ấn Độ.", R.drawable.ts));
        arrayList.add(new ThuocDiUng(" Seasonix oral solution ", "công ty Incepta Pharmaceuticals Ltd ", R.drawable.td));


        adapter= new ThuocDiUngAdapter(this,R.layout.diung,arrayList);
        lv.setAdapter((ListAdapter) adapter);


}
}