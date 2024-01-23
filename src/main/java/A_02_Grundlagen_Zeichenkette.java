/*
Eine Zeichenkette, bekannt unter dem englischen Begriff "String", ist ein grundlegender Datentyp in vielen Programmiersprachen, einschließlich Java.
Sie repräsentiert eine Sequenz von Zeichen und wird häufig zur Speicherung und Manipulation von Text verwendet.

In Java sind Strings Objekte, die durch die Klasse String definiert werden.
Diese Klasse bietet eine Vielzahl von Methoden zur Bearbeitung von Text, wie z.B. das Verbinden von Strings, das Schneiden von Teilen des Strings, die Umwandlung in Groß- oder Kleinbuchstaben und vieles mehr.

Hier sind einige wichtige Eigenschaften und Konzepte im Zusammenhang mit Strings in Java:

Unveränderlichkeit (Immutability):
Einmal erstellt, kann der Inhalt eines String-Objekts nicht mehr verändert werden.
Jede Methode, die den Anschein erweckt, den Inhalt eines Strings zu ändern, erstellt tatsächlich einen neuen String.

Erzeugung von Strings:
Strings können direkt durch Zuweisung eines in Anführungszeichen gesetzten Textes erstellt werden.
Zum Beispiel: String gruß = "Hallo Welt!";

Konkatenation:
Mehrere Strings können mit dem +-Operator verknüpft (konkateniert) werden.
Zum Beispiel: String vollerGruß = "Hallo " + "Welt!";

String-Literal-Pool:
Java speichert alle String-Literale in einem speziellen Speicherbereich, dem String-Literal-Pool.
Wenn ein neuer String erstellt wird, der identisch mit einem bereits vorhandenen Literal ist, wird keine neue Instanz erstellt, sondern auf das bestehende Literal verwiesen.

Methoden der String-Klasse:
Die String-Klasse bietet Methoden wie
length() (zur Rückgabe der Länge des Strings),
substring(int beginIndex,
int endIndex) (zur Rückgabe eines Teilstrings),
toLowerCase() und toUpperCase() (für Klein- bzw. Großschreibung),
equals(Object anObject) (zum Vergleichen von zwei Strings auf Gleichheit) und viele weitere.
*/

public class A_02_Grundlagen_Zeichenkette {
    public static void main(String[] args) {

        String varZeichenkette = "Ich bin eine Zeichenkette";

        String name = "Christian";
        String alter = "25";

        System.out.println("Dein Name ist " + name + " und Du bist " + alter + " Jahre alt.");
    }
}