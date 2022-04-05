package model;

import java.util.Date;

public class ChaseAndDiscoverCustomer extends Customer implements Chase, Discover{

    private double chasePoints;
    private double cashBack;
    private int miles;

    public ChaseAndDiscoverCustomer(String first, String last, String address, long accountNumber, Date experationDate, short securityCode, int social, double creditLimit) {
        super(first, last, address, accountNumber, experationDate, securityCode, social, creditLimit);
    }

    @Override
    public void purchase(String kind, double amount) {
        balance += amount;
        calculatePoints(amount, kind);
    }

    @Override
    public double newAccountCredit() {
        return 4.50;
    }

    @Override
    public double calculateCashBack(double amountSpent) {
        cashBack += amountSpent * .01;
        return cashBack;
    }

    @Override
    public int milesEarned(double amountSpent) {
        miles += miles + Math.floor(amountSpent);
        return miles;
    }

    @Override
    public void chargeYearlyFee(double fee) {
        balance += fee;
    }

    @Override
    public double calculatePoints(double amountSpent, String purchase) {
        switch(purchase){
            case "Food":
                chasePoints += .001 * amountSpent;
                break;
            case "Fuel":
                chasePoints += .05 * amountSpent;
                break;
            case "Travel":
                chasePoints += .01 * amountSpent;
                break;
            default:
                chasePoints += .005;
                break;
        }
        return chasePoints;
    }

    @Override
    public void calculateInterest() {
        balance += balance * 3;
    }

    public double getBalance(){
        return balance;
    }
}
