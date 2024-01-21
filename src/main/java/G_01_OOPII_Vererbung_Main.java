public class G_01_OOPII_Vererbung_Main {

    public static void main(String[] args) {

        G_02_OOPII_Vererbung_Hund bello = new G_02_OOPII_Vererbung_Hund("Bello", 3, 5, 42);
        bello.essen();

        G_03_OOPII_Vererbung_Kuh olga = new G_03_OOPII_Vererbung_Kuh("Olga", 150, 600, 4);
        olga.essen();

        G_06_OOPII_Vererbung_BMW x1 = new G_06_OOPII_Vererbung_BMW(130, 4, "Kompakt-SUV", true);

        G_07_OOPII_Vererbung_Audi a3 = new G_07_OOPII_Vererbung_Audi(180, 4, "Kompaktklasse", false);
        a3.starten();
    }
}