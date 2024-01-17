
public class _01_Grundlagen_Variablen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 8 primitive Datentypen in Java
        /*
         * byte
         * short
         * int
         * long
         * float
         * double
         * boolean
         * char
         */
        // <Datentyp> <Variablenamen> = <Wert> ;

        int varZahl1 = 3;
        long varZahl2 = 300;

        double varZahl3 = 322.23;
        float varZahl4 = 23.34f;

        boolean userKlick = false;

        char zeichen = '!';

        varZahl1 = 5;

        int highscore = 0;
        System.out.println("Dein Highscore: " + highscore);
        highscore = 10;
        System.out.println("Dein Highscore: " + highscore);
        highscore = 20;
        System.out.println("Dein Highscore: " + highscore);

    }
}