package com.ug3.soal1.app;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        Scanner scan = new Scanner (System.in);
        String nama;
        String kadaluarsa;
        int jml;
        int berat;

        System.out.print("Masukkan data product makanan anda");
        System.out.print("Masukkan nama makanan : ");
        nama = scan.nextLine();
        System.out.print("Tanggal kadaluarsa : ");
        kadaluarsa = scan.nextLine();
        System.out.print("Jumlah(qty) :");
        jml = scan.nextInt();
        System.out.print("Berat(gram) :");
        berat = scan.nextInt();

        System.out.println("Nama Makanan = "+nama);
        System.out.println("Tanggal Kadaluarsa = "+kadaluarsa);
        System.out.println("Jumlah(qty) = "+jml);
        System.out.println("Berat = "+berat+ "gram");

    }
}
