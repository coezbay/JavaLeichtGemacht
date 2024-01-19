
public abstract class J_10_OOPV_AbstrakteKlasse_Tier {

    // Eigenschaften / Attribute
    String name;
    int groesse;
    int gewicht;

    // Konstruktoren
    public J_10_OOPV_AbstrakteKlasse_Tier(){

    }
    public J_10_OOPV_AbstrakteKlasse_Tier(String name, int groesse, int gewicht) {
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    // Methoden
    public abstract void essen();

    public abstract void atmen();

    public String getName(){
        return name;
    }
}
