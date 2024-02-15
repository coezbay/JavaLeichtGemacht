/*

    Variablen in Java sind Grundelemente der Programmierung, die zum Speichern von Daten verwendet werden.
    Jede Variable in Java hat einen spezifischen Datentyp, der bestimmt, welche Art von Daten sie speichern kann und wie viel Speicherplatz sie benötigt.


    Hier sind einige wichtige Aspekte von Variablen in Java:


    Deklaration:
    Eine Variable wird deklariert, indem man zuerst ihren Datentyp angibt und dann ihren Namen.

    Beispiel: int zahl;
    Hier ist int der Datentyp (für ganze Zahlen) und zahl ist der Name der Variablen.

    Zu Beginn habe ich den Speicherplatz erwähnt.
    Die Größe eines int (Integer, Ganzzahl) in der Informatik hängt von der Programmiersprache und dem verwendeten System (Betriebssystem und Hardware) ab.
    In vielen Programmiersprachen und Systemen ist ein int typischerweise 32 Bit oder 4 Byte groß.
    Dies ermöglicht es, Werte im Bereich von -2,147,483,648 bis 2,147,483,647 für vorzeichenbehaftete Integers (mit Vorzeichen) zu speichern.
    Bei vorzeichenlosen Integers (ohne Vorzeichen) liegt der Bereich von 0 bis 4,294,967,295.
    In einigen Systemen oder Programmiersprachen kann ein int jedoch auch 16 Bit (2 Byte) oder 64 Bit (8 Byte) groß sein.
    Bei einem 16-Bit-int ist der Wertebereich für vorzeichenbehaftete Integers -32,768 bis 32,767 und für vorzeichenlose Integers 0 bis 65,535.
    Ein 64-Bit-int hat einen Wertebereich von -9,223,372,036,854,775,808 bis 9,223,372,036,854,775,807 für vorzeichenbehaftete Integers
    und von 0 bis 18,446,744,073,709,551,615 für vorzeichenlose Integers.
    Es ist wichtig, die spezifischen Details und Beschränkungen der verwendeten Programmiersprache und des Systems zu kennen,
    um die geeignete Größe und den Typ für die benötigten Daten zu wählen. Dazu aber später mehr.


    Initialisierung:
    In der Programmierung bedeutet dies, einer Variablen bei ihrer Deklaration einen Anfangswert zuzuweisen.
    Dieser Schritt ist wichtig, da er die Variable in einen definierten Zustand versetzt, bevor sie im weiteren Programmverlauf verwendet wird.
    Ohne Initialisierung könnte eine Variable einen unbestimmten Wert enthalten (abhängig von der Programmiersprache und dem Kontext),
    was zu unvorhersehbaren Ergebnissen oder Fehlern führen kann.

    Eine Variable kann bei der Deklaration initialisiert werden, indem ihr ein Anfangswert zugewiesen wird.
    Zum Beispiel: int zahl = 5; weist der Variablen zahl den Wert 5 zu.

    Die Initialisierung kann direkt bei der Deklaration der Variablen erfolgen, wie in dem Beispiel int zahl = 5;,
    wo die Variable zahl vom Typ int (Ganzzahl) deklariert und gleichzeitig mit dem Wert 5 initialisiert wird.
    Dieser Vorgang legt fest, dass zahl von Beginn an den Wert 5 hat.

    In manchen Programmiersprachen und Situationen kann die Initialisierung auch nach der Deklaration erfolgen.
    Auch vor der ersten Verwendung der Variablen.

    In dem nachfolgenden Beispiel wird die Variable zahl zuerst deklariert, ohne ihr einen Wert zuzuweisen.
    Erst in einem späteren Schritt wird ihr der Wert 5 zugewiesen.
    Es ist jedoch eine gute Praxis, Variablen bei der Deklaration zu initialisieren.
    Besonders um Klarheit zu schaffen und Fehler durch uninitialisierte Variablen zu vermeiden.

    Beispiel:

    int zahl; // Deklaration
    zahl = 5; // Initialisierung


    Datentypen:
    In Java gibt es verschiedene Datentypen für Variablen, darunter:

    Primitive Datentypen:
    int (für ganze Zahlen), double (für Fließkommazahlen), char (für einzelne Zeichen) und boolean (für Wahrheitswerte wahr/falsch).
    Neben diesen primitiven Datentypen gibt es noch weitere primitive Datentypen wie byte, short und float.
    Insgesamt sind es 8 primitive Datentypen. Mehr gibt es in Java glücklicherweise nicht. Dafür umso mehr von den Referenztypen.
    Java unterscheidet zwischen diesen primitiven Datentypen und Referenztypen.


    Nicht-primitive Datentypen (Referenztypen bzw. komplexe Datentypen):
    String (für Text), Arrays und Objekte.

    "Neben Strings, Arrays und Objekten, existieren, wenn man es nicht genau nimmt, weitaus mehr komplexe Datentypen.
     Nachdem ich es persönlich erst relativ spät in Erfahrung gebracht habe und mir normalerweise immer erst gerne einen groben
     Überblick über eine neue Sache verschaffen möchte bevor ich sie erlerne, hier noch ein paar weitere komplexe Datentypen:

     Collections (List, Set, Map), Interfaces, Enums, Generics, Wrapper-Klassen, Funktional Interfaces,
     Datenstrukturen (Linked Lists, Bäume, Graphen, Stacks, Queues, Hash Tables), Multithreading- und Synchronisationskonstrukte,
     Streams und Lambdas, Annotations, Module und Packages, Generators und Iterators, Futures und Promises, Optionals, Records,
     Reflection und Introspection, Entwurfsmuster (z.B. Decorator, Observer), Dependency Injection Frameworks (z.B. Spring Framework),
     Reaktive Streams und Frameworks (z.B. RxJava, Project Reactor), Websockets und Netzwerkprotokolle,
     Big Data-Verarbeitungswerkzeuge (z.B. Apache Hadoop, Apache Spark), Maschinelles Lernen und KI-Bibliotheken (z.B. TensorFlow, pandas),
     Graphendatenbanken und Frameworks (z.B. Neo4j).

     In Java gibt es, wie bereits erwähnt, eine sehr große Anzahl von Referenztypen, auch komplexe Datentypen genannt.
     Ihre genaue Anzahl ist nicht fest definiert, da Java ständig weiterentwickelt wird und neue Klassen und Interfaces hinzugefügt werden können.

     Ja, zusätzlich zur Standardbibliothek und externen Bibliotheken können Entwickler auch eigene Klassen und Interfaces definieren,
     bei denen es sich ebenfalls um komplexe Datentypen handelt.

     Was die Gesamtzahl der möglichen Referenztypen in Java praktisch unbegrenzt macht ;)


    Geltungsbereich (Scope):
    Der Geltungsbereich einer Variablen bestimmt, wo sie im Code verwendet werden kann.
    Zum Beispiel sind Variablen, die innerhalb einer Methode deklariert werden, nur in dieser Methode sichtbar.

    Veränderbarkeit:
    Der Wert einer Variablen kann im Laufe des Programms verändert werden, es sei denn, die Variable ist als final deklariert.
    Eine final Variable muss bei der Deklaration initialisiert werden und ihr Wert kann nicht geändert werden.

    Konventionen für Variablennamen:
    In Java gibt es bestimmte Konventionen für die Benennung von Variablen.
    Typischerweise beginnen Variablennamen mit einem Kleinbuchstaben und folgen dem CamelCase-Format, z.B. meineVariable.

    Nachfolgend ist ein einfaches Beispiel, wie man Variablen in Java verwenden kann:

*/

public class A_01_Grundlagen_Variablen {
    int meinAlter = 30;
}