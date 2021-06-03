package com.zaenalanzarry.nav.fragment.menu.daily;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zaenalanzarry.nav.R;
import com.zaenalanzarry.nav.adapter.AdapterDailyAct;
import com.zaenalanzarry.nav.adapter.AdapterFriendAct;
import com.zaenalanzarry.nav.databinding.FragmentDailyBinding;
import com.zaenalanzarry.nav.model.modelApp;

public class DailyFragment extends Fragment {

    private DailyViewModel dailyViewModel;
    private FragmentDailyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_daily, container, false);

        final FragmentActivity fragment = getActivity();
        final FragmentActivity fragment2 = getActivity();
        final RecyclerView recyclerView = view.findViewById(R.id.daily_act);
        final RecyclerView recyclerView2 = view.findViewById(R.id.friend_act);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(fragment2, LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(fragment, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView2.setLayoutManager(layoutManager2);
        modelApp model = new modelApp();


        // Daily Activity Value
        int[] imgDaily = {R.drawable.beribadah, R.drawable.bermain_games, R.drawable.menonton, R.drawable.iot};
        String[] dailyAct = {
                "Beribadah", "Bermain Game", "Menonton Anime/Youtube", "Mencoba Hal Baru"
        };

        model.setImgDaily(imgDaily);
        model.setDailyAct(dailyAct);

        //Friend List Value
        int[] imgFriend = {R.drawable.frl1, R.drawable.frl2, R.drawable.frl3, R.drawable.frl4};
        String[] friendAct = {
                "Widyastuti", "Fiqri Akbar Pratama", "Yoga Riski Permana", "Derry Taufik"
        };

        model.setImgFriend(imgFriend);
        model.setFriendAct(friendAct);

        //
        new Thread(new Runnable() {
            @Override
            public void run() {
                final AdapterDailyAct adapter = new AdapterDailyAct(fragment, model.getDailyAct(),model.getImgDaily());
                fragment.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setAdapter(adapter);
                    }

                });
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                final AdapterFriendAct adapter = new AdapterFriendAct(fragment2,model.getFriendAct(), model.getImgFriend());
                fragment2.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView2.setAdapter(adapter);
                    }

                });
            }
        }).start();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
