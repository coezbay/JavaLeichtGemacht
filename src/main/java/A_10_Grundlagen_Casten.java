/*

    Casting in Java

    In Java bezeichnet "Casting" die Umwandlung eines Wertes von einem Datentyp in einen anderen.
    Dies ist besonders relevant, da Java eine streng typisierte Sprache ist, in der jede Variable und jeder Ausdruck einen festgelegten Datentyp hat.
    Operationen sind in der Regel nur mit Werten desselben Typs oder Werten möglich, die in kompatible Typen umgewandelt werden können.

    Es gibt zwei Hauptarten von Casting in Java:

    1. Implizites Casting (Widening Cast):
       Automatische Umwandlung einer Variable in einen größeren, kompatiblen Datentyp ohne Datenverlust.
       Zum Beispiel: Ein 'int' wird automatisch in ein 'long' umgewandelt.

    2. Explizites Casting (Narrowing Cast):
       Erfordert eine manuelle Spezifikation des Zieltyps durch den Programmierer, besonders wenn der Zieltyp kleiner ist als der Quelltyp.
       Dies kann zu Datenverlust führen und wird durch Voranstellen des Zieltyps in Klammern erreicht.

*/

public class A_10_Grundlagen_Casten {
    public static void main(String[] args) {
        // Beispiel für explizites Casting
        double initialAlter = 18.5;
        int gerundetesAlter = (int) initialAlter; // Casting von 'double' zu 'int' entfernt Nachkommastellen
        System.out.println("Gerundetes Alter: " + gerundetesAlter);

        // Beispiel für implizites Casting
        int kleineZahl = 30;
        double grosseZahl = kleineZahl; // Implizites Casting von 'int' zu 'double'
        System.out.println("Größere Zahl (implizites Casting): " + grosseZahl);

        // Weitere Beispiele für explizites Casting
        double preisErstesAuto = 3450.45;
        double preisZweitesAuto = 2690.94;

        // Umwandlung von 'double' zu 'int' führt zum Verlust der Nachkommastellen
        int gesamtPreis = (int) preisErstesAuto + (int) preisZweitesAuto;
        System.out.println("Gesamtpreis der Autos: " + gesamtPreis);
    }
}