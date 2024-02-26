/*

    Der nachfolgende Code illustriert die Nutzung der Scanner-Klasse in Java, um Daten vom Standard-Eingabestrom, in der Regel die Tastatur, einzulesen.
    Ein Scanner-Objekt wird erstellt, um Benutzereingaben zu erfassen und zu verarbeiten.

    Funktionsweise:
    - Ein Scanner-Objekt wird initialisiert, um Benutzereingaben zu verarbeiten.
    - Der Benutzer wird aufgefordert, eine Reihe von Daten einzugeben: einen Namen (String), ein Geschlecht (char), ein Alter (int) und eine Mobiltelefonnummer (long).
    - Nach der Eingabe werden die eingegebenen Daten in der Konsole ausgegeben.
    - Das Scanner-Objekt wird nach der Nutzung geschlossen, um die Ressourcen freizugeben.

    Eingabebeispiel:
    - Der Benutzer gibt zuerst einen Namen ein, gefolgt von einem einzelnen Buchstaben für das Geschlecht, einem Alter und schließlich einer Mobiltelefonnummer.

    Unterstützte Eingabetypen durch die Scanner-Klasse:
    - nextInt(): Liest eine Ganzzahl vom Typ int.
    - nextFloat(): Liest eine Fließkommazahl vom Typ float.
    - nextDouble(): Liest eine Fließkommazahl vom Typ double.
    - nextLong(): Liest eine Ganzzahl vom Typ long.
    - nextShort(): Liest eine Ganzzahl vom Typ short.
    - next(): Liest das nächste Wort (bis zum nächsten Leerzeichen).
    - nextLine(): Liest eine vollständige Zeile Text.
    - nextBoolean(): Liest einen Booleschen Wert (true oder false).

*/

import java.util.Scanner;

public class B_06_InputOutput_TestII {
    public static void main(String[] args) {

        // Initialisierung des Scanner-Objekts für die Eingabe
        Scanner scanner = new Scanner(System.in);

        // Einlesen der Benutzerdaten
        String name = scanner.nextLine(); // Liest eine Zeile Text (den Namen).
        char geschlecht = scanner.next().charAt(0); // Liest das nächste Wort und nimmt das erste Zeichen als Geschlecht.
        int age = scanner.nextInt(); // Liest eine Ganzzahl (das Alter).
        long mobileNumber = scanner.nextLong(); // Liest eine lange Ganzzahl (die Mobiltelefonnummer).

        // Schließen des Scanner-Objekts
        scanner.close();

        // Ausgabe der eingelesenen Benutzerdaten
        System.out.println("Name: " + name);
        System.out.println("Geschlecht:" + geschlecht);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number " + mobileNumber);
    }
}