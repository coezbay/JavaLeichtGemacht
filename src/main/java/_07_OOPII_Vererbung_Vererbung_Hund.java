public class _07_OOPII_Vererbung_Vererbung_Hund extends _07_OOPII_Vererbung_Tier {

    // Eigenschaften / Attribute
    int zaehne;

    // Konstruktoren
    public _07_OOPII_Vererbung_Vererbung_Hund(String name, int groesse, int gewicht, int zaehne) {
        super(name, groesse, gewicht);
        this.zaehne = zaehne;
    }

    // Methoden
    public void bellen() {

    }

    @Override
    public void essen() {
        System.out.print("Der Hund muss sein Essen noch kauen!");
        super.essen();
    }
}
