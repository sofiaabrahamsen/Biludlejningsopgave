package com.company;

import java.util.ArrayList;

public class Garage {
    //oprettelse af et arraylist med biler
    private ArrayList<Bil> biler = new ArrayList<>();

    //attributter
    private String navn;

    //konstruktør
    public Garage(String name) {
        this.navn = navn;
    }

    // metode der tilføjer biler til bilparken
    public void addBil(Bil bil) {
        biler.add(bil);
    }

    //beregn totale afgift for bilerne i garagen metode
    public double beregnGrønEjerAfgiftForBilpark() {
        double grønEjerAfgiftforBilpark = 0;

        for (int i = 0; i < biler.size(); i++) {
            grønEjerAfgiftforBilpark = grønEjerAfgiftforBilpark + biler.get(i).beregnGrønEjerafgift();
        }
        return grønEjerAfgiftforBilpark;
    }

    public String getNavn() {
        return navn;
    }

    // override toString metode der udskriver alle bilerne der holder i garagen.
    @Override
    public String toString() {
        String s = "Biler i " + getNavn() + "\n";

        for (int i = 0; i < biler.size(); i++) {
            s = s + "RegNr:" + biler.get(i).getRegNr() + " "
                    + "Brand:" + biler.get(i).getMærke() + " "
                    + "Model:" + biler.get(i).getModel() + " "
                    + "Årgang:" + biler.get(i).getÅrgang() + " "
                    + "Antal døre:" + biler.get(i).getAntalDøre()
                    + "\n";
        }
        return s;

    }
}
