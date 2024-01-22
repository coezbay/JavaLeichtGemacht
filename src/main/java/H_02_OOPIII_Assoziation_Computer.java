public class H_02_OOPIII_Assoziation_Computer {

    // Eigenschaften / Attribute
    String cpu;
    H_03_OOPIII_Assoziation_Mainboard mainboard;

    int preis;

    // Konstruktor
    public H_02_OOPIII_Assoziation_Computer() {

    }

    public H_02_OOPIII_Assoziation_Computer(String cpu, H_03_OOPIII_Assoziation_Mainboard mainboard, int preis) {
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.preis = preis;
    }

    public H_02_OOPIII_Assoziation_Computer(int ramSlots, int kartenSlots, int usbPorts, String cpu) {
        mainboard = new H_03_OOPIII_Assoziation_Mainboard(ramSlots, kartenSlots, usbPorts);
        this.cpu = cpu;
    }

    // Methoden

}