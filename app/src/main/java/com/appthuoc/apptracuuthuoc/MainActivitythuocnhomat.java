package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuocnhomat extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocNhoMat> arrayList;
    ThuocNhoMatAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuocnhomat);
        lv =(ListView) findViewById(R.id.lvThuocnhomat);
        arrayList = new ArrayList<>();



        arrayList.add(new ThuocNhoMat(" Tearidone Eye Drops ", "Công ty Samchundang Pharmaceutical Co., Ltd - Hàn Quốc.", R.drawable.zc));
        arrayList.add(new ThuocNhoMat("  Cationorm 0.4ml", "Santen Pharmaceutical Co.,Ltd - Nhật Bản.", R.drawable.zv));
        arrayList.add(new ThuocNhoMat(" Dropstar 10ml", "Công ty cổ phần Dược phẩm CPC1 Hà Nội.", R.drawable.zb));
        arrayList.add(new ThuocNhoMat(" Rohto AntiBacterial", " công ty TNHH ROHTO - MENTHOLATUM", R.drawable.zn));

        adapter= new ThuocNhoMatAdapter(this,R.layout.nhomat,arrayList);
        lv.setAdapter((ListAdapter) adapter);

    }
}