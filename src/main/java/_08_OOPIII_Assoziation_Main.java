public class _08_OOPIII_Assoziation_Main {

    public static void main(String[] args) {
        // Dingo Dongo

//        _09_OOPIII_Assoziation_Computer cp1 = new _09_OOPIII_Assoziation_Computer();
//        System.out.println(cp1.mainboard);
//
//        _09_OOPIII_Assoziation_Mainboard board1 = new _09_OOPIII_Assoziation_Mainboard();
//        System.out.println(board1);
//
//        cp1.mainboard = board1;
//        System.out.println(cp1.mainboard);

//        _09_OOPIII_Assoziation_Mainboard board2 = new _09_OOPIII_Assoziation_Mainboard();
//        _09_OOPIII_Assoziation_Computer cp2 = new _09_OOPIII_Assoziation_Computer("Intel", board2, 500);

        _08_OOPIII_Assoziation_Mainboard mainboardAsus = new _08_OOPIII_Assoziation_Mainboard(4,2,4);
        _08_OOPIII_Assoziation_Computer computerPeter = new _08_OOPIII_Assoziation_Computer("Intel", mainboardAsus, 400);
        System.out.println(computerPeter.mainboard.usbPorts);

        _08_OOPIII_Assoziation_Computer computerOlga = new _08_OOPIII_Assoziation_Computer(2,1,2, "AMD");
        System.out.println(computerOlga.mainboard.ramSlots);
    }
}