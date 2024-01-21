
public class E_01_Array_WasIstEinArray {

    public static void main(String[] args) {
        // Dingo Dongo

        /*
        Ein Array in der Programmierung ist eine Sammlung von Elementen, die alle denselben Datentyp haben und in einer festgelegten Reihenfolge gespeichert sind. Jedes Element in einem Array hat einen Index, der seine Position in der Sammlung angibt. Diese Indizes beginnen in den meisten Programmiersprachen, einschließlich Java, bei 0.

        Einige wichtige Eigenschaften von Arrays sind:

        Fester Datentyp: Alle Elemente in einem Array müssen denselben Datentyp haben. Zum Beispiel kann ein Array aus Integer-, Double- oder String-Werten bestehen, aber nicht aus einer Mischung dieser Typen.

        Feste Größe: In vielen Programmiersprachen, wie Java, muss die Größe eines Arrays bei seiner Erstellung festgelegt werden und kann später nicht mehr verändert werden. Es gibt jedoch andere Datenstrukturen wie ArrayLists in Java, die eine flexible Größe ermöglichen.

        Indizierung: Der Zugriff auf Elemente in einem Array erfolgt über Indizes. Der erste Index ist immer 0, der zweite 1 und so weiter.

        Speichereffizienz: Arrays sind eine speichereffiziente Art, eine Sammlung von Daten zu speichern und darauf zuzugreifen, da sie im Speicher kontinuierlich angeordnet sind.

        Direkter Zugriff: Auf jedes Element eines Arrays kann direkt über seinen Index zugegriffen werden, was einen schnellen Zugriff und Modifikationen ermöglicht.

        Ein einfaches Beispiel für ein Array in Java könnte so aussehen:

        int[] meineZahlen = {10, 20, 30, 40, 50};

        Hier ist meineZahlen ein Array von Integer-Werten, und es enthält 5 Elemente. Der Wert 10 kann über meineZahlen[0] abgerufen werden, 20 über meineZahlen[1], und so weiter.

         */

        // Veriable Deklaration
        // Datentyp Name = Wert;
        int zahl = 50;
        double zahl1 = 34.34;

        // Array Deklaration
        // Datentyp[] Name = new Datentyp[Anzahl];
        int[] zahlenArray = new int[7];
        zahlenArray[3] = 50;
        zahlenArray[5] = 500;
        zahlenArray[0] = 40;

        double[] zahlenArray1 = new double[7]; // Nur das Array erstellt
        zahlenArray1[1] = 34.23;
        zahlenArray1[4] = 50.45;

        String[] personA = {"Peter", "Müller", "35"};
        System.out.println("Name: " + personA[0]);
    }

}