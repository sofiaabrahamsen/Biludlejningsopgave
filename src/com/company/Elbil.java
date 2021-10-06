package com.company;

public class Elbil extends Bil {
    //attributter
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrKm;

    //konstruktør af superklassen Bil
    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    //implementering af beregnGrønEjerafgift() (double) - med specifik udregning for Elbil
    @Override
    public double beregnGrønEjerafgift() {
    // omregning af whPrKm til kmPrL. man dividere whPrKm med 91,25 og dernæst dividere man dette tal med 100.
        double wattPrKm=getWhPrKm();
        double kmPrl= 100 / (wattPrKm / 91.25);
        double grønEjerAfgift = 0;
        if (kmPrl <= 20 && kmPrl >= 50) {
            grønEjerAfgift = 330;
        } else if (kmPrl <= 15 && kmPrl > 20) {
            grønEjerAfgift = 1050;
        } else if (kmPrl <= 10 && kmPrl > 15) {
            grønEjerAfgift = 2340;
        }else if (kmPrl <= 5 && kmPrl > 10) {
            grønEjerAfgift = 5500;
        }else if (kmPrl > 5){
            grønEjerAfgift = 10470;
        }
        return grønEjerAfgift;
    }

    // get og set metoder til batterikapacitetKWh
    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }
    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    // get og set metoder til maxKm
    public int getMaxKm() {
        return maxKm;
    }
    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    // get og set metoder til whPrKm
    public int getWhPrKm() {
        return whPrKm;
    }
    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    // override toString metode
    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
