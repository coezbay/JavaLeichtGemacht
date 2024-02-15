public class A_12_Grundlagen_AufgabeII {
    public static void main(String[] args) {

        /*
         * Aufgabe:
         * Speichere die Preise von zwei Autos in Variablen und berechne den Gesamtpreis.
         * Beachte dabei, dass der Preis des zweiten Autos als Kommazahl gegeben ist und zu einer Ganzzahl umgewandelt werden muss.
         */

        int auto1Preis = 4600; // Preis des ersten Autos in Euro
        double auto2Preis = 2899.99; // Preis des zweiten Autos als Kommazahl

        // Umwandlung des Preises des zweiten Autos von einer Kommazahl zu einer Ganzzahl
        int auto2PreisGerundet = (int) auto2Preis;

        // Berechnung des Gesamtpreises
        int gesamtpreis = auto1Preis + auto2PreisGerundet;

        // Ausgabe des Gesamtpreises
        System.out.println("Gesamtpreis der Autos: " + gesamtpreis + " €");
    }
}
