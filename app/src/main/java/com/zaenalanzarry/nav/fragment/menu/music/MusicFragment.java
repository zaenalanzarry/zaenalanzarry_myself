package com.zaenalanzarry.nav.fragment.menu.music;

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
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zaenalanzarry.nav.R;
import com.zaenalanzarry.nav.adapter.AdapterMusicAct;
import com.zaenalanzarry.nav.databinding.FragmentMusicBinding;
import com.zaenalanzarry.nav.model.modelApp;

public class MusicFragment extends Fragment {

    private MusicViewModel musicViewModel;
    private FragmentMusicBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_music, container, false);

        final FragmentActivity fragment = getActivity();
        final RecyclerView recyclerView = view.findViewById(R.id.music_act);
        LinearLayoutManager layoutManager = new LinearLayoutManager(fragment, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        modelApp model = new modelApp();

        String musicAct[] = {
                "See You Again - Wiz Khalifa ft. Charlie Puth",
                "Perfect - Ed Sheeran",
                "Shape Of You - Ed Sheeran",
                "Sugar - Maroon 5",
                "All I Ask - Adele",
                "Some One Like You - Adele",
                "Girls Like You - Maroon 5"
        };

        model.setMusicAct(musicAct);

        // Menampilkan Video
        VideoView videoView = view.findViewById(R.id.video);
        videoView.setVideoPath("android.resource://"+getActivity().getPackageName()+"/"+R.raw.video);
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //
        new Thread(new Runnable() {
            @Override
            public void run() {
                final AdapterMusicAct adapter = new AdapterMusicAct(fragment, model.getMusicAct());
                fragment.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setAdapter(adapter);
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
