public class C_11_EinsatzStatusQuo {
    public static void main(String[] args) {
        int eierAnzahl = 12;
        String wort = "Eier";
        String farbePlural = " bunte ";
        String farbeSingular = "buntes";

        while (eierAnzahl > 0) {
            if (eierAnzahl == 1) {
                wort = "Ei";
            }
            System.out.println(eierAnzahl + farbePlural + wort + ", stehen auf dem Tisch");
            System.out.println("und wenn ein " + farbeSingular + " Ei fällt,");
            eierAnzahl = eierAnzahl - 1;
            if (eierAnzahl > 0) {
                System.out.println("werden " + eierAnzahl + farbePlural + wort + ", auf dem Tisch stehen.");
            } else {
                System.out.println("wird kein Ei mehr auf dem Tisch stehen!");
            }
        }
    }
}