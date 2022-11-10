package com.ug9.etransactionproject;
import java.util.Scanner;
import static com.ug9.etransactionproject.Main.formatRupiah;

public class Ovo extends  MobileWallet{
    private long ovoFeeTransferBank = 6000;
    private int jumlah;

    public Ovo(String nama, long saldo, String noHp){
        super();

    }

    public void transfer(DigitalPayment dp, long nominal){
        System.out.println("Transfer saldo akan terkena potongan fee " + formatRupiah(ovoFeeTransferBank));
        System.out.print("Transfer sedang diproses");
        Main.tunggu(3);
        if(jumlah + ovoFeeTransferBank > super.getSaldo()) {
            jumlah += ovoFeeTransferBank;
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+formatRupiah(this.getSaldo()-jumlah)+")");
            return;
        }
        super.transfer(MobileWallet, jumlah);
        this.pay(ovoFeeTransferBank);+)

    }

}
