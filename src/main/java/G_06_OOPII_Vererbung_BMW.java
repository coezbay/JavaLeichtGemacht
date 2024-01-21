
public class G_06_OOPII_Vererbung_BMW extends G_05_OOPII_Vererbung_Auto {

    boolean xDrive;

    public G_06_OOPII_Vererbung_BMW(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean xDrive) {
        super("BMW", ps, tuerenAnzahl, fahrzeugTyp);
        this.xDrive = xDrive;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.print("Der BMW startet!");
    }
}