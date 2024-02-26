import java.util.ArrayList;
import java.util.List;

public class C_12_EinsatzStatusQuoOverrideEier {
    private final List<Ei> eier = new ArrayList<>();

    public C_12_EinsatzStatusQuoOverrideEier(int anzahlEier) {
        // Farben ohne das Suffix "es", um eine doppelte Anhängung zu vermeiden
        String[] farben = {"rot", "blau", "grün", "gelb"};
        for (int i = 0; i < anzahlEier; i++) {
            String farbe = farben[(int) (Math.random() * farben.length)];
            eier.add(new Ei(farbe + "es")); // "es" wird hier hinzugefügt
        }
    }

    public void eierFallenLassen() {
        for (Ei ei : eier) {
            ei.fallen();
            System.out.println(ei + " fällt.");
            if (!ei.istIntakt()) {
                System.out.println("Es ist zerbrochen!");
            } else {
                System.out.println("Es bleibt ganz.");
            }
        }
    }

    public void anzeigen() {
        for (Ei ei : eier) {
            System.out.println(ei);
        }
    }

    public static void main(String[] args) {
        C_12_EinsatzStatusQuoOverrideEier status = new C_12_EinsatzStatusQuoOverrideEier(12);
        status.eierFallenLassen();
        status.anzeigen(); // Zeigt den Zustand der Eier nach dem Fallenlassen an
    }

    // Innere Klasse Ei
    static class Ei {
        private final String farbe;
        private boolean istIntakt;

        public Ei(String farbe) {
            this.farbe = farbe; // Farbe enthält bereits das Suffix "es"
            this.istIntakt = true; // Alle Eier starten intakt
        }

        public void fallen() {
            if (Math.random() > 0.5) { // 50% Chance, dass das Ei bricht
                this.istIntakt = false;
            }
        }

        @Override
        public String toString() {
            return this.farbe + " Ei" + (this.istIntakt ? "" : " (gebrochen)");
        }

        public boolean istIntakt() {
            return istIntakt;
        }
    }
}