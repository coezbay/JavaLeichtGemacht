/*

    Der nachfolgende Code illustriert, wie man mit der Scanner-Klasse bzw. dem Scanner Objekt Benutzereingaben einlesen kann.
    Auch zeigt der Code die Verwendung verschiedener Methoden zum Lesen unterschiedlicher Datentypen (String, double, int).

    Import-Anweisung:
    Der Code beginnt mit import java.util.Scanner;, was bedeutet, dass die Scanner-Klasse aus dem java.util-Paket importiert wird, um sie im Programm verwenden zu können.
    Die Scanner-Klasse wird häufig für das Einlesen von Eingaben aus verschiedenen Quellen wie Konsoleneingaben verwendet.

    Klassen-Definition:
    Der Code definiert eine Klasse mit dem Namen B_01_InputOutput_EinlesenI.
    In Java sind Klassen die Grundbausteine, in denen Methoden und Variablen definiert sind.

    Main-Methode:
    Innerhalb der Klasse befindet sich die main-Methode, die den Einstiegspunkt für das Programm darstellt.
    Der Code innerhalb dieser Methode wird ausgeführt, wenn das Programm gestartet wird.

    Initialisierung des Scanner-Objekts:
    Ein Scanner-Objekt namens scanner wird erstellt und mit System.in initialisiert, was bedeutet, dass der Scanner für die Eingabe von Daten über die Konsole (Standard-Eingabe) konfiguriert ist.

    Benutzereingabe für eine Zahl:
    Der Benutzer wird aufgefordert, eine Zahl einzugeben.
    Die Methode scanner.nextDouble() liest die nächste eingegebene Fließkommazahl und speichert sie in der Variablen eingegebeneZahl.
    Anschließend wird die eingegebene Zahl mit einer Bestätigungsnachricht ausgegeben.

    Benutzereingabe für einen Vornamen:
    Der Benutzer wird aufgefordert, seinen Vornamen einzugeben.
    Die Methode scanner.next() liest das nächste Token der Eingabe als String und speichert es in der Variablen vorname.

    Benutzereingabe für das Lebensalter:
    Der Benutzer wird aufgefordert, sein Lebensalter einzugeben.
    Die Methode scanner.nextInt() liest die nächste eingegebene Ganzzahl und speichert sie in der Variablen lebensalter.

    Ausgabe der Benutzerdaten:
    Die eingegebenen Daten (Vorname und Lebensalter) werden in einer formatierten Ausgabe auf der Konsole angezeigt.

    Schließen des Scanner-Objekts:
    Am Ende des Programms wird das Scanner-Objekt mit der Methode scanner.close() geschlossen.
    Dies ist eine gute Praxis, um Ressourcen freizugeben, die der Scanner möglicherweise belegt hat.

*/

import java.util.Scanner;
public class B_01_InputOutput_EinlesenI {

    public static void main(String[] args) {

        // Scanner-Objekt für Benutzereingaben initialisieren
        Scanner scanner = new Scanner(System.in);

        // Aufforderung zur Eingabe einer Zahl und Einlesen dieser Zahl
        System.out.print("Bitte geben Sie eine beliebige Zahl ein: ");
        double eingegebeneZahl = scanner.nextDouble();
        System.out.println("Sie haben die Zahl " + eingegebeneZahl + " eingegeben.");

        // Weiterverwendung des Scanner-Objekts für zusätzliche Eingaben
        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        String vorname = scanner.next(); // Nächstes Token als String lesen
        System.out.print("Bitte geben Sie Ihr Lebensalter ein: ");
        int lebensalter = scanner.nextInt(); // Nächste Ganzzahl lesen

        // Ausgabe der eingegebenen Daten
        System.out.println("Name: " + vorname + ", Alter: " + lebensalter);

        // Schließen des Scanner-Objekts
        scanner.close();
    }
}