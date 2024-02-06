/*
    "Hello World" in Java ist ein einfaches Programm, dass in der Programmiersprache Java geschrieben ist und den Text "Hello, World!"
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

    Es folgt ein typisches "Hello World"-Programm in Java:
 */

public class A_00_Grundlagen_HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");
    }
}

/*
    In diesem Beispiel passiert Folgendes:
    public class HelloWorld "In diesem Fall natürlich (public class A_00_Grundlagen_HelloWorld)" definiert eine Klasse namens HelloWorld "In diesem Fall (A_00_Grundlagen_HelloWorld)".

    public static void main(String[] args) ist die Hauptmethode, der Einstiegspunkt des Programms.
    In Java bezeichnet main eine spezielle Methode, die den Einstiegspunkt für die Ausführung eines Programms darstellt.
    Wenn ein Java-Programm gestartet wird, sucht die Java Virtual Machine (JVM) nach einer Methode mit der Signatur public static void main(String[] args), um das Programm auszuführen.
    Die main-Methode ist also der Startpunkt, von dem aus die JVM beginnt, den Code eines Java-Programms auszuführen.
    Und ja, man könnte meinen, dass ein Refactoring fällig ist, bei dem die ganzen Main Methoden entfernt werden könnten ;)

    Die Komponenten der main-Methode sind wie folgt:

    - public: Ein Zugriffsmodifikator, der angibt, dass die Methode von überall her aufgerufen werden kann.

    - static: Bedeutet, dass die Methode auf Klassenebene vorhanden ist und nicht auf ein Objekt der Klasse instanziiert werden muss, um aufgerufen zu werden.

    - void: Der Rückgabetyp der Methode, der in diesem Fall angibt, dass die main-Methode keinen Wert zurückgibt.

    - main: Der Name der Methode, der von der JVM als Startpunkt des Programms erkannt wird.

    - String[] args: Ein Parameter, der ein Array von String-Objekten akzeptiert. Dieses Array enthält die Argumente, die über die Kommandozeile an das Programm übergeben werden können, wenn das Programm gestartet wird.

    - System.out.println("Hello, World!"); ist eine Anweisung, die den Text "Hello, World!" auf dem Bildschirm ausgibt.

        In Java sind println und print Methoden der Klasse PrintStream, die häufig verwendet werden, um Text auf der Konsole auszugeben.
        Diese Methoden werden typischerweise über das System.out Objekt aufgerufen (In IntelliJ kann man das Kürzel "sout" verwenden und IntelliJ nimmt eine Autovervollständigung vor.
        Gerade am Anfang bildet dies eine immense Zeitersparnis. Auch bietet es sich an, sich gleich zu Beginn mit den Tastenkürzeln der jeweiligen IDE, mit der man arbeitet, vertraut zu machen.),
        das eine vordefinierte Instanz von PrintStream ist, welche mit der Standardausgabe der Konsole (in der Regel dem Bildschirm) verbunden ist.

        Eine kurze Beschreibung jeder Methode:

        println
        Die Methode println wird verwendet, um eine Nachricht auf der Konsole auszugeben und anschließend einen Zeilenumbruch hinzuzufügen.
        Das bedeutet, dass nach der Ausgabe des Textes der Cursor automatisch in die nächste Zeile springt.
        Wenn Sie mehrere Aufrufe von println hintereinander verwenden, wird jede Nachricht in einer neuen Zeile ausgegeben.
        Syntaxbeispiel: System.out.println("Nachricht");

        print
        Die Methode print wird ebenfalls verwendet, um eine Nachricht auf der Konsole auszugeben, fügt jedoch keinen Zeilenumbruch hinzu.
        Das bedeutet, dass der Cursor am Ende der ausgegebenen Nachricht bleibt, und weitere Ausgaben werden in derselben Zeile fortgesetzt.
        Wenn Sie mehrere Aufrufe von print hintereinander verwenden, werden alle Nachrichten nacheinander in derselben Zeile ausgegeben.
        Syntaxbeispiel: System.out.print("Nachricht");
*/