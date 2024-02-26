import java.util.Scanner;

public class E_02_Array_BeispielArray {
    public static void main(String[] args) {

        // Array Deklaration
        // Datentyp [] Name = new Datentyp[Anzahl];
        int[] lottoZahlen = new int[6];

        for (int i = 0; i < lottoZahlen.length; i++) {
            Scanner scan = new Scanner(System.in);
            int zahlUser = scan.nextInt();
            lottoZahlen[i] = zahlUser;
        }

        for (int i = 0; i < lottoZahlen.length; i++) {
            System.out.println("Dies ist eine Zahl, die Du eingetippt hast: \n" + lottoZahlen[i]);
        }
        // Merke: Index = Anzahl der Elemente - 1
        // index hier ist: 0...5
    }
}