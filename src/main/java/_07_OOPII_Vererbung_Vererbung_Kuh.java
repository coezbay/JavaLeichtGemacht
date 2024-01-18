public class _07_OOPII_Vererbung_Vererbung_Kuh extends _07_OOPII_Vererbung_Tier {

    // Eigenschaften / Attribute
    int hufe;

    // Konstruktoren
    public _07_OOPII_Vererbung_Vererbung_Kuh(String name, int groesse, int gewicht, int hufe) {
        super(name, groesse, gewicht);
        this.hufe = hufe;
    }
    // Methoden

    @Override
    public void essen() {
        super.essen();
        System.out.print("Die Kuh muss das Essen immer wiederkauen!");
    }
}