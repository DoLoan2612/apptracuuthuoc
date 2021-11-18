package com.appthuoc.apptracuuthuoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThuocGayMeAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<ThuocGayMe> thuocGayMeList;

    public ThuocGayMeAdapter(Context context, int layout, List<ThuocGayMe> thuocGayMeList){
        this.context = context;
        this.layout = layout;
        this.thuocGayMeList= thuocGayMeList;
    }

    @Override
    public int getCount() {
        return thuocGayMeList.size();
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

        tvTenThuoc.setText(thuocGayMeList.get(i).tenThuoc);
        tvNhasx.setText(thuocGayMeList.get(i).nhasanxuat);
        imgco.setImageResource(thuocGayMeList.get(i).hinhanh);
        return convertView;
    }
}
