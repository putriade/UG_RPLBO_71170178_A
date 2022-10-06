package com.ug6.soal1;

import java.util.ArrayList;

class VendingMachines {
    private String code;
    private int capacity = 0, usedCapacity = 0;
    private double consumerMoney = 0.d;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;

    public VendingMachines(String vmCode, int vmCapacity, ArrayList<Goods> goods, ArrayList<Double> acceptanceBalance) {
        this.code = "";
        this.goods = new ArrayList<>();
        this.acceptanceBalance = new ArrayList<>();
    }
    public VendingMachines(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
        goods = new ArrayList<>();
        acceptanceBalance = new ArrayList<>();
    }

    public void VendingMachines(String code, int capacity, ArrayList<Goods> goods, ArrayList<Double> acceptanceBalance) {
        this.code = code;
        this.capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance = acceptanceBalance;
    }


    public void setUsedCapacity(int i) {
    }

    public int getUsedCapacity() {
        return capacity;
    }

    public int getCapacity() {
        return 0;
    }

    public String getCode() {
        return code;
    }


    public ArrayList<Goods> getGoods() {
        return goods;
    }

    ArrayList <Double> AcceptanceBalance() {
        return acceptanceBalance;
    }

    public boolean takeMoney(double money) {

        return false;
    }

    public void proceedOrder(String code, int orderQuantity) {
    }

    public void withdrawMoney() {
    }
}