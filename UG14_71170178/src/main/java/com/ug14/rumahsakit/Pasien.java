package com.ug14.rumahsakit;

public class Pasien {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private String status;

    public Pasien(String test, int i, String di_mana_saja) {
    }

    public int getRm(){
        return rm;
    }

    public void setRm(int rm){
        this.rm = rm;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUsia(){
        return usia;
    }

    public void setUsia(int usia){
        this.usia = usia;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getPenyakit(){
        return penyakit;
    }

    public void setPenyakit(String penyakit){
        this.penyakit = penyakit;
    }

    public void setLevelPenyakit(){
        this.levelPenyakit -= 1;

    }

    public int getLevelPenyakit(){
        return levelPenyakit;
    }

    public void status(){

    }

    public String getStatus(){
        return status;
    }

    public void sembuh() {
        this.status="true";
    }
}
