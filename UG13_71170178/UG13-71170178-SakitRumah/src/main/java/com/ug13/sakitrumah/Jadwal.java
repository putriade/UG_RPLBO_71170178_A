package com.ug13.sakitrumah;

public class Jadwal {
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public Pengunjung getPengunjung(){
        return pengunjung;

    }
    public void setPengunjung(Pengunjung pengunjung){
        this.pengunjung = pengunjung;
    }

    public Pemeriksa getPemeriksapemeriksa(){
        return pemeriksa;

    }
    public void setPemeriksa(Pemeriksa pemeriksa){
        this.pemeriksa = pemeriksa;
    }

    public Perawat getPerawatperawat(){
        return perawat;

    }
    public void setPerawat(Perawat perawat){
        this.perawat = perawat;
    }

    public Pendaftaran getPendaftaranpendaftaran(){
        return pendaftaran;

    }
    public void setPendaftaran(Pendaftaran pendaftaran){
        this.pendaftaran = pendaftaran;
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
