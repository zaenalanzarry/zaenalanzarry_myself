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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zaenalanzarry.nav.R;

import org.jetbrains.annotations.NotNull;

public class AdapterMusicAct extends RecyclerView.Adapter<AdapterMusicAct.DailyViewHolder> {

    private final Context context;
    private final String[] musicAct;

    public AdapterMusicAct(Context context, String[] musicAct) {
        this.context = context;
        this.musicAct = musicAct;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_musiclist, parent, false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DailyViewHolder holder, int position) {
        holder.textView.setText(musicAct[position]);
    }

    @Override
    public int getItemCount() {
        return musicAct.length;
    }

    public class DailyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public DailyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txt_music);

        }
    }
}
