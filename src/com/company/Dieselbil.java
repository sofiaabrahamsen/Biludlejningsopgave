package com.company;

public class Dieselbil extends Bil {
    //attributter
    private boolean harPartikelfilter;
    private int kmPrl;

    // konstruktør af superklassen Bil
    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrl = kmPrl;
    }

    //implementering af beregnGrønEjerafgift() (double) - med specifik udregning for Dieselbil
    @Override
    public double beregnGrønEjerafgift() {
        double kmPrl = getKmPrl();
        double grønEjerAfgift = 0;
        if (kmPrl <= 20 && kmPrl >= 50) {
            grønEjerAfgift = 330+130;
        } else if (kmPrl <= 15 && kmPrl > 20) {
            grønEjerAfgift = 1050 + 1390;
        } else if (kmPrl <= 10 && kmPrl > 15) {
            grønEjerAfgift = 2340+1850;
        } else if (kmPrl <= 5 && kmPrl > 10) {
            grønEjerAfgift = 5500+2770;
        } else if (kmPrl > 5) {
            grønEjerAfgift = 10470+15260;
        }
        if (isHarPartikelfilter() == false) {
            grønEjerAfgift = grønEjerAfgift+1000;
        }
        return grønEjerAfgift;
    }

    // get og set metoder til harPartikelfilter
    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }
    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    // get og set metoder til kmPrL
    public int getKmPrl() {
        return kmPrl;
    }
    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    // override toString metode
    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrl +
                '}';
    }
}
