package model;

import java.util.Date;

public class DiscoverCustomer extends Customer implements Discover{

    private double cashBack;
    private int miles;


    public DiscoverCustomer(String first, String last, String address, long accountNumber, Date experationDate, short securityCode, int social, double creditLimit) {
        super(first, last, address, accountNumber, experationDate, securityCode, social, creditLimit);
    }

    @Override
    public void purchase(String kind, double amount) {
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
}
