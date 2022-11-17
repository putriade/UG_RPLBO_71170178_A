package org.register;

public class EmailException extends Exception{
    private int erorCode;
    private String erorMessage;

    public EmailException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (erorCode == 1) {
            this.erorMessage = "Input email tidak boleh kosong!";
        } else if (erorCode == 2) {
            this.erorMessage = "Format email harus valid (cth: email@ukdw.com)";
        }
    }

    public EmailException(String erorMessage){
        super(erorMessage);
    }

    public int getErorCode(){
        return this.erorCode;
    }

    public String getErorMessage(){
        return this.erorMessage;
    }
}
