package com.ug11.instapost;

public class EmailException extends Exception {
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode){
        super();
        this.errorCode = errorCode;
        if (errorCode == 1) {
            this.errorMessage = "Email tidak valid, harus memiliki karakter '@' ";
        } else if (errorCode == 2) {
            this.errorMessage = "Email tidak terdaftar di Google (harus menggunakan gmail.com)";
        }
    }

    public String getErrorMessage(){
        return  this.errorMessage;

    }
}
