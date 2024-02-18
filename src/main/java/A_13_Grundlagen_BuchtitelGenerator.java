/*

    Der nachfolgende Code demonstriert Grundkonzepte der Java-Programmierung wie Arrays, Schleifen, Bedingungen und den Einsatz der Random-Klasse zur Generierung von Zufallszahlen.

    Klassen-Definition:
    Der Code definiert eine Klasse namens A_13_Grundlagen_BuchtitelGenerator.
    Klassen in Java sind Baupläne für Objekte, die Methoden und Variablen enthalten.

    Main-Methode:
    Innerhalb der Klasse gibt es eine main-Methode, die den Einstiegspunkt für die Ausführung des Programms darstellt.
    Alles innerhalb dieser Methode wird ausgeführt, wenn das Programm gestartet wird.

    Deklaration von Wortlisten:
    Es werden drei Arrays von String-Elementen deklariert, die verschiedene Wörter enthalten, aus denen die Buchtitel generiert werden.
    adjektive enthält Adjektive, substantiv enthält Substantive, und kontext bietet einen Kontext oder ein Thema an, um den Titel zu vervollständigen.

    Ermittlung der Array-Längen:
    Für jedes der drei Arrays wird die Länge (Anzahl der Elemente im Array) ermittelt und in einer eigenen Variable gespeichert (anzahlAdjektive, anzahlSubstantiv, anzahlKontext).
    Diese Längen werden verwendet, um sicherzustellen, dass die Zufallszahlen, die später generiert werden, innerhalb des gültigen Bereichs der Array-Indizes liegen.

    Generierung von Zufallszahlen:
    Es wird eine Instanz der Klasse java.util.Random erstellt, um Zufallszahlen zu generieren.
    Für jedes der drei Arrays wird eine Zufallszahl generiert, die als Index verwendet wird, um ein zufälliges Wort aus dem jeweiligen Array auszuwählen.

    Zusammenstellung des Buchtitels:
    Die ausgewählten Wörter werden zu einem String zusammengesetzt, der einen kreativen Buchtitel bildet. Die Wörter werden durch Leerzeichen getrennt.

    Ausgabe des Buchtitels:
    Der generierte Buchtitel wird zusammen mit einer einführenden Nachricht auf der Konsole ausgegeben.

*/

public class A_13_Grundlagen_BuchtitelGenerator {
    public static void main(String[] args) {
        // Drei Sets von Wörtern für kreative Buchtitel
        String[] adjektive = {"Unendliche", "Verborgene", "Geheime", "Ewige", "Entschleierte", "Ferne", "Geflüsterte", "Erhabene", "Verlorene"};
        String[] substantiv = {"Reiche", "Welten", "Dimensionen", "Geheimnisse", "Weiten", "Träume", "Horizonte", "Mysterien", "Schatten"};
        String[] kontext = {"der Zeit", "des Geistes", "der Seelen", "der Träumer", "der Äonen", "des Kosmos", "der Stille", "der Nacht"};

        // Ermittlung der Anzahl der Wörter in jeder Liste
        int anzahlAdjektive = adjektive.length;
        int anzahlSubstantiv = substantiv.length;
        int anzahlKontext = kontext.length;

        // Generieren von drei Zufallszahlen
        java.util.Random random = new java.util.Random();
        int indexAdjektiv = random.nextInt(anzahlAdjektive);
        int indexSubstantiv = random.nextInt(anzahlSubstantiv);
        int indexKontext = random.nextInt(anzahlKontext);

        // Zusammenstellen eines kreativen Buchtitels
        String buchTitel = adjektive[indexAdjektiv] + " " + substantiv[indexSubstantiv] + " " + kontext[indexKontext];

        // Ausgabe des generierten Buchtitels
        System.out.println("Ein spannender Buchtitel könnte lauten: " + buchTitel);
    }
}