/*

    Eine Zeichenkette, bekannt unter dem englischen Begriff "String", ist ein grundlegender Datentyp in vielen Programmiersprachen, einschließlich Java.
    Sie repräsentiert eine Sequenz von Zeichen und wird häufig zur Speicherung und Manipulation von Text verwendet.

    In Java sind Strings Objekte, die durch die Klasse String definiert werden.
    Diese Klasse bietet eine Vielzahl von Methoden zur Bearbeitung von Text, wie z.B. das Verbinden von Strings,
    das Schneiden von Teilen des Strings, die Umwandlung in Groß- oder Kleinbuchstaben und vieles mehr.

    Hier sind einige wichtige Eigenschaften und Konzepte im Zusammenhang mit Strings in Java:

    Unveränderlichkeit (Immutability):
    Einmal erstellt, kann der Inhalt eines String-Objekts nicht mehr verändert werden.
    Jede Methode, die den Anschein erweckt, den Inhalt eines Strings zu ändern, erstellt tatsächlich einen neuen String.

    Erzeugung von Strings:
    Strings können direkt durch Zuweisung eines in Anführungszeichen gesetzten Textes erstellt werden.
    Zum Beispiel: String gruss = "Hallo Welt!";

    Konkatenation:
    Mehrere Strings können mit dem +-Operator verknüpft (konkateniert) werden.
    Zum Beispiel: String vollerGruss = "Hallo " + "Welt!";

    String-Literal-Pool:
    Java speichert alle String-Literale in einem speziellen Speicherbereich, dem String-Literal-Pool.
    Wenn ein neuer String erstellt wird, der identisch mit einem bereits vorhandenen Literal ist, wird keine neue Instanz erstellt,
    sondern auf das bestehende Literal verwiesen.

    Methoden der String-Klasse:

    length():
    Gibt die Länge des Strings zurück, also die Anzahl der Zeichen im String.


    substring(int beginIndex, int endIndex):
    Gibt einen neuen String zurück, der ein Teil des ursprünglichen Strings ist.
    Der Teilstring beginnt beim beginIndex und erstreckt sich bis zum Zeichen vor dem endIndex.
    Es ist zu beachten, dass beginIndex inklusiv ist, während endIndex exklusiv ist.

    Inklusiv (beginIndex):
    Das Zeichen an der Position beginIndex ist Teil des resultierenden Teilstrings.
    Wenn man also substring(2, 5) auf den String "Beispiel" anwendet,
    wäre das Zeichen an Position 2 (das dritte Zeichen, da die Zählung bei 0 beginnt), also "i", der erste Buchstabe des Teilstrings.

    Exklusiv (endIndex):
    Das Zeichen an der Position endIndex ist nicht mehr Teil des resultierenden Teilstrings.
    In demselben Beispiel mit substring(2, 5) auf "Beispiel", würde das Zeichen an Position 5 (das sechste Zeichen),
    also "e", nicht mehr im Teilstring enthalten sein.
    Der resultierende Teilstring wäre "isp", der die Zeichen an den Positionen 2, 3 und 4 umfasst.

    B e i s p i e l
    0 1 2 3 4 5 6 7


    toLowerCase():
    Erzeugt einen neuen String, in dem alle Großbuchstaben des ursprünglichen Strings in Kleinbuchstaben umgewandelt wurden.

    toUpperCase():
    Erzeugt einen neuen String, in dem alle Kleinbuchstaben des ursprünglichen Strings in Großbuchstaben umgewandelt wurden.

    equals(Object anObject):
    Vergleicht den ursprünglichen String mit dem spezifizierten Objekt.
    Die Methode gibt true zurück, wenn das gegebene Objekt nicht null ist,
    vom Typ String ist und genau denselben Zeichensequenzinhalt wie der ursprüngliche String hat.

    Zusätzlich zu diesen Methoden bietet die String-Klasse viele weitere nützliche Methoden zur Manipulation und Untersuchung von Strings,
    wie zum Beispiel:

    charAt(int index):
    Gibt das Zeichen am spezifizierten Index zurück.

    contains(CharSequence s):
    Überprüft, ob der String die spezifizierte Zeichensequenz enthält.

    startsWith(String prefix):
    Überprüft, ob der String mit der angegebenen Präfixzeichenfolge beginnt.

    endsWith(String suffix):
    Überprüft, ob der String mit der angegebenen Suffixzeichenfolge endet.

    indexOf(int ch):
    Gibt den Index des ersten Vorkommens des angegebenen Zeichens zurück, oder -1, wenn das Zeichen nicht im String vorkommt.

    replace(CharSequence target, CharSequence replacement):
    Ersetzt jedes Vorkommen der Zielzeichenfolge im String durch die Ersatzzeichenfolge.

    split(String regex):
    Teilt den String in ein Array von Strings, basierend auf den Übereinstimmungen mit dem gegebenen regulären Ausdruck.

*/

public class A_04_Grundlagen_Datentyp_Zeichenkette {
    public static void main(String[] args) {

        String varZeichenkette = "Ich bin eine Zeichenkette";

        // Demonstration einiger String-Methoden
        System.out.println("Länge der Zeichenkette: " + varZeichenkette.length());
        System.out.println("Teilstring: " + varZeichenkette.substring(0, 7)); // "Ich bin"
        System.out.println("In Großbuchstaben: " + varZeichenkette.toUpperCase());

        String name = "Mustermann";
        String alter = "23";

        // Verwendung von String-Konkatenation
        System.out.println("Dein Name ist " + name + " und Du bist " + alter + " Jahre alt.");

        // Vergleich von Strings
        String begruessung1 = "Hallo Welt!";
        String begruessung2 = "Hallo " + "Welt!";

        // Verwendung der equals-Methode, um die Gleichheit der Inhalte zu überprüfen
        boolean sindGleich = begruessung1.equals(begruessung2);

        System.out.println("Gleichheit der Begrüßungen: " + sindGleich);
    }
}