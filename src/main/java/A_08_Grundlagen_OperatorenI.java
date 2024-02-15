/*

    Was sind Operatoren?
    Operatoren ermöglichen es, Operationen auf Variablen und Werten durchzuführen.
    Sie können für Berechnungen, Wertzuweisungen und die Steuerung des Programmflusses verwendet werden.

*/

public class A_08_Grundlagen_OperatorenI {
    public static void main(String[] args) {

        // Initialisierung der Variablen
        int varZahl = 8;
        int zahl1 = 20;
        int zahl2 = 4;
        int ergebnis;

        // Arithmetische Operatoren
        ergebnis = zahl1 + zahl2; // Addition: Addiert zahl1 und zahl2, Ergebnis ist 24
        System.out.println("Addition: " + ergebnis);

        ergebnis = zahl1 - zahl2; // Subtraktion: Subtrahiert zahl2 von zahl1, Ergebnis ist 16
        System.out.println("Subtraktion: " + ergebnis);

        ergebnis = zahl1 * zahl2; // Multiplikation: Multipliziert zahl1 mit zahl2, Ergebnis ist 80
        System.out.println("Multiplikation: " + ergebnis);

        ergebnis = zahl1 / zahl2; // Division: Teilt zahl1 durch zahl2, Ergebnis ist 5
        System.out.println("Division: " + ergebnis);

        // Inkrement- und Dekrement-Operatoren
        varZahl++; // Inkrement: Erhöht varZahl um 1, Ergebnis ist 9
        System.out.println("Inkrement: " + varZahl);

        varZahl--; // Dekrement: Verringert varZahl um 1, Ergebnis ist wieder 8
        System.out.println("Dekrement: " + varZahl);

        // Praktisches Beispiel mit Operatoren
        int energieSchild = 50;
        int schaden = 15;

        // Einfache Subtraktion zur Demonstration
        energieSchild = energieSchild - schaden; // Subtrahiert schaden von energieSchild
        System.out.println("Energie des Schilds nach Treffer: " + energieSchild);

        // Zusammengesetzte Zuweisungsoperatoren
        energieSchild -= schaden; // Subtrahiert schaden von energieSchild und speichert das Ergebnis in energieSchild
        System.out.println("Energie des Schilds nach weiterem Treffer: " + energieSchild);
    }
}