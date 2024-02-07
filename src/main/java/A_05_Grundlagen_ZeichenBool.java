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