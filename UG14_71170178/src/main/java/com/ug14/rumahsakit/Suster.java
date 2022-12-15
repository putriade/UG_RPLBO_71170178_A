package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String siti) {
    }

    public void idSuster() {
    }

    public String getNama(){
        return nama;

    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusScreening() == false){
            System.out.println("SILAHKAN MENDAFTAR TERLEBIH DAHULU");
        }else{
            jadwal.sudahScreening();
        }
    }
}
