public class C_11_EinsatzStatusQuo {
    public static void main(String[] args) {
        int eierAnzahl = 12;
        String wort = "Eier";
        String farbePlural = "bunte"; // "bunte" für Plural
        String farbeSingular = "buntes"; // "buntes" für Singular

        while (eierAnzahl > 0) {
            if (eierAnzahl == 1) {
                wort = "Ei";
                System.out.println(eierAnzahl + " " + farbeSingular + " " + wort + " steht auf dem Tisch"); // Singular
                System.out.println("und wenn das " + farbeSingular + " Ei fällt,");
            } else {
                System.out.println(eierAnzahl + " " + farbePlural + " " + wort + " stehen auf dem Tisch"); // Plural
                System.out.println("und wenn ein " + farbeSingular + " Ei fällt,");
            }
            eierAnzahl = eierAnzahl - 1;
            if (eierAnzahl > 0) {
                if (eierAnzahl == 1) {
                    System.out.println("wird " + eierAnzahl + " " + farbeSingular + " Ei auf dem Tisch stehen."); // Singular
                } else {
                    System.out.println("werden " + eierAnzahl + " " + farbePlural + " " + wort + " auf dem Tisch stehen."); // Plural
                }
            } else {
                System.out.println("wird kein Ei mehr auf dem Tisch stehen!"); // Keine Eier mehr
            }
        }
    }
}