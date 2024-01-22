public class I_01_OOPIV_Modifikatoren_Main {

    public static void main(String[] args) {
        // Dingo Dongo

//| Zugriffsmodifikatoren:
//|                    | public | protected | (package-private) | private |
//|--------------------|--------|-----------|-------------------|---------|
//| Eigene Klasse      | Ja     | Ja        | Ja                | Ja      |
//| Gleiches Package   | Ja     | Ja        | Ja                | Nein    |
//| Subklasse          | Ja     | Ja        | Nein              | Nein    |
//| Fremde Klasse      | Ja     | Nein      | Nein              | Nein    |

//        In dieser Tabelle:
//
//        Eigene Klasse: Zeigt die Zugriffsmöglichkeiten innerhalb der eigenen Klasse.
//        Gleiches Package: Bezieht sich auf Klassen, die sich im selben Package befinden.
//        Subklasse: Zeigt den Zugriff in Subklassen (abgeleiteten Klassen), sowohl im gleichen als auch in anderen Packages.
//        Fremde Klasse: Bezieht sich auf Klassen in anderen Packages, die nicht Subklassen sind.

//        _09_OOPIV_Modifikatoren_Held player1 = new _09_OOPIV_Modifikatoren_Held();
//        player1.lebenspunkte = 100;
//        System.out.println("Der Held player1 hat: " + player1.lebenspunkte + " Lebenspunkte.");
//
//        _09_OOPIV_Modifikatoren_Held player2 = new _09_OOPIV_Modifikatoren_Held();
//        player2.lebenspunkte = -100;
//        System.out.println("Der Held player2 hat: " + player2.lebenspunkte + " Lebenspunkte.");

//        _09_OOPIV_Modifikatoren_Held player1 = new _09_OOPIV_Modifikatoren_Held(46);
//        player1.getLebenspunkte();
//
//        int schaden = 10;
//
//        player1.setLebenspunkte(schaden);

        I_09_OOPIV_Modifikatoren_GoogleKonto peter = new I_09_OOPIV_Modifikatoren_GoogleKonto("Peter123", "1234");
//        peter.setPasswort("3242sddfg");
//        System.out.println(peter.getPasswort());

        peter.setPasswort("1234");

    }
}
