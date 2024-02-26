public class G_12_OOPII_Vererbung_Laptop {

    // Eigenschaften / Attribute
    String marke;
    int ram;
    String cpu;
    double preis;

    // Konstruktoren
    public G_12_OOPII_Vererbung_Laptop(String marke, int ram, String cpu, double preis) {
        this.marke = marke;
        this.ram = ram;
        this.cpu = cpu;
        this.preis = preis;
    }

    //Methoden
    public void starten() {
        System.out.println("Der Laptop startet!");
    }
}