package org.register;

public class LoginException extends Exception{
    private int erorCode;
    private String erorMessage;

    public LoginException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (erorCode == 1) {
            this.erorMessage = "Input username tidak boleh kosong!";
        } else if (erorCode == 2) {
            this.erorMessage = "Input password tidak boleh kosong";
        } else if (erorCode == 3){
            this.erorMessage = "Username & Password harus sesuai dengan object user yang dibuat ketika melakukan register";
        }
    }

    public LoginException(String erorMessage){
        super(erorMessage);
    }

    public int getErorCode(){
        return this.erorCode;
    }

    public String getErorMessage(){
        return this.erorMessage;
    }
}
