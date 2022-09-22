package com.ug4.soal1;
import java.awt.*;
import java.util.ArrayList;

public class Bus {
    private String name;
    private Driver driver;
    private final ArrayList <Passenger> passengers = new ArrayList<Passenger>();
    private int usedCapacity=0;
    private double profit =0;
    private final String[] route = {"Kampus UKDW", "Asrama Omah Babadan", "Asrama Teologi"};

    public Bus(String name, Driver driver){
        setName(name);
        setDriver(driver);
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }

    public Driver getDriverriver(){
        return driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public int getCapacity(){
        int capacity = 25;
        return capacity;
    }

    public int getUsedCapacity(){
        return usedCapacity;
    }
    public void setUsedCapacity(int additional){
        this.usedCapacity += additional;
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public double getFares(){
        double fares = 15000;
        return fares;
    }

    public double getProfit(){
        return profit;
    }

    public void setProfit(double profit){
        this.profit += profit;
    }
    public String[] getRoute(){
        return route;
    }

    public boolean checkPassengerBalance( Passenger passenger){
        return passenger.getbalance() >= getFares();
    }

    public void topUpBalance(double balance, Passenger passenger){
        passenger.setBalance((int) balance);
    }
}
