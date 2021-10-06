package com.company;

public abstract class Bil {
    //attributter
    private String regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    // konstruktør (dette er superklassen).
    public Bil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;

    }
    // abstrakt metoder der hedder beregnGrønEjerafgift(), som retunere en double
    public abstract double beregnGrønEjerafgift();

    // get og set metoder til regnr
    public String getRegNr() {
        return regNr;
    }
    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    // get og set metoder til mærke
    public String getMærke() {
        return mærke;
    }
    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    // get og set metoder til model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // get og set metoder til årgang
    public int getÅrgang() {
        return årgang;
    }
    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    // get og set metoder til antalDøre
    public int getAntalDøre() {
        return antalDøre;
    }
    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }
}

