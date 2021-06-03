package com.zaenalanzarry.nav.menuUtama;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.zaenalanzarry.nav.R;

public class splashScreenActivity extends AppCompatActivity {
    //set waktu lama sPlashscreen
    private static int LamaTampilSplash = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // to do auto generated stub
                Intent intent = new Intent(splashScreenActivity.this,walkthroughActivity.class);
                startActivity(intent);

                // jeda setelah splashscren

                this.selesai();
            }

            private void selesai(){
                //auto
            }
        },LamaTampilSplash);
    };
}
