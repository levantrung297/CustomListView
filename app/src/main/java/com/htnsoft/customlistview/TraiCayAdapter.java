package com.htnsoft.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TRUNG VAN on 1/27/2018.
 */

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<TraiCay> traicayList;

    public TraiCayAdapter(Context context, int layout, ArrayList<TraiCay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }

    @Override
    public int getCount() {
        return traicayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //Trả về mỗi dòng trên mỗi item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        //Anh xa view
        TextView txtTen = (TextView) convertView.findViewById(R.id.txtViewTen);
        TextView txtMota = (TextView) convertView.findViewById(R.id.txtMota);
        ImageView imgViewHinh = (ImageView) convertView.findViewById(R.id.imgViewHinh);

        //Gán giá trị
        TraiCay traiCay = traicayList.get(position);

        txtTen.setText(traiCay.getTen());
        txtMota.setText(traiCay.getMoTa());
        imgViewHinh.setImageResource(traiCay.getHinh());
        return convertView;
    }
}
