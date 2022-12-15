package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksa;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public Pasien getPasien(){
        return pasien;

    }
    public void setPasien(Pasien pasien){
        this.pasien = pasien;
    }

    public int getidPemeriksa(){
        return idPemeriksa;

    }
    public void setidPemeriksa(int idPemeriksa){
        this.idPemeriksa = idPemeriksa;
    }

    public Suster getSuster(){
        return suster;

    }
    public void setSuster(Suster suster){
        this.suster = suster;
    }

    public Dokter getDokter(){
        return dokter;

    }
    public void setDokter(Dokter dokter){
        this.dokter = dokter;
    }

    public Pelayanan getPelayanan(){
        return pelayanan;

    }
    public void setPelayanan(Pelayanan pelayanan){
        this.pelayanan = pelayanan;
    }

    public void statusDaftar(){
        this.statusDaftar = true;
    }

    public boolean getStatusScreening(){
        return true;
    }

    public void sudahDaftar() {
        this.statusDaftar = true;
    }

    public void sudahScreening() {
        this.statusScreening = true;
    }
}
