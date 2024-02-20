/*

    In dem nachfolgenden Code vergleichen Vergleichsoperatoren Werte.
    Vergleichsoperatoren sind oft in if-else-Anweisungen zu finden, um zu entscheiden, welcher Codeblock ausgeführt werden soll.

*/

public class A_09_Grundlagen_OperatorenII {
    public static void main(String[] args) {

        // Beispiel für Vergleichsoperatoren
        int x = 5;
        int y = 7;
        boolean vergleichErgebnis;

        // Überprüft, ob x größer als y ist
        vergleichErgebnis = x > y;
        System.out.println("Ist x größer als y? " + vergleichErgebnis); // Erwartung: false, weil x kleiner als y ist

        // Beispiel für if-else-Konstrukte
        int schildeRaumschiff = 50; // Schildstärke des Raumschiffs
        boolean schildDurchbrochen = false; // Angabe, ob das Schild durchbrochen wurde

        // Überprüft, ob das Raumschiff Schildstärke verloren hat oder das Schild durchbrochen wurde
        if (schildeRaumschiff <= 0 || schildDurchbrochen) {
            System.out.println("Raumschiff schwer beschädigt"); // Ausführung, wenn schildeRaumschiff 0 oder weniger ist oder schildDurchbrochen true ist
        } else {
            System.out.println("Raumschiff ist sicher, Schildstärke: " + schildeRaumschiff + " Punkte"); // Ausführung, wenn keine Bedingung zutrifft
        }
    }
}