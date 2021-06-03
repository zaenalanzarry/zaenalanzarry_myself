package com.zaenalanzarry.nav.fragment.menu.profile;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zaenalanzarry.nav.R;
import com.zaenalanzarry.nav.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;
    private FragmentProfileBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_profile, container, false);

        FloatingActionButton phone, instagram, github, email;
        Button maps,about;
        Dialog dialog;

        dialog = new Dialog(getActivity());

        phone = view.findViewById(R.id.phone);
        email = view.findViewById(R.id.email);
        github = view.findViewById(R.id.github);
        instagram = view.findViewById(R.id.insta);
        maps = view.findViewById(R.id.maps);
        about = view.findViewById(R.id.about);

        //OnClick Button Phone
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("tel:+6281221306927"));
                startActivity(intent);
            }
        });

        //OnClick Button Email
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("mailto:zaenal7a@gmail.com"));
                startActivity(intent);
            }
        });

        //OnClick Button Github
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/zaenalanzarry"));
                startActivity(intent);
            }
        });

        //OnClick Button Instagram
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/zaenalanzarry"));
                startActivity(intent);
            }
        });

        //OnClick Button maps
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://goo.gl/maps/fMVGU1EwVPUNxWrn8"));
                startActivity(intent);
            }
        });

        //OnClick Button about
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.dialog_about);
                ImageView close = dialog.findViewById(R.id.close);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
