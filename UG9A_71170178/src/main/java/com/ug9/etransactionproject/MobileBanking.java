package com.ug9.etransactionproject;

public abstract class MobileBanking extends DigitalPayment{
    private boolean checkfee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(){

    }

    public String getNoRekening(){
        return noRekening;
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

    public boolean isCheckFee(){

    }

    public void setCheckfee(boolean checkfee){
        this.checkfee = checkfee;
    }
}
