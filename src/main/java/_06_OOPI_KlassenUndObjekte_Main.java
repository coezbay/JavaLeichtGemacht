public class _06_OOPI_KlassenUndObjekte_Main {

    public static void main(String[] args) {
        // Dingo Dongo

        int zahl = 4;
        System.out.println(zahl);

        // Datentyp variableNamen = new Konstruktor();
        _06_OOPI_KlassenUndObjekte_Auto bmw = new _06_OOPI_KlassenUndObjekte_Auto();
        System.out.println(bmw);
        bmw.preis = 5000;
        bmw.marke = "BMW";

        System.out.println("Preis: " + bmw.preis + " Marke: " + bmw.marke);

//        _06_OOPI_Auto audi = new _06_OOPI_Auto();
//        audi.preis = 6000;
//        audi.marke = "Audi";
//
//        System.out.println("Preis: " + audi.preis + " Marke: " + audi.marke);
//
//        _06_OOPI_Auto vw = new _06_OOPI_Auto();
//        vw.preis = 3000;
//        vw.marke = "VW";
//
//        System.out.println("Preis: " + vw.preis + " Marke: " + vw.marke);

        _06_OOPI_KlassenUndObjekte_Auto audi = new _06_OOPI_KlassenUndObjekte_Auto(4, 5000, "Audi");
        System.out.println("Reifenanzahl: " + audi.reifen + " Preis: " + audi.preis + " Marke: " + audi.marke);
        _06_OOPI_KlassenUndObjekte_Auto vw = new _06_OOPI_KlassenUndObjekte_Auto(4, 6000, "VW");

        audi.gasgeben();
        audi.bremsen();

        audi.vergleichePreis(4000);
    }

}
