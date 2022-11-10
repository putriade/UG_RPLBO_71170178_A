package com.ug9.etransactionproject;
//import static com.ug9.etransactionproject.Main.formatRupiah;
public abstract class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferBank = 6000;
    private int jumlah;
    private int saldo;
    public MobileWallet(String nama, long saldo, String noHp ){
        super();
        //this.nama = nama;
        //this.saldo = saldo;
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank){
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp(){
        return noHp;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(jumlah < 0){
            System.out.println("Maaf input tidak valid");
            return;
        }
        if(jumlah > this.saldo){
            System.out.println("Maaf saldo anda tidak cukup");
            return;
        }
        this.saldo -= jumlah;

    }
}
