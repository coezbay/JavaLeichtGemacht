public abstract class J_00_OOPV_AbstrakteKlasse_BMW extends J_00_OOPV_AbstrakteKlasse_Auto {

    boolean xDrive;

    public J_00_OOPV_AbstrakteKlasse_BMW(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean xDrive) {
        super("BMW", ps, tuerenAnzahl, fahrzeugTyp);
        this.xDrive = xDrive;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.print("Der BMW startet!");
    }
}