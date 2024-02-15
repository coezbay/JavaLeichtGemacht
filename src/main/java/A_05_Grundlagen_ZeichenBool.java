/*

    Grundlagen bei der Arbeit mit Zeichen - (char) und Booleschen (boolean) Variablen in Java

    Deklaration und Initialisierung einer char-Variablen:
    In den nachfolgenden Code wird die Variable varZeichen mit dem Copyright-Zeichen (©) initialisiert.
    char-Variablen in Java werden verwendet, um einzelne Zeichen zu speichern,
    die in einfache Anführungszeichen eingeschlossen sind.


    Übrigens:
    Da das ©-Zeichen außerhalb des ASCII-Bereichs liegt, sollte man den Unicode-Wert dafür verwenden,
    um es als char zu setzen. Der Unicode-Wert für das ©-Zeichen ist "\u00A9".
    Folglich sieht es im Code dann folgendermaßen aus:

    char copyrightChar = "\u00A9";
    In beiden Fällen kann man die Variable wie jede andere String- oder char-Variable im Java-Code verwenden.


    Ausgabe der char-Variablen:
    Der Wert von varZeichen wird zusammen mit einer Nachricht auf der Konsole ausgegeben,
    was demonstriert, wie man eine char-Variable in einer Zeichenkette (String) integriert.

    Deklaration und Initialisierung einer boolean-Variablen:
    Die Variable userKlick wird als Boolesche Variable deklariert und mit dem Wert true initialisiert,
    was bedeutet, dass sie einen Wahrheitswert darstellt – in diesem Fall, dass der Benutzer "geklickt" hat.

    Verwendung der boolean-Variable in einer bedingten Anweisung:
    Es folgt eine if-Anweisung, die überprüft, ob userKlick true ist.
    Abhängig vom Wahrheitswert von userKlick gibt das Programm entweder aus,
    dass der Benutzer geklickt hat oder nicht.

*/

public class A_05_Grundlagen_ZeichenBool {
    public static void main(String[] args) {
        // Deklaration und Initialisierung einer char-Variablen mit dem Copyright-Zeichen
        char varZeichen = '©';
        System.out.println("Das Bild unterliegt dem " + varZeichen + "-Zeichen");

        // Deklaration und Initialisierung einer boolean-Variablen
        boolean userKlick = true; // Angenommen, der Benutzer hat geklickt

        // Verwendung der boolean-Variable in einer bedingten Anweisung
        if (userKlick) {
            System.out.println("Der Benutzer hat geklickt.");
        } else {
            System.out.println("Der Benutzer hat nicht geklickt.");
        }
    }
}