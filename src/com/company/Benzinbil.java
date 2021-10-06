package com.company;

public class Benzinbil extends Bil {
    //attributter
    private int oktantal;
    private int kmPrL;

    // konstruktør af superklassen Bil
    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    //implementering af beregnGrønEjerafgift() (double) - med specifik udregning for Benzinbil
    @Override
    public double beregnGrønEjerafgift() {
        double kmPrl=getKmPrL();
        double GrønEjerafgift = 0;
        if (kmPrl <= 20 && kmPrl >= 50) {
            GrønEjerafgift = 330;
        } else if (kmPrl <= 15 && kmPrl > 20) {
            GrønEjerafgift = 1050;
        } else if (kmPrl <= 10 && kmPrl > 15) {
            GrønEjerafgift = 2340;
        } else if (kmPrl <= 5 && kmPrl > 10) {
            GrønEjerafgift = 5500;
        } else if (kmPrl > 5) {
            GrønEjerafgift = 10470;
        }
        return GrønEjerafgift;
    }

    // get og set metoder til oktantal
    public int getOktantal() {
        return oktantal;
    }
    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    // get og set metoder til kmPrL
    public int getKmPrL() {
        return kmPrL;
    }
    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    // override toString metode
    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
