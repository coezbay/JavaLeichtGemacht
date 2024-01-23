
public class J_04_OOPV_AbstrakteKlasse_Vogel extends J_02_OOPV_AbstrakteKlasse_Tier {

    @Override
    public void essen() {
        System.out.println("Der Vogel pickt sein Essen auf.");
    }

    @Override
    public void atmen() {
        System.out.println("Vögel atmen durch ein komplexes System von Luftsäcken und Lungen, das frische Luft kontinuierlich durch die Lungen strömen lässt");
    }

    @Override
    public void trinken() {
        System.out.println("Ein Vogel taucht seinen Schnabel ins Wasser und neigt dann den Kopf nach hinten, um das Wasser mithilfe der Schwerkraft in seinen Rachen fließen zu lassen.");
    }
}
