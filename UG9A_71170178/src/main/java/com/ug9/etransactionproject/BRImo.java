package com.ug9.etransactionproject;
import java.util.Scanner;
import static com.ug9.etransactionproject.Main.formatRupiah;

public class BRImo extends MobileBanking{
    private long feeTransferBank = 6000;
    private int jumlah;
    public BRImo(String nama, long saldo, String noRekening){

    }

    public String getNama(){
        String nama;
        return nama;
    }

    public long getSaldo(){
        long saldo = 0;
        return saldo;
    }

    public String getnoRekening(){
        String noRekening = "";
        return noRekening;
    }

    public void transfer(DigitalPayment dp, long nominal){
        System.out.println("Transfer saldo akan terkena potongan fee " + formatRupiah(feeTransferBank));
        System.out.print("Transfer sedang diproses");
        Main.tunggu(3);
        if(jumlah + feeTransferBank > super.getSaldo()) {
            jumlah += feeTransferBank;
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+formatRupiah(this.getSaldo()-jumlah)+")");
            return;
        }
        super.transfer(DigitalPayment, jumlah);
        this.pay(feeTransferBank);+)
    }
}
