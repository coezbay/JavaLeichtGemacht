import java.util.Scanner;

public class C_07_KontrollstrukturenUnterschiedForWhile {

    public static void main(String[] args) {
        // Dingo Dongo

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
