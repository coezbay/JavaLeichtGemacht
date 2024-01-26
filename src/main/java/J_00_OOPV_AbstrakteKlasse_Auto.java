public abstract class J_00_OOPV_AbstrakteKlasse_Auto {

    // Eigenschaften / Attribute
    String marke;
    int ps;
    int tuerAnzahl;
    String fahrzeugTyp;

    // Konstruktoren
    public J_00_OOPV_AbstrakteKlasse_Auto(String marke, int ps, int tuerAnzahl, String fahrzeugTyp) {
        super();
        this.marke = marke;
        this.ps = ps;
        this.tuerAnzahl = tuerAnzahl;
        this.fahrzeugTyp = fahrzeugTyp;
    }

    //Methoden
    public void starten() {
        System.out.println("Das Auto startet");
    }

    public abstract void bremsen(); // Methodenkopf
}