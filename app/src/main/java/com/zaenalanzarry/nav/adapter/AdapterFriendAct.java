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

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterFriendAct extends RecyclerView.Adapter<AdapterFriendAct.DailyViewHolder> {

    private final Context context;
    private final String[] friendAct;
    private final int[] imgFriend;

    public AdapterFriendAct(Context context, String[] friendAct, int[] imgFriend) {
        this.context = context;
        this.friendAct = friendAct;
        this.imgFriend = imgFriend;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_friendlist, parent, false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DailyViewHolder holder, int position) {
        holder.imageView.setImageResource(imgFriend[position]);
        holder.textView.setText(friendAct[position]);
    }

    @Override
    public int getItemCount() {
        return friendAct.length;
    }

    public class DailyViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        TextView textView;

        public DailyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_friend);
            textView = itemView.findViewById(R.id.txt_friend);
        }
    }
}
