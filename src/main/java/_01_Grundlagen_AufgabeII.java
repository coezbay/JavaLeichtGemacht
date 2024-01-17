public class _01_Grundlagen_AufgabeII {

    public static void main(String[] args) {
        //DingoDongo

        /*
        * Aufgabe
        *
        * 1. Auto kostet: 3500
        * 2. Auto kostet: 2340,48
        *
        * 1. Daten in Variablen abspeichern
        * 2. Kommazahl umwandeln zu einer Ganzzahl
        * 3. Beide Ganzzahlen zu einem Gesamtbetrag verrechnen
        * 4. Gesamtbetrag ausgeben mit Hilfe von System.out.println("");
         */

        int auto1 = 3500;
        int auto2 = (int)2340.48;

        int gesamtbetrag = auto1 + auto2;

        System.out.println( "Gesamtbetrag " + gesamtbetrag + " €");
    }
}
