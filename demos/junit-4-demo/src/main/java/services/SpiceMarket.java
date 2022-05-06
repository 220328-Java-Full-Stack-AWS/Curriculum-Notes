package services;

public class SpiceMarket {
    private int availableSpice = 100;

    public int sabotage(int amount) {
        this.availableSpice -= amount;
        return this.availableSpice;
    }
}