package com.ug13.sakitrumah;

public class Perawat {
    private String nama;

    public Perawat(String siti) {
    }

    public String getNama(){
        return nama;

    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void screening(Pengunjung pengunjung, Jadwal jadwal){
        if(jadwal.getStatusScreening() == false){
            System.out.println("SILAHKAN MENDAFTAR TERLEBIH DAHULU");
        }else{
            jadwal.sudahScreening();
        }

    }
}
