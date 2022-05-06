package services;

import things.SpaceShip;

public class SpacersGuild {
    private int spiceReserves;
    private SpiceMarket spiceMarket;
    private int hiddenSpice = 0;

    public SpacersGuild(int spice) {
        this.spiceReserves = spice;
    }

    public SpiceMarket getSpiceMarket() {
        return spiceMarket;
    }

    public void setSpiceMarket(SpiceMarket spiceMarket) {
        this.spiceMarket = spiceMarket;
    }

    public int getHiddenSpice() {
        return hiddenSpice;
    }

    public void setHiddenSpice(int hiddenSpice) {
        this.hiddenSpice = hiddenSpice;
    }

    public String voyage(SpaceShip vessel, String destination, String departure) {
        if(vessel.getLocation().equals(departure)) {
            vessel.setLocation(destination);
            return "Vessel: " + vessel.getName() + " has arrived at " + destination;
        } else {
            return "Error! Vessel: " + vessel.getName() + " is not located at " + departure;
        }
    }

    public String plotAndScheme(String orders) {
        switch(orders) {
            case "steal spice":
                spiceReserves++;
                return "Spice stolen!";
            case "hide spice":
                spiceReserves--;
                hiddenSpice++;
                return "Spice hidden!";
            case "betray Duke Leto":
                hiddenSpice = 0;
                spiceReserves--;
                return "House Atreides has fallen.";
            case "sabotage spice production":
                spiceMarket.sabotage(10);
                spiceReserves--;
                return "10% of strategic spice burned";

        }
        return "I don't understand my orders";
    }

    public int getSpiceReserves() {
        return spiceReserves;
    }

    public void setSpiceReserves(int spiceReserves) {
        this.spiceReserves = spiceReserves;
    }
}
