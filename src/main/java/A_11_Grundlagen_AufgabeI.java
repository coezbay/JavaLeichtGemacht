public class A_11_Grundlagen_AufgabeI {
    public static void main(String[] args) {

        /*
         * Aufgabe:
         * Definiere Variablen für folgende Informationen und gib sie aus:
         * 1. Preis des Autos
         * 2. Alter der Person
         * 3. Vorname der Person
         * 4. Nachname der Person
         *
         * Bestimme den geeigneten Datentyp für jede Information.
         */

        int autoPreis = 4200; // Preis des Autos in Euro
        int personAlter = 25; // Alter der Person
        String personVorname = "Anna"; // Vorname der Person
        String personNachname = "Schmidt"; // Nachname der Person

        // Ausgabe der gesammelten Informationen
        System.out.println("Frau " + personVorname + " " + personNachname + ", Alter: " + personAlter + ", ihr Auto kostet: " + autoPreis + " €");

    }
}