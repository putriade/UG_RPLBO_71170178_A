package org.register;

public class PasswordException extends Exception{
    private int erorCode;
    private String erorMessage;

    public PasswordException(int erorCode){
        super();
        this.erorCode = erorCode;
        if(erorCode==1){
            this.erorMessage="Password tidak boleh kosong!";
        }
        else if(erorCode==2){
            this.erorMessage="Password minimal harus terdiri dari 7 karakter";
        }
        else if(erorCode==3){
            this.erorMessage="Password harus mengandung 1 karakter huruf kecil, huruf besar, simbol & angka";
        }
        else if(erorCode==4){
            this.erorMessage="Password tidak boleh sama dengan username";
        }
        else if(erorCode==5){
            this.erorMessage="Password harus sama dengan username";
        }
    }

    public PasswordException(String erorMessage){
        super(erorMessage);
    }

    public int getErorCode(){
        return this.erorCode;
    }

    public String getErorMessage(){
        return this.erorMessage;
    }
}
