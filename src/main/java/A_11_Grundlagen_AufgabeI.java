/*

    In dem nachfolgenden Code wird eine einfache Aufgabe bearbeitet, bei der es darum geht, verschiedene Arten von Informationen in Variablen zu speichern und diese dann auszugeben.
    Es ist eine Illustration der grundlegenden Konzepte der Java-Programmierung.
    Darunter die Deklaration und Initialisierung von Variablen, die Auswahl geeigneter Datentypen für verschiedene Arten von Daten und die Ausgabe von Informationen auf der Konsole.
    Es ist ein Beispiel für die Handhabung und Präsentation von Daten in einem Java-Programm.

    Klassen-Definition:
    Es wird eine Klasse A_11_Grundlagen_AufgabeI definiert.
    In Java sind Klassen Strukturen, die verwendet werden, um Objekte zu definieren und zu gruppieren.
    Sie können Daten (in Form von Variablen) und Methoden enthalten.

    Main-Methode:
    Innerhalb der Klasse gibt es eine main-Methode, die den Startpunkt des Programms darstellt.
    Der Code innerhalb dieser Methode wird ausgeführt, wenn das Programm gestartet wird.

    Variablen-Deklaration und Initialisierung:
        autoPreis: Eine Variable vom Typ int (Integer, Ganzzahl), die den Preis des Autos in Euro speichert.
        Ganzzahlen sind geeignet für Werte ohne Dezimalstellen.
        personAlter: Eine weitere int-Variable, die das Alter der Person speichert.
        Auch hier ist der Datentyp int passend, da das Alter in ganzen Jahren angegeben wird.
        personVorname und personNachname: Diese beiden Variablen sind vom Typ String, was in Java für Textwerte verwendet wird.
        Sie speichern den Vornamen bzw. den Nachnamen einer Person.

    Ausgabe der Informationen:
    Mit der System.out.println-Methode werden die gespeicherten Informationen ausgegeben.
    Der Text in der Ausgabe kombiniert statischen Text mit den Werten der Variablen, um eine lesbare Nachricht zu bilden:
    "Frau " + personVorname + " " + personNachname + ", Alter: " + personAlter + ", ihr Auto kostet: " + autoPreis + " €".
    Diese Methode verbindet die Textstücke und Variablenwerte zu einem einzigen String und gibt diesen auf der Konsole aus.

*/

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