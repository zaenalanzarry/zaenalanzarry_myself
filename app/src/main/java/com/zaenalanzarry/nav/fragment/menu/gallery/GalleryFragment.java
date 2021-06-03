package com.zaenalanzarry.nav.fragment.menu.gallery;

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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.zaenalanzarry.nav.R;
import com.zaenalanzarry.nav.adapter.AdapterGalleryAct;
import com.zaenalanzarry.nav.databinding.FragmentGalleryBinding;
import com.zaenalanzarry.nav.model.modelApp;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        final FragmentActivity fragment = getActivity();
        final RecyclerView recyclerView = view.findViewById(R.id.gall_act);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        modelApp model = new modelApp();

        //gallery
        int[] imgGallery = {
                R.drawable.gal1, R.drawable.gal2, R.drawable.gal3, R.drawable.gal4,R.drawable.gal5,
                R.drawable.gal6, R.drawable.gal7, R.drawable.gal8
        };
        model.setImgGallery(imgGallery);

        //
        new Thread(new Runnable() {
            @Override
            public void run() {
                final AdapterGalleryAct adapter = new AdapterGalleryAct(fragment, model.getImgGallery());
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