public class _09_OOPIV_Modifikatoren_Held {

    // Eigenschaften / Attribute
    public String name;
    private int lebenspunkte;

    // Konstruktor

    public _09_OOPIV_Modifikatoren_Held(int lebenspunkte) {
        if (lebenspunkte <= 100 && lebenspunkte > 0) {
            this.lebenspunkte = lebenspunkte;
        }else{
            this.lebenspunkte = 90;
        }
    }

    // Methoden
    public void getLebenspunkte() {
        System.out.println(this.lebenspunkte);
    }

    public void setLebenspunkte(int schaden){
        this.lebenspunkte -= schaden;
        System.out.println(this.lebenspunkte);
    }
}