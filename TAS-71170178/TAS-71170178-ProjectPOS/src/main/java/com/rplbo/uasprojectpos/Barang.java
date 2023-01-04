package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private int nextNum = 101;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga){
        //nama = nama;
        //stok = stok;
        //harga = harga;

    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public String getKode(){
        return kode;
    }

    public String getNama(){
        return nama;
    }

    public int getStok(){
        return stok;
    }

    public long getHarga(){
        return harga;
    }
}
