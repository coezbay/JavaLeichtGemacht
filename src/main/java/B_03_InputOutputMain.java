public class B_03_InputOutputMain {
    public static void main(String[] args) {

        // Erstellung eines neuen Auto-Objekts der Klasse B_02_InputOutput_Auto
        B_02_InputOutput_Auto bmw = new B_02_InputOutput_Auto();

        // Setzen des Preises und der Anzahl der Reifen für das Auto
        bmw.preis = 6000.50; // Preis des BMW in Euro
        bmw.reifen = 4; // Anzahl der Reifen

        // Beispiel für eine lokale Variable
        int anzahlReifen = 4; // Lokale Variable 'anzahlReifen' mit dem Wert 4

        // Beispielhafte Nutzung der lokalen Variable (z.B. Ausgabe)
        System.out.println("Ein typisches Auto hat " + anzahlReifen + " Reifen.");
        System.out.println("Der BMW kostet " + bmw.preis + " Euro und hat ebenfalls " + bmw.reifen + " Reifen.");
    }
}