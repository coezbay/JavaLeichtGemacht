import java.util.Scanner;

public class C_03B_KontrollstrukturenVerzweigungSwitchUserEingabe {
    public static void main(String[] args) {
        // Dingo Dongo

        // Kontrollstrukturen steuern den Programmablaufplan

        // switch = Fallunterscheidung
        // case = Der Fall

        // (Bedingung) als Bedingung gilt nur ein int, char und String

        System.out.println("Wie viele Bundesländer hat Deutschland?");
        System.out.println("15 oder 3 oder 16 oder 30?");

        Scanner scan = new Scanner(System.in);
        int userEingabeBundeslaender = scan.nextInt();

        switch (userEingabeBundeslaender) {

            case 15, 30, 3: {
                System.out.println("Das ist leider nicht korrekt.");
            }
            break;

            case 16: {
                System.out.println("Das ist korrekt :)");
            }
            break;

            default: {
                System.out.println("Die Zahl ist nicht bekannt!");
            }
        }
    }
}