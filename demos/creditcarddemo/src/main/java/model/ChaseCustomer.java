package model;

import java.util.Date;

public class ChaseCustomer extends Customer implements Chase{

    private double chasePoints;


    public ChaseCustomer(String first, String last, String address, long accountNumber, Date experationDate, short securityCode, int social, double creditLimit) {
        super(first, last, address, accountNumber, experationDate, securityCode, social, creditLimit);
        chasePoints = 0.0;
    }

    @Override
    public void purchase(String kind, double amount) {
        balance += amount;
        calculatePoints(amount, kind);
    }

    @Override
    public double newAccountCredit() {
        return 2.00;
    }

    @Override
    public void chargeYearlyFee(double fee) {
        this.balance += fee;
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
        balance = balance * 2;
    }

    public double getChasePoints() {
        return chasePoints;
    }

    public void setChasePoints(double chasePoints) {
        this.chasePoints = chasePoints;
    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString() {
        return "ChaseCustomer{" +
                "chasePoints=" + chasePoints +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", social=" + social +
                ", address='" + address + '\'' +
                ", accountNumber=" + accountNumber +
                ", experationDate=" + experationDate +
                ", securityCode=" + securityCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
