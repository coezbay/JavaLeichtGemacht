/*

    Grundsätzlich:

    "Hello World" in Java ist ein einfaches Programm, dass in der Programmiersprache Java geschrieben ist und den Text "Hello World!"
    auf dem Bildschirm ausgibt.

    Es ist eines der grundlegendsten und am häufigsten verwendeten Beispiele in der Entwickler- bzw. Programmierausbildung.

    Der Hauptzweck eines solchen Programms besteht darin:

    Einführung in eine Programmiersprache:
    Für Anfänger ist das "Hello World"-Programm eine einfache und leicht verständliche Möglichkeit,
    mit den Grundlagen einer neuen Programmiersprache vertraut zu werden.
    Es hilft, grundlegende Konzepte wie die Syntax und Struktur der Sprache zu verstehen.

    Testen der Entwicklungsumgebung:
    "Hello World" dient auch dazu, sicherzustellen, dass die Entwicklungsumgebung (wie IDEs, Compiler, Interpreter etc.)
    korrekt eingerichtet und funktionsfähig ist.
    Wenn das Programm erfolgreich ausgeführt wird, bedeutet es, dass alles richtig installiert und konfiguriert wurde.

    Einstiegspunkt für komplexere Projekte:
    Es bildet eine Grundlage, auf der Anfänger aufbauen und komplexere Programme entwickeln können.
    Indem man mit etwas Einfachem beginnt, wird der Lernprozess schrittweise und weniger überwältigend.

    Im Anschluss folgt ein typisches "Hello World"-Programm in Java:

*/

public class A_00_Grundlagen_HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
    }
}

/*

    Achtung! Normalerweise werden Kommentare in Java, sowie in vielen anderen Programmiersprachen, oberhalb des Codes platziert, den sie beschreiben.
    So ist es üblich und wird als Best Practice angesehen. Das macht den Code leichter lesbar und verständlich.

    Besonders auch deshalb, weil der Kommentar als eine Art Einleitung oder Erklärung für den nachfolgenden Codeblock dient.
    Kommentare können verwendet werden, um die Funktionalität, den Zweck oder besondere Aspekte des Codes zu erläutern, bevor der Code selbst gelesen wird.
    Hier, in diesem speziellen Fall und in den nachfolgenden Klassen sowie Dateien, werde ich dieses Pattern zu Lernzwecken brechen.

    Zurück zu unserem Beispiel:
    public class HelloWorld "In diesem Fall natürlich (public class A_00_Grundlagen_HelloWorld)" definiert eine Klasse namens HelloWorld "In diesem Fall (A_00_Grundlagen_HelloWorld)".

    public static void main(String[] args) ist die Hauptmethode und somit der Einstiegspunkt des Programms.
    In Java bezeichnet main eine spezielle Methode, die den Einstiegspunkt für die Ausführung eines Programms darstellt.
    Wenn ein Java-Programm gestartet wird, sucht die Java Virtual Machine (JVM) nach einer Methode mit der Signatur public static void main(String[] args), um das Programm auszuführen.
    Die main-Methode ist also der Startpunkt, von dem aus die JVM beginnt, den Code eines Java-Programms auszuführen.
    Und ja, man könnte meinen, dass ein Refactoring fällig ist, bei dem die ganzen Main Methoden entfernt werden könnten ;)
    ... Werde ich aber allein aus Lernzwecken nicht machen.

    Die Komponenten der main-Methode sind wie folgt:

    - public: Ein Zugriffsmodifikator, der angibt, dass die Methode von überall aus aufgerufen werden kann.

    - static: Bedeutet, dass die Methode auf Klassenebene vorhanden ist und nicht auf ein Objekt der Klasse instanziiert werden muss, um aufgerufen zu werden.

    - void: Der Rückgabetyp der Methode, der in diesem Fall angibt, dass die main-Methode keinen Wert zurückgibt.

    - main: Der Name der Methode, der von der JVM als Startpunkt des Programms erkannt wird.

    - String[] args: Ein Parameter, der ein Array von String-Objekten akzeptiert.
      Dieses Array enthält die Argumente, die über die Kommandozeile an das Programm übergeben werden können, wenn man das Programm startet.

    - System.out.println("Hello World!"); ist eine Anweisung, die den Text "Hello, World!" auf dem Bildschirm ausgibt.

        In Java sind println und print Methoden der Klasse PrintStream, die häufig verwendet werden, um Text auf der Konsole auszugeben.
        Diese Methoden werden typischerweise über das System.out Objekt aufgerufen
        (In IntelliJ kann man das Kürzel "sout" verwenden und IntelliJ nimmt eine Autovervollständigung vor.
        Gerade am Anfang bildet dies eine immense Zeitersparnis.
        Auch bietet es sich an, sich gleich zu Beginn mit den Tastenkürzeln der jeweiligen IDE, mit der man arbeitet, vertraut zu machen.),
        dass eine vordefinierte Instanz von PrintStream ist, die mit der Standardausgabe der Konsole (in der Regel dem Bildschirm) verbunden ist.


    Anmerkung: Formatierungsstile für Klassen und Methoden in Java (Leerzeile oder keine Leerzeile?)

    Eines meiner Recherchen hat ergeben, dass die Wahl zwischen den beiden Formatierungsstilen letztlich eine Frage des persönlichen oder teambasierten Codierungsstandards
    und der Lesbarkeit ist. Beide Stile sind technisch korrekt und funktionieren in Java einwandfrei.

    Es gibt jedoch allgemeine Konventionen und Best Practices, die in der Java-Community verbreitet sind:

    Ohne Leerzeile nach der Klassendefinition:

    public class A_09_Grundlagen_OperatorenII {
    public static void main(String[] args) {

    Dieser Stil hält den Code kompakt und ist besonders nützlich, wenn die Klasse nur wenige Methoden oder Felder enthält.
    Es hilft, den sichtbaren Code auf dem Bildschirm zu maximieren, besonders bei der Arbeit mit kleineren Displays oder in Umgebungen,
    wo viele Codeblöcke gleichzeitig sichtbar sein sollen.

    Mit einer Leerzeile nach der Klassendefinition:

    public class A_09_Grundlagen_OperatorenII {

    public static void main(String[] args) {

    Dieser Stil erhöht die Lesbarkeit, indem er visuell die Definition der Klasse von ihren Inhalten trennt.
    Viele Entwickler und einige populäre Stilführer bevorzugen diese Methode, da sie den Code etwas organisierter und leichter zu lesen macht,
    insbesondere in Klassen mit vielen Methoden oder Feldern.

    Ich werde versuchen, mich an diesem Pattern zu orientieren ;)


    Eine kurze Beschreibung der beiden Methoden println und print:

    println
    Die Methode println wird verwendet, um eine Nachricht auf der Konsole auszugeben und anschließend einen Zeilenumbruch hinzuzufügen.
    Das bedeutet, dass nach der Ausgabe des Textes der Cursor automatisch in die nächste Zeile springt.
    Wenn man mehrere Aufrufe von println hintereinander verwendet, wird jede Nachricht in einer neuen Zeile ausgegeben.
    Syntaxbeispiel: System.out.println("Nachricht");

    print
    Die Methode print wird ebenfalls verwendet, um eine Nachricht auf der Konsole auszugeben.
    Es fügt jedoch keinen Zeilenumbruch hinzu.
    Dies bedeutet, dass der Cursor am Ende der ausgegebenen Nachricht bleibt und weitere Ausgaben werden in derselben Zeile fortgesetzt.
    Wenn man mehrere Aufrufe von print hintereinander verwendet, werden alle Nachrichten nacheinander in derselben Zeile ausgegeben.
    Syntaxbeispiel: System.out.print("Nachricht");

*/