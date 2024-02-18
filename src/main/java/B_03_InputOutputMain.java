/*

    Der nachfolgende Code definiert eine Klasse mit dem Namen B_03_InputOutputMain, die eine Hauptmethode main enthält.
    Diese Methode dient als Startpunkt des Programms.

    Klassendefinition:
    Die Klasse B_03_InputOutputMain ist eine öffentliche Klasse, die den Rahmen für das Programm bildet.

    Hauptmethode:
    Die Methode public static void main(String[] args) wird automatisch ausgeführt, wenn das Programm startet.
    Sie kann Kommandozeilenargumente über den Parameter String[] args erhalten.

    Erstellung eines Auto-Objekts:
    Mit B_02_InputOutput_Auto audi = new B_02_InputOutput_Auto(); wird ein neues Objekt der Klasse B_02_InputOutput_Auto erstellt und der Variablen audi zugewiesen.
    Dieses Objekt repräsentiert ein Auto, wobei B_02_InputOutput_Auto eine Klasse ist, die zuvor definiert wurde und Eigenschaften sowie Methoden eines Autos beschreibt.

    Setzen von Eigenschaften des Auto-Objekts:
    Durch audi.preis = 7500.99; wird der Preis des Audi-Objekts auf 7500,99 Euro festgelegt.
    Dies setzt voraus, dass in der Klasse B_02_InputOutput_Auto eine entsprechende Eigenschaft preis vorhanden ist.
    Mit audi.reifen = 4; wird die Anzahl der Reifen des Audi-Objekts auf 4 gesetzt, was ebenfalls auf einer Eigenschaft reifen in der Klasse B_02_InputOutput_Auto basiert.

    Lokale Variable:
    Die Zeile int anzahlTueren = 5; definiert eine lokale Variable namens anzahlTueren vom Typ int und initialisiert sie mit dem Wert 5.
    Diese Variable ist nur innerhalb der main-Methode sichtbar und repräsentiert die Anzahl der Türen eines typischen Autos.

    Ausgabe auf der Konsole:
    System.out.println("Ein typisches Auto hat " + audi.reifen + " Reifen."); gibt aus, dass ein typisches Auto 4 Reifen hat, wobei der Wert aus der Eigenschaft reifen des Objekts audi bezogen wird.
    System.out.println("Der Audi kostet " + audi.preis + " Euro und hat " + anzahlTueren + " Türen."); gibt den Preis des Audi-Objekts sowie die Anzahl der Türen aus, wobei die lokale Variable anzahlTueren verwendet wird.

*/

public class B_03_InputOutputMain {
    public static void main(String[] args) {

        // Erstellung eines neuen Auto-Objekts der Klasse B_02_InputOutput_Auto
        B_02_InputOutput_Auto audi = new B_02_InputOutput_Auto();

        // Setzen des Preises und der Anzahl der Reifen für das Auto
        audi.preis = 7500.99; // Preis des Audi in Euro
        audi.reifen = 4; // Anzahl der Reifen

        // Beispiel für eine lokale Variable
        int anzahlTueren = 5; // Lokale Variable 'anzahlTueren' mit dem Wert 5

        // Beispielhafte Nutzung der lokalen Variable (z.B. Ausgabe)
        System.out.println("Ein typisches Auto hat " + audi.reifen + " Reifen.");
        System.out.println("Der Audi kostet " + audi.preis + " Euro und hat " + anzahlTueren + " Türen.");
    }
}