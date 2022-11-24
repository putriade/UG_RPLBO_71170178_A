package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email = "username@gmail.com";
    private String username;

    public InstaPost(){

    }

    public void printInfo(){
        System.out.println("Username : " + this.username);
        System.out.println("Email : " + this.email);
        System.out.println("Total Mention : ");
    }

    public void login(String email) throws EmailException{
        boolean ok = true;
        String regex = "^(.+)@(.+)$";
        this.email = email;
        if(email != email){
            ok = false;
            throw new EmailException(1);
        }

    }

    public void post(String username){

    }
}
