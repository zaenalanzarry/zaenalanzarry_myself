package com.zaenalanzarry.nav.fragment.menu.daily;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DailyViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DailyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Perkenalkan Nama Saya");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
