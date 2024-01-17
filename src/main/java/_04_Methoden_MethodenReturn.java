
public class _04_Methoden_MethodenReturn {

    public static void main(String[] args) {
        // Dingo Dongo

        //<Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
        // Merke: Eine Methode erledigt eine bestimmte Aufgabe

        int summe = taschenrechner(5, 5, '+');
        System.out.println(summe);
    }

    public static int taschenrechner(int zahl1, int zahl2, char operator) {
        int summe; // lokale Variable

        if (operator == '+') {
            summe = zahl1 + zahl2;
        } else {
            summe = zahl2 - zahl2;
        }

        return summe;
    }


}
