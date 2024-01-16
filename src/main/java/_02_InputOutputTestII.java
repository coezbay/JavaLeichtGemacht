import java.util.Scanner;

public class _02_InputOutputTestII {

    public static void main(String[] args) {

        // Mit der Klasse Scanner hat man Methoden zur Verfügung, um Eingabe-Ströme (InputStream) einzulesen
        // D.H. Werte einlesen wie z.B. Zahlen

        Scanner scanner = new Scanner(System.in); // System.in = Input = Tastatur

        // Beispiel
        String name = scanner.nextLine();
        char geschlecht = scanner.next().charAt(0);
        int age = scanner.nextInt();
        long mobileNumber = scanner.nextLong();

        scanner.close();

        System.out.println("Name: " + name);
        System.out.println("Geschlecht:" + geschlecht);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number " + mobileNumber);

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
