public abstract class J_02_OOPV_AbstrakteKlasse_Tier {

    // Eigenschaften / Attribute
    String name;
    int groesse;
    int gewicht;

    // Konstruktoren
    public J_02_OOPV_AbstrakteKlasse_Tier() {

    }

    public J_02_OOPV_AbstrakteKlasse_Tier(String name, int groesse, int gewicht) {
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    // Methoden
    public abstract void essen();
    // Bei "abstract" können wir kein Objekt mehr aus der Klasse bilden/erstellen.
    // Bei dem Schlüsselwort "abstract" benötigen wir bei der Methode auch keinen Anweisungsblock mehr.
    // Bei einer abstrakten Klasse sagen wir lediglich, was getan wird.
    // Wie es getan wird, sagt die Klasse, die von dieser Klasse erbt.

    public abstract void atmen();

    public abstract void trinken();

    public String getName() {
        return name;
    }
}