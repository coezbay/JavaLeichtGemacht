public class D_05_Methoden_BeispielMethoden {
    public static void main(String[] args) {

        // Merke: Eine Methode erledigt eine bestimmte Aufgabe

        int gegnerLeben = 100;
        System.out.println("Der Boss hat: " + gegnerLeben);

        gegnerLeben = gegnerHit(gegnerLeben);
        System.out.println("Boss getroffen und hat noch: " + gegnerLeben + " Lebenspunkte");

    }

    public static int gegnerHit(int aktuellLeben) {
        int neuGegnerLeben;

        neuGegnerLeben = aktuellLeben - 20;

        return neuGegnerLeben;
    }
}