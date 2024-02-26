public class H_04_OOPIII_Assoziation_Auto {

    // Eigenschaften / Attribute
    String autoMarke;
    H_05_OOPIII_Assoziation_Reifen reifen;

    // Konstruktor
    public H_04_OOPIII_Assoziation_Auto() {

    }

    public H_04_OOPIII_Assoziation_Auto(String autoMarke, String reifenMarke, String reifenTyp) {
        this.autoMarke = autoMarke;
        reifen = new H_05_OOPIII_Assoziation_Reifen(reifenMarke, reifenTyp);
    }

    // Methoden
    public void ausgabeDaten() {
        System.out.println("Die Automarke ist " + this.autoMarke + " und der Reifentyp ist: " + this.reifen.reifenMarke);
    }
}