import java.util.Scanner;

public class Z_06_Adventure {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Willkommen bei unserem kleinen Adventure im Wald!");
        System.out.println("Du befindest dich in einem dunklen Wald...");

        int lebensPunkte = 100;
        int muenzen = 0;

        while (lebensPunkte > 0) {
            System.out.println("\nWas möchtest du tun?");
            System.out.println("1. Gehe weiter in den Wald");
            System.out.println("2. Suche nach Schätzen");
            System.out.println("3. Raste und heile dich");
            System.out.println("4. Beende das Spiel");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Du gehst weiter in den Wald...");
                    int schadenErhalten = (int) (Math.random() * 20);
                    lebensPunkte -= schadenErhalten;
                    System.out.println("Du hast " + schadenErhalten + " Schaden genommen. Deine aktuelle Gesundheit: " + lebensPunkte);
                    break;
                case 2:
                    int schatzGefunden = (int) (Math.random() * 50) + 1;
                    muenzen += schatzGefunden;
                    System.out.println("Du hast " + schatzGefunden + " Münzen gefunden. Deine aktuelle Münzen: " + muenzen);
                    break;
                case 3:
                    int gesundheitWiederherstellen = (int) (Math.random() * 30) + 10;
                    lebensPunkte += gesundheitWiederherstellen;
                    System.out.println("Du hast dich um " + gesundheitWiederherstellen + " geheilt. Deine aktuelle Gesundheit: " + lebensPunkte);
                    break;
                case 4:
                    System.out.println("Das Spiel wurde beendet.");
                    return;
                default:
                    System.out.println("Ungültige Auswahl. Bitte wähle erneut.");
            }

            if (lebensPunkte <= 0) {
                System.out.println("Du bist gestorben! Game Over.");
            } else if (muenzen >= 100) {
                System.out.println("Herzlichen Glückwunsch! Du hast genug Münzen gesammelt, um das Spiel zu gewinnen.");
                System.out.println("Du hast " + muenzen + " Münzen gesammelt. Du hast gewonnen!");
                return;
            }
        }
    }
}