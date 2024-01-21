
public class F_02_OOPI_KlassenUndObjekte_Auto {

    // Eigenschaften / Attribute
    static int reifenAnzahl = 5;
    int reifen;
    int preis;

    String marke;

    public static void ausgabe(){
        System.out.println("Ich bin eine Klassenmethode und benötige kein Objekt!");
    }

    // Konstruktoren
    public F_02_OOPI_KlassenUndObjekte_Auto() {

    }

    public F_02_OOPI_KlassenUndObjekte_Auto(int reifen, int preis, String marke) {
        this.reifen = reifen;
        this.preis = preis;
        this.marke = marke;
    }

    // Methoden
    public void gasgeben() {
        System.out.println("Das Auto mit der Marke: " + this.marke + " fährt jetzt los!" + " Vergessen wir nicht, dass das Auto " + this.preis + " Euro kostet!");
    }

    public void bremsen() {
        System.out.println("Das Auto mit der Marke: " + this.marke + " bremst!");
    }

    public void vergleichePreis(int preis) {
        if (this.preis <= preis) {
            System.out.println("Der " + this.marke + " ist billiger!");
        } else {
            System.out.println("Der " + this.marke + " ist teuerer!");
        }
    }
}
