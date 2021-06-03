package com.zaenalanzarry.nav.model;

/*
    Tanggal Pengerjaan : 24 Mei 2021
    NIM   : 10118023
    Nama  : Zaenal Anzarry
    Kelas : IF-1/S1/VI
 */

public class modelApp {

    private String[] dailyAct;
    private String[] friendAct;
    private int[] imgDaily;
    private int[] imgFriend;
    private int[] imgGallery;
    private String[] musicAct;

    public String[] getFriendAct() {
        return friendAct;
    }

    public void setFriendAct(String[] friendAct) {
        this.friendAct = friendAct;
    }

    public int[] getImgFriend() {
        return imgFriend;
    }

    public void setImgFriend(int[] imgFriend) {
        this.imgFriend = imgFriend;
    }

    public String[] getDailyAct() {
        return dailyAct;
    }

    public void setDailyAct(String[] dailyAct) {
        this.dailyAct = dailyAct;
    }

    public int[] getImgDaily() {
        return imgDaily;
    }

    public void setImgDaily(int[] imgDaily) {
        this.imgDaily = imgDaily;
    }

    public int[] getImgGallery() {
        return imgGallery;
    }

    public void setImgGallery(int[] imgGallery) {
        this.imgGallery = imgGallery;
    }

    public String[] getMusicAct() {
        return musicAct;
    }

    public void setMusicAct(String[] musicAct) {
        this.musicAct = musicAct;
    }
}
