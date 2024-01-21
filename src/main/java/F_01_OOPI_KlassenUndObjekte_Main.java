public class F_01_OOPI_KlassenUndObjekte_Main {

    public static void main(String[] args) {

        int zahl = 4;
        System.out.println(zahl);

        // Datentyp variableNamen = new Konstruktor();
//        F_02_OOPI_KlassenUndObjekte_Auto bmw = new F_02_OOPI_KlassenUndObjekte_Auto();
//        System.out.println(bmw);
//        bmw.preis = 7000;
//        bmw.marke = "BMW";
//
//        System.out.println("Preis: " + bmw.preis + " Marke: " + bmw.marke);
//        bmw.gasgeben();
//        bmw.bremsen();
//        bmw.vergleichePreis(2000);

//        F_02_OOPI_KlassenUndObjekte_Auto audi = new F_02_OOPI_KlassenUndObjekte_Auto();
//        audi.preis = 6000;
//        audi.marke = "Audi";
//
//        System.out.println("Preis: " + audi.preis + "Marke: " + audi.marke);
//
//        F_02_OOPI_KlassenUndObjekte_Auto vw = new F_02_OOPI_KlassenUndObjekte_Auto();
//        vw.preis = 3000;
//        vw.marke = "VW";
//
//        System.out.println("Preis: " + vw.preis + "Marke: " + vw.marke);

        F_02_OOPI_KlassenUndObjekte_Auto audi = new F_02_OOPI_KlassenUndObjekte_Auto(4, 5000, "Audi");
        System.out.println("Reifenanzahl: " + audi.reifen + " Preis: " + audi.preis + " Marke: " + audi.marke);

        F_02_OOPI_KlassenUndObjekte_Auto vw = new F_02_OOPI_KlassenUndObjekte_Auto(4, 6000, "VW");
        System.out.println("Reifenanzahl: " + vw.reifen + " Preis: " + vw.preis + " Marke: " + vw.marke);

        audi.gasgeben();
        audi.bremsen();

        audi.vergleichePreis(4000);

        F_03_OOPI_KlassenUndObjekte_Hund bello = new F_03_OOPI_KlassenUndObjekte_Hund(4, "Bello", "Hovawart");
        bello.bellen();

        F_03_OOPI_KlassenUndObjekte_Hund klara = new F_03_OOPI_KlassenUndObjekte_Hund(5, "Klara", "Hovawart");
        klara.bellen();

        F_04_OOPI_KlassenUndObjekte_Laptop samsungLaptop = new F_04_OOPI_KlassenUndObjekte_Laptop(8, 600, "Samsung");
        System.out.println("Der Laptop von " + samsungLaptop.marke + " kostet " + samsungLaptop.preis + " hat " + samsungLaptop.ram + " GB RAM und kostet " + samsungLaptop.preis + " Euro.");

        F_04_OOPI_KlassenUndObjekte_Laptop medionLaptop = new F_04_OOPI_KlassenUndObjekte_Laptop(4, 400, "Medion");
        System.out.println("Der Laptop von " + medionLaptop.marke + " kostet " + medionLaptop.preis + " hat " + medionLaptop.ram + " GB RAM und kostet " + medionLaptop.preis + " Euro.");

        samsungLaptop.getData();
        medionLaptop.getData();

        F_02_OOPI_KlassenUndObjekte_Auto bmw = new F_02_OOPI_KlassenUndObjekte_Auto();
        bmw.marke = "BMW";
        bmw.bremsen();

        F_02_OOPI_KlassenUndObjekte_Auto.ausgabe();
    }
}
