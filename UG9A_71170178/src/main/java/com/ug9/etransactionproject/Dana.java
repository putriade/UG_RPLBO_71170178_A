package com.ug9.etransactionproject;
import java.util.Scanner;
import static com.ug9.etransactionproject.Main.formatRupiah;
public class Dana {
    private long danaFeeTransferBank = 6000;
    private int jumlah;

    public Dana(String nama, long saldo, String noHp){

    }

    public void transfer(DigitalPayment dp, long nominal){
        System.out.println("Transfer saldo akan terkena potongan fee " + formatRupiah(danaFeeTransferBank));
        System.out.print("Transfer sedang diproses");
        Main.tunggu(3);
        if(jumlah + danaFeeTransferBank > super.getSaldo()) {
            jumlah += danaFeeTransferBank;
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+formatRupiah(this.getSaldo()-jumlah)+")");
            return;
        }
        super.transfer(MobileWallet, jumlah);
        this.pay(danaFeeTransferBank);+)

    }
}
