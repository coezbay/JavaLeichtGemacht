public class G_05_OOPII_Vererbung_Auto {

    // Eigenschaften / Attribute
    String marke;
    int ps;
    int tuerAnzahl;
    String fahrzeugTyp;

    // Konstruktoren
    public G_05_OOPII_Vererbung_Auto(String marke, int ps, int tuerAnzahl, String fahrzeugTyp) {
        super();
        this.marke = marke;
        this.ps = ps;
        this.tuerAnzahl = tuerAnzahl;
        this.fahrzeugTyp = fahrzeugTyp;
    }

    //Methoden
    public void starten() {
        System.out.println("Das Auto startet!");
    }
}