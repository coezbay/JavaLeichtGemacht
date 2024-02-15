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