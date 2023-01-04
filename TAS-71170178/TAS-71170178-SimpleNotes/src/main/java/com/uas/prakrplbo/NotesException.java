package com.uas.prakrplbo;

public class NotesException extends Throwable {
    private int errCode;
    private String errMessage;
    public NotesException(String errMessage){
        super();
        this.errCode = errCode;
        if (errCode == 1) {
            this.errMessage = "Note tidak boleh kosong!";
        } else if (errCode == 2) {
            this.errMessage = "Keyword tidak boleh kosong!";
        }
    }

    public EmailException(String errMessage){
        super(errMessage);
    }

    public int getErrCode(){
        return this.errCode;
    }

    public String getErrMessage(){
        return this.errMessage;
    }

    public boolean getMessage() {
    }
}
