package com.rplbo.utsnota;
import java.util.Scanner;

public class BukuTulis extends Barang {
    private String merk;

    public BukuTulis(String deskripsi, int harga, int berat, String kodebarang, String merk) {
        super(deskripsi, harga, berat, kodebarang);
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void getInformasi(){

    }
}
