package com.appthuoc.apptracuuthuoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThuocNhoMatAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<ThuocNhoMat> thuocNhoMatList;

    public ThuocNhoMatAdapter(Context context, int layout, List<ThuocNhoMat> thuocNhoMatList) {
        this.context = context;
        this.layout = layout;
        this.thuocNhoMatList = thuocNhoMatList;
    }

    @Override
    public int getCount() {
        return thuocNhoMatList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        TextView tvTenThuoc =(TextView) convertView.findViewById(R.id.tvTenThuoc);
        TextView tvNhasx =(TextView) convertView.findViewById(R.id.tvNhasx);
        ImageView imgco = (ImageView) convertView.findViewById(R.id.imgco);


        tvTenThuoc.setText(thuocNhoMatList.get(i).tenThuoc);
        tvNhasx.setText(thuocNhoMatList.get(i).nhasanxuat);
        imgco.setImageResource(thuocNhoMatList.get(i).hinhanh);
        return convertView;
    }
}
