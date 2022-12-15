package com.ug14.rumahsakit;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    public Pelayanan(String andi) {
    }

    public int getIdPelayan(){
        return idPelayan;
    }

    public void setIdPelayan(int idPelayan) {
        this.idPelayan = idPelayan;
    }

    public String getNama(){
        return nama;

    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal){
        if(pasien.getStatus().equals("False")){
            jadwal.sudahDaftar();
            System.out.println("Jadwal sudah di masukkan");
        }

    }

    public Pasien registrasi(){

        return null;
    }
}
