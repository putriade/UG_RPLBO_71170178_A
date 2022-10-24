package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    public Item(KertasHVS){

    }

    public int getJumlahBukuTulis(){
        int jumlahBukuTulis = 0;
        return jumlahBukuTulis;
    }

    public int getJumlahPen(){
        int jumlahPen =0;
        return jumlahPen;
    }

    public Pulpen[] getPen(){
        return pen;
    }

    public int getJumlahKertasHVS(){
        int jumlahKertasHVS = 0;
        return jumlahKertasHVS;
    }

    public BukuTulis[] getBktulis(){
        return bktulis;
    }

    public KertasHVS[] getKrhvs(){
        return krhvs;
    }
}
