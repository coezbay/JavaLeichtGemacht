
public class C_03_Kontrollstrukturen_SchluesselwortIf {

    public static void main(String[] args) {
        // Dingo Dongo

        // Kontrollstrukturen steuern den Programmablaufplan

        // if = falls
        // else = ansonsten

        int score = 4000;

        if (score == 5000) { // false
            System.out.println("Herzlichen Glückwunsch neuer Rekord!");
        } else {
            System.out.println("Schade, Dein Score reicht leider nicht!");
        }

        int lebenPlayer = 0;

        if (lebenPlayer == 0) { // true
            System.out.println("Spiel verloren");
        }


        boolean gegnerHit = false;
        int highscore = 0;

        if (gegnerHit == true) { //false
            System.out.println("Gegner getroffen!");
            highscore += 10;
            System.out.println("Highscore " + highscore);
        } else {
            System.out.println("Daneben!");
        }

    }

}
