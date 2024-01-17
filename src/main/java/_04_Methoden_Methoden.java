
public class _04_Methoden_Methoden {

    public static void main(String[] args) {
        // Dingo Dongo

//<Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
// Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected

        // void = leer

        ausgabe();
        summe();

    }

    public static void ausgabe(){
        System.out.print("Ich bin eine Methode!");
    }

    public static void summe(){
        int a,b,summe;
        a = 5;
        b = 5;

        summe = a + b;
        System.out.print(summe);

    }

}
