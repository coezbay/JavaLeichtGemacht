import java.util.Scanner;

public class _02_InputOutput_Test {

    public static void main(String[] args) {

        // Mit der Klasse Scanner hat man Methoden zur Verfügung, um Eingabe-Strömen (InputStream) einlesen
        // d.h. Werte einlesen wie z.B. Zahlen

        Scanner scanner = new Scanner(System.in); // System.in = Input = Tastatur

        int zahl = scanner.nextInt();

        System.out.println("Sie haben die Zahl " + zahl + " eingegeben");

        scanner.close();

        // Was kann eingelesen werden?

        /*
         * nextInt() - Int
         * nextFloat() - Float
         * nextDouble() - Double
         * nextLong() - Long
         * nextShort() - Short
         * next() - Einzelnes Wort
         * nextLine() - String "Zeichenkette"
         * nextBoolean() - Boolean
         */

    }
}
