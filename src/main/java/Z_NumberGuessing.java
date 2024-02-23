import java.util.Random;
import java.util.Scanner;

public class Z_NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Willkommen beim Zahlenraten!");
        System.out.println("Ich habe eine Zahl zwischen 1 und 100 gewählt. Versuche, sie zu erraten.");

        while (!hasGuessedCorrectly) {
            System.out.print("Gib deine Vermutung ein: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Die gesuchte Zahl ist größer.");
            } else if (guess > randomNumber) {
                System.out.println("Die gesuchte Zahl ist kleiner.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Glückwunsch! Du hast die Zahl " + randomNumber + " erraten!");
                System.out.println("Du hast " + attempts + " Versuche benötigt.");
            }
        }
        scanner.close();
    }
}

