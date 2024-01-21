public class G_13_OOPII_Vererbung_Macbook extends G_12_OOPII_Vererbung_Laptop {

    // Eigenschaften / Attribute
    boolean touchBar;

    // Konstruktoren
    public G_13_OOPII_Vererbung_Macbook(String marke, int ram, String cpu, double preis, boolean touchBar) {
        super(marke, ram, cpu, preis);
        this.touchBar = touchBar;
    }

    // Methoden
    @Override
    public void starten() {
        //super.starten();
        System.out.println("Der Macbook startet!");
    }
}