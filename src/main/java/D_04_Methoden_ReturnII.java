
public class D_04_Methoden_ReturnII {

    public static void main(String[] args) {
        // Dingo Dongo

        //<Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
        // Merke: Eine Methode erledigt eine bestimmte Aufgabe

        int a = summe();
        System.out.println("Der Wert aus der Methode summe() ist: " + a);

        int summe = a - 5;
        System.out.println("Der Wert in summe ist: " + summe);
    }

    public static int summe() {
        int a, b, summe;
        a = 5;
        b = 5;

        summe = a + b;

        return summe;
    }

}
