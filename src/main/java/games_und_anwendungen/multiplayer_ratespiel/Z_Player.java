package games_und_anwendungen.multiplayer_ratespiel;

import java.util.Scanner;

public class Z_Player {
    int number = 0; // Hier kommt der Rateversuch rein
    Scanner scanner = new Scanner(System.in); // Scanner-Objekt für die Eingabeinitialisierung

    public void guess() {
        System.out.println("Enter your guess: ");
        number = scanner.nextInt(); // Liest die Eingabe als Ganzzahl

        System.out.println("I'm guessing " + number);
    }
}