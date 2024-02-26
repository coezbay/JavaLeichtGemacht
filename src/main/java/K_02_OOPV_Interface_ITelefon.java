public interface K_02_OOPV_Interface_ITelefon {

    // Eigenschaften / Attribute -> Nur Konstanten

    public static final String NETZANBIETER = "Telekom";

    // Methodensignaturen / Methodenköpfe

//    public  void powerOn();
//    public  boolean esKlingelt();
//    public  boolean anrufen();

    public abstract void powerOn();

    public abstract boolean esKlingelt();

    public abstract boolean anrufen();
}