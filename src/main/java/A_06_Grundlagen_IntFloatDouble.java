/*

    Grundlagen - Umgang mit ganzzahligen (int) und Fließkommazahlen (float und double)

    Deklaration und Initialisierung einer int-Variablen (varZahl1):
    Der Ausdruck 10 / 3 führt eine Ganzzahldivision durch, weil beide Operanden Ganzzahlen sind.
    Das Ergebnis ist ebenfalls eine Ganzzahl, wobei der Dezimalteil abgeschnitten wird.
    varZahl1 wird den Wert 3 haben, da 10 / 3 in Ganzzahldivision 3 ergibt (der Bruchteil wird ignoriert).

    Deklaration und Initialisierung einer float-Variablen (varZahl2):
    Indem 10f / 3f verwendet wird, werden beide Zahlen als float (Fließkommazahlen) behandelt.
    Das Ergebnis ist daher eine Fließkommazahl, die näher an dem tatsächlichen Ergebnis von 10 / 3 liegt.
    Beachten die Verwendung von f nach den Zahlen, um sie als float-Literale zu kennzeichnen.

    Deklaration und Initialisierung einer double-Variablen (varZahl3):
    Ähnlich wie bei float, aber double bietet eine höhere Präzision.
    10d / 3d führt die Division als Fließkommaberechnung mit double-Genauigkeit durch.
    Die Verwendung von d ist hier optional, da Dezimalzahlen in Java standardmäßig als double behandelt werden.

    Ausgabe der Werte:
    Der Code gibt die Werte aller drei Variablen aus.
    Da varZahl1 eine int-Variable ist, wird das Ergebnis ohne Dezimalstellen sein.
    varZahl2 und varZahl3 hingegen werden die Ergebnisse mit Dezimalstellen anzeigen,
    wobei varZahl3 (der double-Wert) aufgrund der höheren Präzision von double im Vergleich zu float möglicherweise mehr Dezimalstellen aufweist.

    Das nachfolgende Beispiel verdeutlicht den Unterschied im Verhalten von Ganzzahl- und Fließkommadivisionen in Java sowie den Unterschied in der Präzision zwischen float und double.

*/

public class A_06_Grundlagen_IntFloatDouble {
    public static void main(String[] args) {

        int varZahl1 = 10 / 3;
        float varZahl2 = 10f / 3f;
        double varZahl3 = 10d / 3d;

        System.out.println("int " + varZahl1);
        System.out.println("float " + varZahl2);
        System.out.println("double " + varZahl3);
    }
}