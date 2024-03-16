package games_und_anwendungen.multiplayer_ratespiel;

import java.util.Scanner;

public class Z_GuessGame {
    Z_Player p1;
    Z_Player p2;
    Z_Player p3;
    Scanner scanner = new Scanner(System.in); // Scanner-Objekt für die Eingabeinitialisierung

    public void startGame() {
        p1 = new Z_Player();
        p2 = new Z_Player();
        p3 = new Z_Player();

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 ...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            int guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            int guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            int guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber || guessp2 == targetNumber || guessp3 == targetNumber) {
                System.out.println("We have a winner!");
                if (guessp1 == targetNumber) {
                    System.out.println("Player one got it right!");
                }
                if (guessp2 == targetNumber) {
                    System.out.println("Player two got it right!");
                }
                if (guessp3 == targetNumber) {
                    System.out.println("Player three got it right!");
                }
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("No one guessed correctly. Players will have to try again.");
                System.out.println("Press Enter to continue...");
                scanner.nextLine(); // Wartet auf Eingabe, bevor die Schleife fortgesetzt wird
            } // Ende von if/else
        } // Ende der while Schleife
    } // Ende der startGame-Methode
} // Ende von Class