public class G_04_OOPII_Vererbung_Tier {

    // Eigenschaften / Attribute
    String name;
    int groesse;
    int gewicht;

    // Konstruktoren
    public G_04_OOPII_Vererbung_Tier(String name, int groesse, int gewicht) {
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    // Methoden
    public void essen() {
        System.out.print("Das Tier hat gegessen!");
    }
}