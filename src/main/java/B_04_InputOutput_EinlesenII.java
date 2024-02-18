/*
    Aufgabe:
    Dieses Programm liest zwei Benutzereingaben ein: eine Ganzzahl (int) für das Alter und eine Zeichenkette (string) für den Namen.
    Nach der Eingabe werden das Alter und der Name in der Konsole ausgegeben.

    Implementierungsdetails:
    - Ein Scanner-Objekt wird initialisiert, um Benutzereingaben aus dem Standard-Eingabestrom (in der Regel die Tastatur) zu lesen.
    - Das Programm fordert den Benutzer auf, sein Alter einzugeben, und liest diese Eingabe als Ganzzahl (int) ein.
    - Um den Zeilenumbruch, der nach der Eingabe des Alters im Eingabestrom verbleibt, zu konsumieren, wird eine zusätzliche scanner.nextLine()-Anweisung verwendet.
    - Anschließend fordert das Programm den Benutzer auf, seinen Namen einzugeben, und liest diese Eingabe als Zeichenkette (String).
    - Das Alter und der Name des Benutzers werden dann zusammen in der Konsole ausgegeben.
    - Schließlich wird das Scanner-Objekt mit der Methode close() geschlossen, um die damit verbundenen Systemressourcen freizugeben.

*/

import java.util.Scanner; // Import der Scanner-Klasse aus dem java.util-Paket
public class B_04_InputOutput_EinlesenII {

    public static void main(String[] args) {

        // Initialisierung eines Scanner-Objekts für die Eingabe
        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung für das Alter und Einlesen des Alters
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        // Konsumiere die verbleibende Zeilenumbruch-Eingabe
        scanner.nextLine();

        // Eingabeaufforderung für den Namen und Einlesen des Namens
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        // Ausgabe des Alters und des Namens
        System.out.println("Ihr Name ist " + name + ", und Sie sind " + alter + " Jahre alt.");

        // Scanner-Objekt schließen, um Ressourcen freizugeben
        scanner.close();
    }
}