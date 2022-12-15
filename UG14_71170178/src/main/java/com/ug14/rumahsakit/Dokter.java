package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String budi, String organ_dalam, String a123) {
    }

    public void memeriksa (Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusScreening() == false){
            System.out.println("SILAHKAN MELAKUKAN PEMBAYARAN TERLEBIH DAHULU");
        }else{
            pasien.setLevelPenyakit();
            if(pasien.getLevelPenyakit()==0){
                pasien.sembuh();
            }
        }
    }

    public int getidDokter(){
        return idDokter;
    }

    public void setidDokter(int idDokter){
        this.idDokter = idDokter;
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

    public void cekStatus(Pasien pasien, Jadwal jadwal){
        if(pasien.getStatus().equals("False")){
            System.out.println("ANDA MASIH SAKIT");
        }else{
            System.out.println("ANDA SUDAH SEHAT ALHAMDULILAH");
        }

    }
}
