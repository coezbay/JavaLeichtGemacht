public class J_03_OOPV_AbstrakteKlasse_Hund extends J_02_OOPV_AbstrakteKlasse_Tier {

    // Eigenschaften / Attribute
    int zaehne;

    //Konstruktoren
    public J_03_OOPV_AbstrakteKlasse_Hund(String name, int groesse, int gewicht, int zaehne) {
        super(name, groesse, gewicht);
        this.zaehne = zaehne;
    }

    // Methoden
    public void bellen() {

    }

    @Override
    public void essen() {
        System.out.println("Der Hund muss sein Essen noch kauen.");
    }

    @Override
    public void atmen() {
        System.out.println("Der Hund atmet über die Lunge.");
    }

    @Override
    public void trinken() {
        System.out.println("Der Hund schleckt das Wasser.");
    }
}