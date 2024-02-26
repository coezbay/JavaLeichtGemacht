import java.util.Scanner;

public class C_04_Kontrollstrukturen_Quiz {
    public static void main(String[] args) {

        // Kontrollstrukturen steuern den Programmablaufplan

        // if = falls
        // else = ansonsten

        System.out.println("Wie viele Bundesländer hat Deutschland?");

        Scanner scan = new Scanner(System.in);
        int userEingabeBundeslaender = scan.nextInt();

        int korrekteAnzahlBundeslaender = 16;
        if (userEingabeBundeslaender == 16) {
            System.out.println("Das ist korrekt. Deutschland hat " + korrekteAnzahlBundeslaender + " Bundesländer.");
        } else if (userEingabeBundeslaender >= 17) {
            System.out.println("Das ist leider zu viel. Deutschland hat " + korrekteAnzahlBundeslaender + " Bundesländer und nicht " + userEingabeBundeslaender + ".");
        } else if (userEingabeBundeslaender <= 15) {
            System.out.println("Das ist leider zu wenig. Deutschland hat " + korrekteAnzahlBundeslaender + " Bundesländer und nicht " + userEingabeBundeslaender + ".");
        }
    }
}