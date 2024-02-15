import java.util.Scanner;
public class B_01_InputOutput_EinlesenI {

    public static void main(String[] args) {

        // Scanner-Objekt für Benutzereingaben initialisieren
        Scanner scanner = new Scanner(System.in);

        // Aufforderung zur Eingabe einer Zahl und Einlesen dieser Zahl
        System.out.print("Bitte geben Sie eine beliebige Zahl ein: ");
        double eingegebeneZahl = scanner.nextDouble();
        System.out.println("Sie haben die Zahl " + eingegebeneZahl + " eingegeben.");

        // Weiterverwendung des Scanner-Objekts für zusätzliche Eingaben
        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        String vorname = scanner.next(); // Nächstes Token als String lesen
        System.out.print("Bitte geben Sie Ihr Lebensalter ein: ");
        int lebensalter = scanner.nextInt(); // Nächste Ganzzahl lesen

        // Ausgabe der eingegebenen Daten
        System.out.println("Name: " + vorname + ", Alter: " + lebensalter);

        // Schließen des Scanner-Objekts
        scanner.close();
    }
}