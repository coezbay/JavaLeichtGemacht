package games_und_anwendungen.multiplayer_ratespiel;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Z_PlayerTest {

    @Test
    public void testMakeGuessWithValidInput() {
        String input = "5\n"; // Gültige Eingabe: "5"
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Z_Player player = new Z_Player("TestPlayer");

        int guess = player.makeGuess(scanner, 10);

        assertEquals(5, guess); // Erwartet: Die Methode gibt die eingegebene Zahl zurück
    }

    @Test
    public void testMakeGuessWithNonNumericInput() {
        String input = "abc\n5\n"; // Nicht-numerische Eingabe gefolgt von gültiger Eingabe "5"
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Z_Player player = new Z_Player("TestPlayer");

        int guess = player.makeGuess(scanner, 10);

        assertEquals(5, guess); // Erwartet: Die Methode ignoriert die nicht-numerische Eingabe und gibt die gültige Zahl zurück
    }

    @Test
    public void testMakeGuessWithInputGreaterThanMax() {
        String input = "11\n5\n"; // Eingabe größer als das Maximum (10), gefolgt von gültiger Eingabe "5"
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Z_Player player = new Z_Player("TestPlayer");

        int guess = player.makeGuess(scanner, 10);

        assertEquals(5, guess); // Erwartet: Die Methode ignoriert die ungültige Eingabe und gibt die gültige Zahl zurück
    }

    @Test
    public void testMakeGuessWithInputLessThanMin() {
        String input = "0\n5\n"; // Eingabe kleiner als das Minimum (1), gefolgt von gültiger Eingabe "5"
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        Z_Player player = new Z_Player("TestPlayer");

        int guess = player.makeGuess(scanner, 10);

        assertEquals(5, guess); // Erwartet: Die Methode ignoriert die ungültige Eingabe und gibt die gültige Zahl zurück
    }
}