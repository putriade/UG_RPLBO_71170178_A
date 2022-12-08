package com.ug13.sakitrumah;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String andi) {
    }

    public String getNama(){
        return nama;

    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal){
        if(pengunjung.getStatus().equals("False")){
            jadwal.sudahDaftar();
            System.out.println("Jadwal sudah di masukkan");
        }

    }

    public Pengunjung registrasi(){

        return null;
    }
}
