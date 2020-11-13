package com.company;

public class BankAccount {
    private String name;
    private int schet;

    BankAccount(String name1, int schet1) {
        schet = schet1;
        name = name1;
    }

    public String getName() {
        return name;
    }

    public int getSchet() {
        return schet;
    }

    public void transfer(int amount, BankAccount bankAccount) {
        if (schet > amount) {
            schet -= amount;
            bankAccount.schet += amount;
        } else {
            System.out.println("Недостаточно денег на счете");
        }
    }

    public void withdraw(int amount) {
        if (schet > amount) {
            schet -= amount;
        } else {
            System.out.println("Недостаточно денег на счете");
        }
    }

    public void putMoney(int amount){
        schet += amount;

    }

    public void reName(String name){
        this.name = name;
    }
}

