package org.register;

public class Login {
    private String username;
    private String email;
    private String password;
    public Login(String username, String email, String password) throws PasswordException{
        String conpass = new String ();
        boolean ok = true;
        this.username = username;
        if(password.isEmpty()){
            ok = false;
            throw new PasswordException(1);
        }else if (password.length() < 7) {
            ok = false;
            throw new PasswordException(2);
        } else if (password.equals(username)) {
            ok=false;
            throw new PasswordException(4);
        }else if (password == conpass){
            throw new PasswordException(5);
        }else{
            boolean flagKecil = false;
            boolean flagBesar = false;
            boolean flagAngka = false;
            boolean flagSimbol = false;
            for (int i=0;i<password.length() ;i++){
                char c = password.charAt(i);
                if(Character.isLetter(c) && Character.isLowerCase(c))
                    flagKecil = true;
                if(Character.isLetter(c) && Character.isUpperCase(c))
                    flagBesar = true;
                if(Character.isDigit(c))
                    flagAngka = true;
                if(Character.isUpperCase(c))
                    flagSimbol = true;
            }
            if (!(flagKecil && flagBesar && flagAngka && flagSimbol)){
                ok=false;
                throw new PasswordException(3);
            }
        }
        if(ok) this.password = password;
        else this.password ="";

    }
    public void show(){
        System.out.println(this.username);
        System.out.println(this.password);
    }

    public  static void main(String[] args){
        try{
            //Login 1 = new Login("ade", "ade");
            1.show();
        }catch (PasswordException p){
            p.printStackTrace();
        }catch (EmailException e){
            e.printStackTrace();
        }catch (UsernameException u){
            u.printStackTrace();
        }catch (LoginException l){
            l.printStackTrace();
        }finally {
            System.out.println("terimakasih");
        }
    }

}
