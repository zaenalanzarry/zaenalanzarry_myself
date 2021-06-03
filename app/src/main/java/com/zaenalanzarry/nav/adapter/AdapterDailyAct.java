package com.zaenalanzarry.nav.adapter;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.zaenalanzarry.nav.R;

import org.jetbrains.annotations.NotNull;

public class AdapterDailyAct extends RecyclerView.Adapter<AdapterDailyAct.DailyViewHolder> {

    private final Context context;
    private final String[] dailyAct;
    private final int[] imgDaily;

    public AdapterDailyAct(Context context, String[] dailyAct, int[] imgDaily) {
        this.context = context;
        this.dailyAct = dailyAct;
        this.imgDaily = imgDaily;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_dailylist, parent, false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DailyViewHolder holder, int position) {
        holder.imageView.setImageResource(imgDaily[position]);
        holder.textView.setText(dailyAct[position]);
    }

    @Override
    public int getItemCount() {
        return dailyAct.length;
    }

    public class DailyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public DailyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_daily);
            textView = itemView.findViewById(R.id.txt_daily);
        }
    }

}
