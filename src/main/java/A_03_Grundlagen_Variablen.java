public class A_03_Grundlagen_Variablen {

    public static void main(String[] args) {
        // Demonstration verschiedener primitiver Datentypen in Java

        // Ganzzahlige Datentypen
        byte kleineZahl = 12; // Sehr kleiner Ganzzahlbereich
        short kurzeZahl = 1024; // Kleiner Ganzzahlbereich
        int ganzeZahl = 50000; // Standard Ganzzahl
        long langeZahl = 123456789L; // Großer Ganzzahlbereich

        // Ausgabe der ganzzahligen Datentypen
        System.out.println("Kleine Zahl (byte): " + kleineZahl);
        System.out.println("Kurze Zahl (short): " + kurzeZahl);
        System.out.println("Ganze Zahl (int): " + ganzeZahl);
        System.out.println("Lange Zahl (long): " + langeZahl);

        // Fließkommazahlen
        float kommaZahl = 5.75f; // Fließkommazahl mit geringerer Präzision
        double doppelteGenauigkeit = 19.99; // Fließkommazahl mit hoher Präzision

        // Ausgabe der Fließkommazahlen
        System.out.println("Komma Zahl (float): " + kommaZahl);
        System.out.println("Doppelte Genauigkeit (double): " + doppelteGenauigkeit);

        // Wahrheitswert
        boolean istVolljaehrig = true; // Kann wahr oder falsch sein

        // Ausgabe des Wahrheitswerts
        System.out.println("Ist volljährig (boolean): " + istVolljaehrig);

        // Zeichen
        char symbol = '@'; // Einzelnes Unicode-Zeichen

        // Ausgabe des Zeichens
        System.out.println("Symbol (char): " + symbol);

        // Demonstration der Variablenaktualisierung
        int punktzahl = 0; // Initialwert
        System.out.println("Anfängliche Punktzahl: " + punktzahl);

        punktzahl = 50; // Aktualisierung
        System.out.println("Aktualisierte Punktzahl: " + punktzahl);

        punktzahl += 50; // Weitere Erhöhung
        System.out.println("Endgültige Punktzahl: " + punktzahl);
    }
}