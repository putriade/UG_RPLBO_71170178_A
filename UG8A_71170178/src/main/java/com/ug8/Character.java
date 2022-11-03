package com.ug8;

public abstract class Character implements ObjectAttack{
    private int damage;
    private String name;
    private int health;


    public Character(String name, int damage, int health){

    }

    public Character() {
        
    }

    public void showCharacterInfo(){

    }

    public boolean isDie(int health){
        boolean b = health <= 0;
        return false;
    }

    public void attacked(){

    }


    @Override
    public void attack() {

    }
}
