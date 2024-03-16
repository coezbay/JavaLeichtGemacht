package games_und_anwendungen.multiplayer_ratespiel;

import java.util.Scanner;

public class Z_Player {
    private String name;
    private int attempts;

    public Z_Player(String name) {
        this.name = name;
        this.attempts = 0;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int makeGuess(Scanner scanner, int maxNumber) {
        attempts++;
        System.out.print(name + ", guess a number: ");
        while (!scanner.hasNextInt()) { // Überprüfen, ob die Eingabe eine ganze Zahl ist
            System.out.println("Invalid input! Please enter a valid number.");
            System.out.print(name + ", guess a number: ");
            scanner.next(); // Verwerfen der ungültigen Eingabe
        }
        int guess = scanner.nextInt();
        if (guess > maxNumber || guess < 1) {
            System.out.println("Invalid guess! Please guess a number between 1 and " + maxNumber);
            return makeGuess(scanner, maxNumber);
        }
        return guess;
    }
}