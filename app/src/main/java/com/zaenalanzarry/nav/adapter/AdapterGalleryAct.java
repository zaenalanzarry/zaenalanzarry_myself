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

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.zaenalanzarry.nav.R;

import org.jetbrains.annotations.NotNull;

public class AdapterGalleryAct extends RecyclerView.Adapter<AdapterGalleryAct.DailyViewHolder> {

    private final Context context;
    private final int[] imgGallery;

    public AdapterGalleryAct(Context context, int[] imgGallery) {
        this.context = context;
        this.imgGallery = imgGallery;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gallery, parent, false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DailyViewHolder holder, int position) {
        holder.imageView.setImageResource(imgGallery[position]);
    }

    @Override
    public int getItemCount() {
        return imgGallery.length;
    }

    public class DailyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public DailyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_gallery);
        }
    }
}
