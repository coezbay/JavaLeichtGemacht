public class _08_OOPIII_Assoziation_Computer {


    // Eigenschaften / Attribute

    String cpu;
    _08_OOPIII_Assoziation_Mainboard mainboard;

    int preis;

    // Konstruktor
    public _08_OOPIII_Assoziation_Computer() {

    }
    public _08_OOPIII_Assoziation_Computer(String cpu, _08_OOPIII_Assoziation_Mainboard mainboard, int preis) {
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.preis = preis;
    }

    public _08_OOPIII_Assoziation_Computer(int ramSlots, int kartenSlots, int usbPorts, String cpu){
        mainboard = new _08_OOPIII_Assoziation_Mainboard(ramSlots, kartenSlots, usbPorts);
        this.cpu = cpu;
    }

    // Methoden

}