public class _09_OOPIV_Modifikatoren_Main {

    public static void main(String[] args) {
        // Dingo Dongo

//        _09_OOPIV_Modifikatoren_Held player1 = new _09_OOPIV_Modifikatoren_Held();
//        player1.lebenspunkte = 100;
//        System.out.println("Der Held player1 hat: " + player1.lebenspunkte + " Lebenspunkte.");
//
//        _09_OOPIV_Modifikatoren_Held player2 = new _09_OOPIV_Modifikatoren_Held();
//        player2.lebenspunkte = -100;
//        System.out.println("Der Held player2 hat: " + player2.lebenspunkte + " Lebenspunkte.");

        _09_OOPIV_Modifikatoren_Held player1 = new _09_OOPIV_Modifikatoren_Held(46);
        player1.getLebenspunkte();

        int schaden = 10;

        player1.setLebenspunkte(schaden);

    }
}
