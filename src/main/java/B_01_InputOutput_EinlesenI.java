import java.util.Scanner;
public class B_01_InputOutput_EinlesenI {

    public static void main(String[] args) {

        // Initialisierung eines Scanner-Objekts für die Eingabe
        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung und Einlesen einer Zahl
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        double zahl = scanner.nextDouble();
        System.out.println("Eingegebene Zahl: " + zahl);

        // Scanner-Objekt wird wiederverwendet, um zusätzliche Eingaben zu lesen
        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = scanner.next(); // Liest das nächste Token als String
        System.out.print("Geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt(); // Liest die nächste Ganzzahl

        // Ausgabe der eingegebenen Informationen
        System.out.println("Ihr Name: " + name + ", Ihr Alter: " + alter);

        // Scanner-Objekt schließen, um Ressourcen freizugeben
        scanner.close();
    }
}