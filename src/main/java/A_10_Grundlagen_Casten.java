/*
    In Java bezeichnet "Cast" eine Operation, bei der ein Objekt oder eine Variable eines bestimmten Datentyps in einen anderen Datentyp umgewandelt wird.
    Casting ist besonders wichtig, da Java eine streng typisierte Sprache ist, was bedeutet, dass jede Variable und jeder Ausdruck einen festgelegten Datentyp hat,
    und Operationen in der Regel nur mit Werten desselben Typs oder mit Werten durchgeführt werden können, die in kompatible Typen konvertiert werden können.


    Es gibt zwei Arten von Casting in Java:

    1. Implizites Casting (Widening Cast):
    Hierbei wird eine Variable automatisch in einen größeren, kompatiblen Datentyp umgewandelt. Java führt implizites Casting durch,
    wenn der Zieltyp größer ist als der Quelltyp, was bedeutet, dass keine Daten verloren gehen.
    Zum Beispiel kann ein int automatisch in ein long oder ein float in ein double umgewandelt werden.

        int meinInt = 100;
        long meinLong = meinInt;  // Implizites Casting von int zu long

    2. Explizites Casting (Narrowing Cast):
    Dies erfordert, dass der Programmierer manuell spezifiziert, in welchen Typ die Variable umgewandelt werden soll.
    Explizites Casting wird benötigt, wenn der Zieltyp kleiner ist als der Quelltyp, was zu einem potenziellen Datenverlust führen kann.
    Dies wird durch Voranstellen des Zieltyps in Klammern vor den Wert oder die Variable erreicht.

        double meinDouble = 9.78;
        int meinInt = (int) meinDouble; // Explizites Casting von double zu int

    Beim expliziten Casting von Referenztypen (z.B. beim Casting zwischen verschiedenen Objekttypen) muss sichergestellt werden,
    dass das Objekt im Speicher tatsächlich in den gewünschten Typ umgewandelt werden kann.
    Andernfalls kann es zur Laufzeit zu einer ClassCastException kommen.

        Object obj = "Hallo Welt!";
        String str = (String) obj;  // Explizites Casting von Object zu String

    Beim Umgang mit Casting ist Vorsicht geboten, insbesondere beim expliziten Casting, da dies zu Datenverlust oder zu Laufzeitfehlern führen kann,
    wenn die Typumwandlung nicht zulässig ist.
 */

public class A_10_Grundlagen_Casten {

    public static void main(String[] args) {
        //BingoBongo

        /*Was ist eine Typumwandlung / Casten?
         *
         * Das ist eine Umwandlung von einem Datentypen in einen anderen Datentypen
         */

        int userAlter = (int) 18.5; // (int) = castoperator
        System.out.println(userAlter);


        // Implizites Casten (von klein nach groß) Keine Datenverluste
        // Umwandlung findet bei Zuweisung statt
        int zahl1 = 30;
        double zahl2 = zahl1;
        System.out.println(zahl2);


        // Explizite Casten (von groß nach klein) Datenverluste
        // Umwandlung findet mit Hilfe des cast (Datentyp)-Operators statt

        // 1. Auto = 3450,45 € 2. Auto = 2690,94 €
        int autoPreis1 = (int) 3450.45;
        int autoPreis2 = (int) 2690.94;

        int gesamtPreis = autoPreis1 + autoPreis2;
        System.out.println(gesamtPreis);


    }

}
