package com.appthuoc.apptracuuthuoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ThuocDiUngAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<ThuocDiUng> thuocDiUngList;

    public ThuocDiUngAdapter(Context context, int layout, ArrayList<ThuocDiUng> thuocDiUngList){
        this.context = context;
        this.layout = layout;
        this.thuocDiUngList = thuocDiUngList;
    }

    @Override
    public int getCount() {
        return thuocDiUngList.size();
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

        tvTenThuoc.setText(thuocDiUngList.get(i).tenThuoc);
        tvNhasx.setText(thuocDiUngList.get(i).nhasanxuat);
        imgco.setImageResource(thuocDiUngList.get(i).hinhanh);
        return convertView;
    }


}
