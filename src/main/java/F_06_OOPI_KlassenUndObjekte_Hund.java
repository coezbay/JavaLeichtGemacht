public class F_06_OOPI_KlassenUndObjekte_Hund {

    // Eigenschaften / Attribute
    int alter;
    String name;
    String rasse;

    //Konstruktoren
    public F_06_OOPI_KlassenUndObjekte_Hund() {

    }

    public F_06_OOPI_KlassenUndObjekte_Hund(int alter, String name, String rasse) {
        this.alter = alter;
        this.name = name;
        this.rasse = rasse;
    }

    // Methoden
    public void bellen() {
        System.out.println("Der Hund: " + this.name + " bellt" );
    }
}
