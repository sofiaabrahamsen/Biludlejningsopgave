package com.company;

public class Main {

    public static void main(String[] args) {
	    // main metoder der tester programmet.
        // Metoden skal instantiere et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper af bil.
        // skriv alle bilerne ud og kald også beregnGrønAfgiftForBilpark-metoden og skriv resultatet ud.


        Bil bilEl1 = new Elbil("11111111a", "Tesla", "S", 2020, 5);
        Bil bilDiesel1 = new Dieselbil("22222222b", "BMW", "360d", 2020,5);
        Bil bilBenzin1 = new Benzinbil("33333333c", "Toyota", "Aygo", 2015, 5);

        Garage bilpark = new Garage("Sofias Bilpark");
        bilpark.addBil(bilEl1);
        bilpark.addBil(bilDiesel1);
        bilpark.addBil(bilBenzin1);

        System.out.println("Totale grønejerafgift for bilparken: " + bilpark.beregnGrønEjerAfgiftForBilpark() + " DKK ");
        System.out.println(bilpark);
    }
}
