public class C_10_Kontrollstrukturen_Schleifen {

    public static void main(String[] args) {
        int x = 1;
        while (x < 2) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 2) {
            System.out.print("Do");
        }

        System.out.println("\n--- For-Schleife ---");
        // For-Schleife
        for (int i = 1; i < 2; i++) {
            System.out.print("Doo");
            System.out.print("Bee");
        }
        System.out.print("Do");

        System.out.println("\n--- Do-While-Schleife ---");
        // Do-While-Schleife
        x = 1; // Zurücksetzen von x
        do {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        } while (x < 2);
        System.out.print("Do");

        System.out.println("\n--- Verschachtelte Schleifen ---");
        // Verschachtelte Schleifen
        x = 1;
        while (x < 2) {
            for (int y = 0; y < 2; y++) {
                System.out.print("Doo");
                System.out.print("Bee");
            }
            x = x + 1;
        }
        System.out.print("Do");

        System.out.println("\n--- Kombination verschiedener Schleifen ---");
        // Kombination verschiedener Schleifen
        x = 1;
        while (x < 2) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("La");
        }
        System.out.print("Do");
    }
}