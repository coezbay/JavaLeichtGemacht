public class G_03_OOPII_Vererbung_Kuh extends G_04_OOPII_Vererbung_Tier {

    // Eigenschaften / Attribute
    int hufe;

    // Konstruktoren
    public G_03_OOPII_Vererbung_Kuh(String name, int groesse, int gewicht, int hufe) {
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