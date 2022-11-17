package org.register;

public class User {
    public static void main (String[] args) throws PasswordException, EmailException, LoginException, UsernameException{
        System.out.println("Selamat datang di toko Ade Putri");
        System.out.println("Silahkan daftarkan diri kamu untuk dapat mengakses menu di Toko Ade Putri");
        String username = System.console().readLine("Username : ");
        String email = System.console().readLine("Email : ");
        char[] pass = System.console().readPassword("Password : ");
        char[] confirmpass = System.console().readPassword("Konfirmasi Password : ");
        String password = new String(pass);
        String conpass = new String (confirmpass);
        String usrname = new String (username);
        String eml = new String (email);

        try {
            if (password.isEmpty()) {
                throw new PasswordException(1);
            }else if (usrname.isEmpty()){
                throw new UsernameException(1);
            }else if (usrname.length() < 6){
                throw new UsernameException(2);
            }else if (eml.isEmpty()){
                throw new EmailException(1);
            }//else if (eml.)
            else if (password.length() < 7) {
                throw new PasswordException(2);
            } else if (password.equals(username)) {
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
                    throw new PasswordException(3);
                }
            }
        }catch (PasswordException e){
            System.out.println ("Eror : " + e.getErorMessage());
        }
    }
}
