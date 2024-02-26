/*

Bei der if-Anweisung:
"Falls es Schokolade gibt ..." bedeutet, dass der nachfolgende Codeblock genau einmal ausgeführt wird,
wenn die Bedingung (das Vorhandensein von Schokolade) erfüllt ist.

Bei der while-Schleife:
"Solange es Schokolade gibt ..." impliziert, dass der nachfolgende Codeblock wiederholt ausgeführt wird,
solange die Bedingung (das Vorhandensein von Schokolade) wahr ist.
Die Schleife wird beendet, sobald keine Schokolade mehr vorhanden ist (die Bedingung wird falsch).

*/

import java.util.Scanner;

public class C_09_KontrollstrukturenUnterschiedForWhile {
    public static void main(String[] args) {

        // for(Anfangswert; Abbruchbedingung; Zähler){
        //      }
        //
        // while(Bedingung){
        //          }

        // for(int i = 1; i <= 5; i++) {
        //      System.out.println("Astroid wurde erstellt Nr: " + i);
        // }

        Scanner scan = new Scanner(System.in);
        System.out.println("Drücke 1 für Schwierigkeitsgrad leicht \nDrücke 2 für Schwierigkeitsgrad Mittel");

        int userEingabe = scan.nextInt();
        int anzahlGegner = 0;

        if (userEingabe == 1) {
            anzahlGegner = 10;
        } else if (userEingabe == 2) {
            anzahlGegner = 15;
        }

        while (anzahlGegner != 0) {
            System.out.println("Gegner erstellt!");
            anzahlGegner--;
        }
    }
}