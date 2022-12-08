package com.ug13.sakitrumah;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String budi, String organ_dalam, String a123) {

    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getSpesialis(){
        return spesialis;
    }

    public void setSpesialis(String spesialis){
        this.spesialis = spesialis;
    }

    public String getRuangan(){
        return ruangan;
    }

    public void setRuangan(String ruangan){
        this.ruangan = ruangan;
    }

    public void memeriksa (Pengunjung pengunjung, Jadwal jadwal){
        if(jadwal.getStatusScreening() == false){
            System.out.println("SILAHKAN MELAKUKAN PEMBAYARAN TERLEBIH DAHULU");
        }else{
            pengunjung.setLevelPenyakit();
            if(pengunjung.getLevelPenyakit()==0){
                pengunjung.sembuh();
            }
        }

    }

    public void cekStatus (Pengunjung pengunjung){
        if(pengunjung.getStatus().equals("False")){
            System.out.println("ANDA MASIH SAKIT");
        }else{
            System.out.println("ANDA SUDAH SEHAT ALHAMDULILAH");
        }

    }
}
