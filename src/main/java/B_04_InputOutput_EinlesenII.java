import java.util.Scanner;
public class B_04_InputOutput_EinlesenII {

    public static void main(String[] args) {

        // Aufgabe:
        // Einlesen von zwei Benutzereingaben: eine Ganzzahl für das Alter und eine Zeichenkette für den Namen.
        // Anschließend sollen das Alter und der Name in der Konsole ausgegeben werden.

        // Initialisierung eines Scanner-Objekts für die Eingabe
        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung für das Alter und Einlesen des Alters
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        // Konsumiere die verbleibende Zeilenumbruch-Eingabe
        scanner.nextLine();

        // Eingabeaufforderung für den Namen und Einlesen des Namens
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        // Ausgabe des Alters und des Namens
        System.out.println("Ihr Name ist " + name + ", und Sie sind " + alter + " Jahre alt.");

        // Scanner-Objekt schließen, um Ressourcen freizugeben
        scanner.close();
    }
}