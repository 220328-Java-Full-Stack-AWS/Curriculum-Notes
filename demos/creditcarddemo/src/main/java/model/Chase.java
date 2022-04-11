package model;

public interface Chase {

    double newAccountCredit();

    void chargeYearlyFee(double fee);

    double calculatePoints(double amountSpent, String purchase);
}
