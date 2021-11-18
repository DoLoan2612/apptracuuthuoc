package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuoctriho extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocTriHo> arrayList;
    ThuocTriHoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuoctriho);
        lv =(ListView) findViewById(R.id.lvThuoctriho);
        arrayList = new ArrayList<>();


        arrayList.add(new ThuocTriHo("Bổ phế Nam Hà chỉ khái lộ KĐ", "Công ty cổ phần Dược phẩm Nam Hà- VIỆT NAM. ", R.drawable.e));
        arrayList.add(new ThuocTriHo("Thuốc ho trẻ em OPC", "Công ty Cổ phần Dược phẩm OPC.", R.drawable.f));
        arrayList.add(new ThuocTriHo("Astemix","Công ty Cổ phần Dược phẩm An Thiên - Việt Nam.", R.drawable.q));
        arrayList.add(new ThuocTriHo("Mật ong chanh đào vip ","Công ty cổ phần kinh doanh và thương mại Vĩnh Phát.", R.drawable.t));
        arrayList.add(new ThuocTriHo("Thuốc Ho Nam Dược ","Công ty TNHH Nam Dược.", R.drawable.w));

        adapter=new ThuocTriHoAdapter(this,R.layout.triho,arrayList);
        lv.setAdapter(adapter);
    }


}
