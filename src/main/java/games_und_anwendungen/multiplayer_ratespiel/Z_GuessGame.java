package games_und_anwendungen.multiplayer_ratespiel;

import java.util.Scanner;

public class Z_GuessGame {
    private Z_Player[] players;
    private int targetNumber;
    private int maxAttempts;
    private int currentRound;

    public Z_GuessGame() {
        players = new Z_Player[3];
        for (int i = 0; i < 3; i++) {
            players[i] = new Z_Player("Player " + (i + 1));
        }
        this.targetNumber = (int) (Math.random() * 100) + 1;
        this.maxAttempts = 10;
        this.currentRound = 0;
    }

    public void startGame() {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and " + targetNumber);

        Scanner scanner = new Scanner(System.in); // Scanner-Objekt für die Eingabeinitialisierung

        while (true) {
            currentRound++;
            System.out.println("\nRound " + currentRound + ":");

            for (Z_Player player : players) {
                int attempt = player.makeGuess(scanner, targetNumber);
                if (attempt == targetNumber) {
                    System.out.println(player.getName() + " guessed the correct number! Congratulations!");
                    printGameStats();
                    return;
                }
            }

            if (currentRound == maxAttempts) {
                System.out.println("Sorry, nobody guessed the correct number. The correct number was: " + targetNumber);
                printGameStats();
                return;
            }
        }
    }

    private void printGameStats() {
        System.out.println("\nGame Over! Here are the game statistics:");
        for (Z_Player player : players) {
            System.out.println(player.getName() + " guessed " + player.getAttempts() + " times");
        }
    }
}