package org.register;

public class UsernameException extends Exception{
    private int erorCode;
    private String erorMessage;

    public UsernameException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (erorCode == 1) {
            this.erorMessage = "Input name tidak boleh kosong!";
        } else if (erorCode == 2) {
            this.erorMessage = "Username minimal harus terdiri dari 6 karakter";
        }
    }

    public UsernameException(String erorMessage){
        super(erorMessage);
    }

    public int getErorCode(){
        return this.erorCode;
    }

    public String getErorMessage(){
        return this.erorMessage;
    }

}
