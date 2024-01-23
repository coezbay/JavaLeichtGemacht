public class K_01_OOPV_Interface_GalaxyS5 implements K_02_OOPV_Interface_ITelefon {

    // Eigenschaften / Attribute
    private String farbe;

    // Konstruktoren

    // Methoden

    @Override
    public void powerOn() {

    }

    @Override
    public boolean esKlingelt() {
        return false;
    }

    @Override
    public boolean anrufen() {
        return false;
    }
}