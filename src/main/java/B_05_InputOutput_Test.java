/*

    Der nachfolgende Code illustriert die Nutzung der Scanner-Klasse in Java, um Daten vom Standard-Eingabestrom, in der Regel die Tastatur, einzulesen.
    Ein Scanner-Objekt wird erstellt, um Benutzereingaben zu erfassen und zu verarbeiten.

    - Erstellung eines Scanner-Objekts, das mit System.in verbunden ist, wodurch Eingaben von der Tastatur gelesen werden können.
    - Einlesen einer Ganzzahl (int) vom Benutzer und Ausgabe dieser Zahl auf der Konsole.
    - Schließen des Scanner-Objekts nach der Verwendung, um die damit verbundenen Ressourcen freizugeben.

    Unterstützte Eingabetypen:
    Der Scanner bietet eine Vielzahl von Methoden, um unterschiedliche Datentypen einzulesen, darunter:
    - nextInt(): Liest eine Ganzzahl vom Typ int.
    - nextFloat(): Liest eine Fließkommazahl vom Typ float.
    - nextDouble(): Liest eine Fließkommazahl vom Typ double.
    - nextLong(): Liest eine Ganzzahl vom Typ long.
    - nextShort(): Liest eine Ganzzahl vom Typ short.
    - next(): Liest das nächste verfügbare Wort (bis zum nächsten Leerzeichen).
    - nextLine(): Liest eine Zeile Text bis zum nächsten Zeilenumbruch.
    - nextBoolean(): Liest einen Booleschen Wert (true oder false).

*/

import java.util.Scanner;
public class B_05_InputOutput_Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // System.in = Input = Tastatur

        int zahl = scanner.nextInt();

        System.out.println("Sie haben die Zahl " + zahl + " eingegeben");

        // Schließen des Scanner-Objekts
        scanner.close();

        // Was kann eingelesen werden?

        /*
         * nextInt() - Int
         * nextFloat() - Float
         * nextDouble() - Double
         * nextLong() - Long
         * nextShort() - Short
         * next() - Einzelnes Wort
         * nextLine() - String "Zeichenkette"
         * nextBoolean() - Boolean
         */

    }
}
