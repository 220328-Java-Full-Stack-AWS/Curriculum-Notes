package model;

import exceptions.InvalidBalancePaymentException;

import javax.swing.table.TableRowSorter;
import java.util.Date;

//To make a class abstract just add the abstract keyword
public abstract class Customer {

    protected String first;
    protected String last;
    protected int social;
    protected String address;
    protected long accountNumber;
    protected Date experationDate;
    protected short securityCode;
    protected double balance;
    protected double creditLimit;

    public Customer(String first, String last, String address, long accountNumber, Date experationDate, short securityCode, int social, double creditLimit){
        this.first = first;
        this.last = last;
        this.address = address;
        this.accountNumber = accountNumber;
        this.experationDate = experationDate;
        this.securityCode = securityCode;
        this.social = social;
        this.balance = 0.0;
        this.creditLimit = creditLimit;
    }

    public void payBalance(double amount){
        if(amount <0 || amount >balance){
            throw new InvalidBalancePaymentException();
        } else{
            balance = balance - amount;
        }
    }

    public abstract void purchase(String kind, double amount) throws Exception;

    public abstract void calculateInterest();
}
