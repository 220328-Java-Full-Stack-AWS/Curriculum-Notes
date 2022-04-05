package model;

import exceptions.OverCreditException;

import java.util.Date;

public class DiscoverCustomer extends Customer implements Discover{

    private double cashBack;
    private int miles;


    public DiscoverCustomer(String first, String last, String address, long accountNumber, Date experationDate, short securityCode, int social, double creditLimit) {
        super(first, last, address, accountNumber, experationDate, securityCode, social, creditLimit);
    }

    @Override
    public void purchase(String kind, double amount) throws OverCreditException{
        if(balance + amount > creditLimit){
            //If we wanted to have some custom exception message, we could include it in the constructor when
            //throwing a new exception
            throw new OverCreditException();
        }
        balance += amount;
    }

    @Override
    public void calculateInterest() {
        balance = balance * 1.25;
    }

    @Override
    public double newAccountCredit() {
        return 2.50;
    }

    @Override
    public double calculateCashBack(double amountSpent) {
        cashBack += amountSpent * .02;
        return amountSpent * .02;
    }

    @Override
    public int milesEarned(double amountSpent) {
        miles += miles + Math.floor(amountSpent);
        return miles;
    }

    public double getBalance(){
        return balance;
    }
}
