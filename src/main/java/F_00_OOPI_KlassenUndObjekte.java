public class F_00_OOPI_KlassenUndObjekte {

    /*
        In Java, wie in vielen anderen objektorientierten Programmiersprachen, sind Klassen und Objekte grundlegende Konzepte, die eng miteinander verbunden sind.


        Klassen in Java

        Eine Klasse in Java ist ein Bauplan oder eine Vorlage für Objekte. Sie definiert den Zustand und das Verhalten, die die Objekte der Klasse haben können.
        Der Zustand einer Klasse wird durch ihre Felder (Variablen) repräsentiert, und das Verhalten wird durch Methoden (Funktionen) definiert.
        Eine Klasse ist eine abstrakte Definition oder ein Konzept. Sie existiert im Code, aber nicht im Speicher des Computers, bis sie instanziiert wird.
        Klassen können auch Konstruktoren enthalten, spezielle Methoden, die beim Erstellen eines neuen Objekts aufgerufen werden, um den Anfangszustand des Objekts zu initialisieren.
        In Java wird eine Klasse definiert mit dem Schlüsselwort class gefolgt von einem Namen und einem Block von geschweiften Klammern, der die Definitionen von Feldern, Methoden und Konstruktoren enthält.


        Objekte in Java

        Ein Objekt ist eine Instanz einer Klasse. Wenn eine Klasse der Bauplan ist, dann ist ein Objekt ein konkretes Gebäude, das auf der Grundlage dieses Bauplans gebaut wurde.
        Jedes Objekt hat seinen eigenen Zustand, der von anderen Objekten unabhängig ist, selbst wenn sie von derselben Klasse sind. Der Zustand eines Objekts wird durch die Werte seiner Attribute (Variablen) bestimmt.
        Objekte haben auch Verhalten, das durch die Methoden ihrer Klasse definiert wird. Diese Methoden können aufgerufen werden, um mit dem Objekt zu interagieren, seinen Zustand zu verändern oder Informationen über seinen Zustand zu erhalten.
        Objekte werden in Java mit dem Schlüsselwort new und einem Konstruktoraufruf erstellt.


        Beispiel in Java:

        public class Auto {
            // Felder (Zustand)
            String marke;
            int baujahr;

            // Konstruktor
            public Auto(String marke, int baujahr) {
                this.marke = marke;
                this.baujahr = baujahr;
            }

            // Methode (Verhalten)
            public void hupen() {
                System.out.println("Hup, hup!");
            }
        }

        // Objekterstellung
        Auto meinAuto = new Auto("Toyota", 2021);
        meinAuto.hupen();  // ruft die Methode hupen auf dem Objekt meinAuto auf

        In diesem Beispiel ist Auto eine Klasse, die das Konzept eines Autos mit Eigenschaften wie marke und baujahr und einem Verhalten hupen definiert.
        meinAuto ist ein Objekt dieser Klasse, das konkret ein Auto repräsentiert, das von Toyota im Jahr 2021 hergestellt wurde.
        Jedes Auto-Objekt, das erstellt wird, kann unterschiedliche Werte für seine Eigenschaften haben, aber es teilt das gleiche Verhaltensmuster, das durch die Auto-Klasse definiert ist.
     */
}
