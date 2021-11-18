package com.appthuoc.apptracuuthuoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivitythuoctieuhoa extends AppCompatActivity {
    ListView lv;
    ArrayList<ThuocTieuHoa> arrayList;
    ThuocTieuHoaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitythuoctieuhoa);

        lv =(ListView) findViewById(R.id.lvThuoctieuhoa);
        arrayList = new ArrayList<>();


        arrayList.add(new ThuocTieuHoa("Naupastad 10", "Công ty TNHH liên doanh Stella", R.drawable.aq));
        arrayList.add(new ThuocTieuHoa("Bình Vị Thái Minh", "Công ty Cổ Phần công nghệ cao Thái Minh", R.drawable.ax));
        arrayList.add(new ThuocTieuHoa("Enterobella 1g(thuốc bột uống)","Công ty Mekophar (Việt Nam)", R.drawable.az));

        adapter=new ThuocTieuHoaAdapter(this,R.layout.tieuhoa,arrayList);
        lv.setAdapter((ListAdapter) adapter);
    }


}



