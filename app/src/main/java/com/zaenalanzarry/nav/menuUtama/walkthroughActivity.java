package com.zaenalanzarry.nav.menuUtama;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.zaenalanzarry.nav.R;
import com.zaenalanzarry.nav.adapter.walkthroughAdapter;
import com.zaenalanzarry.nav.fragment.walkthrough.page1;
import com.zaenalanzarry.nav.fragment.walkthrough.page2;
import com.zaenalanzarry.nav.fragment.walkthrough.page3;


public class walkthroughActivity extends AppCompatActivity {

    ViewPager view;
    page1 first;
    page2 second;
    page3 third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walkthrought);
        view = findViewById(R.id.view_pager);
        setupViewPager(view);
    }

    private void setupViewPager(ViewPager viewPager) {
        walkthroughAdapter adapter = new walkthroughAdapter(getSupportFragmentManager());
        first = new page1();
        second = new page2();
        third = new page3();

        adapter.addFragment(first);
        adapter.addFragment(second);
        adapter.addFragment(third);
        viewPager.setAdapter(adapter);

    }
}

