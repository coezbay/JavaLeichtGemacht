import java.util.Scanner;

public class C_03_Kontrollstrukturen_AufgabeVerzweigung {
    public static void main(String[] args) {

        // Kontrollstrukturen steuern den Programmablaufplan

        // if = falls
        // else = ansonsten

        System.out.println("Wie viele Bundesländer hat Deutschland?");
        System.out.println("15 oder 3 oder 16 oder 30?");

        Scanner scan = new Scanner(System.in);
        int userEingabeBundeslaender = scan.nextInt();

        if (userEingabeBundeslaender == 15) {
            System.out.println("Das ist falsch!");
        } else if (userEingabeBundeslaender == 3) {
            System.out.println("Das ist falsch!");
        } else if (userEingabeBundeslaender == 16) {
            System.out.println("Das ist richtig!");
            System.out.println("Wie heißt der Bundespräsident?");
        } else if (userEingabeBundeslaender == 30) {
            System.out.println("Das ist falsch!");
        }
    }
}