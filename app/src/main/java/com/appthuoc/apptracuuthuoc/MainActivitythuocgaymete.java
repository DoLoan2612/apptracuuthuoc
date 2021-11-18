package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuocgaymete extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocGayMe> arrayList;
    ThuocKhacAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuocgaymete);
        lv =(ListView) findViewById(R.id.lvThuocgayme);
        arrayList = new ArrayList<>();



        arrayList.add(new ThuocGayMe("Ephedrine Aguettant 30mg/ml", "Công ty Laboratoire Aguettant.", R.drawable.ep));
        arrayList.add(new ThuocGayMe(" Falipan", "Công ty Industria Farmaceutica Nova Argentia SRL - Ý.", R.drawable.fai));
        arrayList.add(new ThuocGayMe("  Aerrane 100ml", "Baxtex Healthcare Corp of Puerto Rico - Mỹ.", R.drawable.ae));
        arrayList.add(new ThuocGayMe("Medicaine Inj. 2% (100 ống) ", "Công ty Huons Co., Ltd..", R.drawable.my));

        adapter= new ThuocKhacAdapter(this,R.layout.gayme,arrayList);
        lv.setAdapter((ListAdapter) adapter);
    }


}