
public class D_06_Methoden_Aufgabe {

    public static void main(String[] args) {
        // Dingo Dongo

        /*
         * Aufgabe:
         *
         * 1. Wert: 3.547
         * 2. Wert: 6.354
         *
         * Definiere (erstelle) eine Methode, die als Aufgabe hat, diese zwei Werte zu multiplizieren
         * Diese Werte sollen dabei als Parameter an die Methode übergeben werden
         *
         * Der Wer der errechnet wird, soll dabei zurück gegeben werden, sodass wir den Wert in der Konsole ausgeben können.
         *
         */

        double a = 3.547;
        double b = 6.354;

        double ergebnis = produkt(a, b);
        System.out.println("Der Wert aus der Methode produkt() ist: " + ergebnis);

    }

    public static double produkt(double a, double b) {
        double ergebnis = a * b;

        return ergebnis;
    }

}
