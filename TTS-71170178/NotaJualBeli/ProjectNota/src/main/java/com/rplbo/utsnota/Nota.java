package com.rplbo.utsnota;

public class Nota {
    private String nota;
    private String notelpembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nota, String notelpembeli, String namapembeli, Item items){
        super();
    }

    public void setNotelpembeli(String notelpembeli){
        this.notelpembeli = notelpembeli;
    }

    public void setNamapembeli(String namapembeli){
        this.namapembeli = namapembeli;
    }

    public void setNota(String nota){
        this.nota = nota;
    }

    public String getNota(){
        return nota;
    }

    public String getNamapembeli(){
        return namapembeli;
    }

    public void tampilNota(){

    }

    public String getNotelpembeli(String notelpembeli){
        return notelpembeli;
    }

    public int hitungTotalBayar(){

        return 0;
    }
}
