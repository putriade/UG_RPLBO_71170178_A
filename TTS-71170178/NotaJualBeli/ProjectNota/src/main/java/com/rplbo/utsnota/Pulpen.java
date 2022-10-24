package com.rplbo.utsnota;

public class Pulpen extends Barang{

    private String warna;

    public Pulpen(String deskripsi, int harga, int berat, String kodebarang, String warna) {
        super(deskripsi, harga, berat, kodebarang);
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getWarna(){
        return warna;
    }

    public void getInformasi(){

    }
}
