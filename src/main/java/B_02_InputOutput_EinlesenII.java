import java.util.Scanner;

public class B_02_InputOutput_EinlesenII {

    public static void main(String[] args) {
        //DingoDongo

        Scanner scan = new Scanner(System.in);

        // Aufgabe
        /*
         * Erstelle erneu ein Objekt der Klasse Scanner
         * und lese 2 Werte mithile dieser Klassse ein
         *
         * 1. ist eine Ganzzahl, die Zahl soll Dein Alter sein
         * 2. ist eine Zeichenkette(String), dein Namen
         *
         * Am Ende sollen Dein Alter und Dein Name in der Konsole ausgegeben werden
         * System.out.println("Name: " +...+ " Alter: " +...)
         */

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Bitte gebe Dein Alter ein:");
        int alter = scan1.nextInt();
        System.out.println("Du bist " + alter + " Jahre alt.");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Bitte gebe Deinen Namen ein:");
        String name = scan2.next();

        System.out.println("Dein Name ist " + name + ", und Du bist " + alter + " Jahre alt.");
    }
}