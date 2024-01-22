public class H_01_OOPIII_Assoziation_Main {

    public static void main(String[] args) {

//        H_02_OOPIII_Assoziation_Computer cp1 = new H_02_OOPIII_Assoziation_Computer();
//        System.out.println(cp1.mainboard);
//
//        H_03_OOPIII_Assoziation_Mainboard board1 = new H_03_OOPIII_Assoziation_Mainboard();
//        System.out.println(board1);
//
//        cp1.mainboard = board1;
//        System.out.println(cp1.mainboard);

//        H_03_OOPIII_Assoziation_Mainboard board2 = new H_03_OOPIII_Assoziation_Mainboard();
//        H_02_OOPIII_Assoziation_Computer cp2 = new H_02_OOPIII_Assoziation_Computer("Intel", board2, 500);
//
//        H_03_OOPIII_Assoziation_Mainboard mainboardAsus = new H_03_OOPIII_Assoziation_Mainboard(4, 2, 4);
//        H_02_OOPIII_Assoziation_Computer computerPeter = new H_02_OOPIII_Assoziation_Computer("Intel", mainboardAsus, 400);
//        System.out.println(computerPeter.mainboard.usbPorts);
//
//        H_02_OOPIII_Assoziation_Computer computerOlga = new H_02_OOPIII_Assoziation_Computer(2, 1, 2, "AMD");
//        System.out.println(computerOlga.mainboard.ramSlots);

        H_02_OOPIII_Assoziation_Computer cp2;
        cp2 = new H_02_OOPIII_Assoziation_Computer()

    // https://stackoverflow.com/questions/4815301/can-intellij-auto-complete-constructor-parameters-on-new-expression


        H_04_OOPIII_Assoziation_Auto bmw = new H_04_OOPIII_Assoziation_Auto("BMW", "Goodyear", "Winterreifen");
        H_04_OOPIII_Assoziation_Auto vw = new H_04_OOPIII_Assoziation_Auto("VW", "Michelin", "Sommerreifen");

        bmw.ausgabeDaten();
        vw.ausgabeDaten();
    }
}