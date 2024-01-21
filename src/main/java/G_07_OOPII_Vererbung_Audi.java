public class G_07_OOPII_Vererbung_Audi extends G_05_OOPII_Vererbung_Auto {

    boolean quattro;

    public G_07_OOPII_Vererbung_Audi(int ps, int tuerAnzahl, String fahrzeugTyp, boolean quattro) {
        super("Audi", ps, tuerAnzahl, fahrzeugTyp);
        this.quattro = quattro;

    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("Ja, es startet ein Audi!");
    }
}
