public class _09_OOPIII_Assoziation_Main {

    public static void main(String[] args) {
        // Dingo Dongo

        _09_OOPIII_Assoziation_Computer cp1 = new _09_OOPIII_Assoziation_Computer();
        System.out.println(cp1.mainboard);

        _09_OOPIII_Assoziation_Mainboard board1 = new _09_OOPIII_Assoziation_Mainboard();
        System.out.println(board1);

        cp1.mainboard = board1;
        System.out.println(cp1.mainboard);

    }
}
