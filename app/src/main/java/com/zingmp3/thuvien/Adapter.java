package com.zingmp3.thuvien;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.zingmp3.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
     ArrayList<ThuVien> thuVien;
     Context context;
     int layout;
     String color;


    public Adapter(Context context, int layout, ArrayList<ThuVien> listPro) {
        this.context = context;
        this.layout = layout;
        this.thuVien = listPro;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View itemView = inflater.inflate(layout,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(thuVien.get(position).getName());
        holder.img.setImageResource(thuVien.get(position).getImg());
        holder.cvImg.setCardBackgroundColor(thuVien.get(position).getColor());
    }


    @Override
    public int getItemCount() {
        return thuVien.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView img;
        CardView cvImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.thuvien_name);
            img = (ImageView) itemView.findViewById(R.id.thuvien_title);
            cvImg = (CardView) itemView.findViewById(R.id.cv_img);
        }
    }
}
