package com.rplbo.utsnota;

public class Barang {
    private String deskripsi;
    private String kodebarang;
    private int harga;
    private int berat;

    public Barang(String deskripsi, int harga, int berat, String kodebarang){

    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public String getKodebarang(){
        return kodebarang;
    }

    public void setKodebarang(String kodebarang){
        this.kodebarang = kodebarang;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getBerat(){
        return berat;
    }

    public void setBerat(int berat){
        this.berat = berat;
    }

    public void getInformasi(){

    }


}
