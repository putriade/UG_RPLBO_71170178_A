package com.ug11.kalkulasirupiah;

import java.util.Scanner;

public class Kalkulasi {
    public static void main(String[] args){
        String tks;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan teks : ");
        String inp;
        inp = Scanner.nextLine();
        System.out.println("Rincian Biaya : ");
        String[] spl = inp.split("");
        int ttl=0;

        for (int i=0;i<spl.length;i++){
            String ch = spl[i];
            if (ch.contains("rp")){
                System.out.println(ch);
                System.out.println(" + ");
                String a=ch.substring(2,4)+ ch.substring(4,8);
            }
        }
        System.out.println("Total : " + ttl);


    }
}
