import java.util.Scanner;

public class C_05_KontrollstrukturenVerzweigungSwitchUserEingabe {
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

/*

Der hier gezeigte Code ist ein Java-Programm, das eine einfache Benutzerinteraktion und eine Verzweigungslogik mit einer switch-Anweisung verwendet,
um eine Frage zu beantworten. Das Programm fragt den Benutzer, wie viele Bundesländer Deutschland hat und gibt dann basierend auf der Benutzereingabe eine Rückmeldung.

Zusammenfassung:

Einleitung und Fragestellung:
Zu Beginn informiert das Programm den Benutzer mit zwei System.out.println-Anweisungen über die Frage "Wie viele Bundesländer hat Deutschland?" und bietet vier Antwortmöglichkeiten an: 15, 3, 16 oder 30.

Scanner für Benutzereingaben:
Das Programm initialisiert ein Scanner-Objekt namens scan, dass zum Einlesen von Benutzereingaben über die Konsole verwendet wird.
Mit scan.nextInt() liest das Programm die nächste eingegebene ganze Zahl (int) ein, die der Benutzer eingibt.

Switch-Anweisung: Anschließend verwendet das Programm eine switch-Anweisung, um die eingegebene Zahl (userEingabeBundeslaender) zu überprüfen.
Die switch-Anweisung bewertet den Wert der Benutzereingabe und springt zu dem case, der diesem Wert entspricht.

Fallunterscheidungen:
Wenn der Benutzer 15, 30 oder 3 eingibt, führt das Programm den Code im entsprechenden case aus, der eine Nachricht ausgibt: "Das ist leider nicht korrekt.".
Bei einer Eingabe von 16 gibt das Programm die Nachricht "Das ist korrekt :)" aus, da Deutschland tatsächlich 16 Bundesländer hat.
Für alle anderen Eingaben, die nicht explizit als case aufgeführt sind, wird der default-Fall ausgeführt, der die Nachricht "Die Zahl ist nicht bekannt!" ausgibt.

Beendigung der case-Blöcke:
Jeder case-Block endet mit einem Semikolon aka break;-Befehl, der verhindert, dass die Ausführung in den nachfolgenden case-Block übergeht.

*/