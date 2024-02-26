import java.util.Scanner;

public class Z_JavaQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String[] questions = {
                "Was ist Java?",
                "Welches Konzept ist NICHT Teil von Java?",
                "Was bedeutet OOP?",
                "Was ist der Zweck des Schlüsselwortes 'final' in Java?",
                "Wie wird ein unveränderliches Objekt in Java erstellt?",
                "Welches Interface wird in Java für Sortieroperationen verwendet?",
                "Was ist der Unterschied zwischen 'abstract class' und 'interface' in Java?",
                "Was bedeutet das Schlüsselwort 'synchronized' in Java?",
                "Was ist ein Lambda-Ausdruck in Java?",
                "Was ist der Unterschied zwischen 'ArrayList' und 'LinkedList' in Java?",
                "Was ist der Zweck der 'main' Methode in Java?",
                "Wie fängt man eine Ausnahme in Java?",
                "Was ist der Unterschied zwischen 'public', 'private', und 'protected' Zugriffsmodifikatoren?",
                "Was ist ein 'Package' in Java und warum wird es verwendet?",
                "Wie kann man in Java einen Thread erstellen?",
                "Was ist der Unterschied zwischen 'throw' und 'throws' in Java?",
                "Erklären Sie das Konzept der Vererbung in Java.",
                "Was ist Polymorphismus in Java?",
                "Was ist der Zweck von 'super' in Java?",
                "Was versteht man unter 'Garbage Collection' in Java?",
                "Was ist 'Reflection' in Java und wofür wird es verwendet?",
                "Was bedeutet 'overloading' und 'overriding' von Methoden in Java?",
                "Wie funktioniert der 'try-with-resources' Block in Java?",
                "Was ist der Unterschied zwischen List und Set in Java?",
                "Wie kann man in Java einen Lambda-Ausdruck verwenden?",
                "Was ist der Zweck des 'default' Schlüsselworts in einem Interface in Java?",
                "Was beschreibt das Konzept der 'Generics' in Java?",
                "Was ist der Unterschied zwischen Checked und Unchecked Exceptions?",
                "Wie funktioniert das 'Stream' API in Java?",
                "Was ist der Unterschied zwischen 'final', 'finally' und 'finalize' in Java?",
                "Wie kann man das Singleton-Designmuster in Java implementieren?",
                "Was ist der Zweck der 'transient' und 'volatile' Modifikatoren?",
                "Wie unterscheiden sich '=='' und 'equals()' bei der Prüfung von Strings in Java?"
        };
        String[][] options = {
                {"1. Eine Insel", "2. Eine Programmiersprache", "3. Ein Getränk"},
                {"1. Vererbung", "2. Kapselung", "3. Mehrfachvererbung"},
                {"1. Objekt orientierte Programmierung", "2. Out Of Print", "3. Offizieller olympischer Partner"},
                {"1. Eine Klasse als unveränderlich zu markieren", "2. Eine Methode zu verhindern, dass sie überschrieben wird", "3. Den Wert einer Variablen unveränderlich zu machen"},
                {"1. Durch Verwendung des 'final' Schlüsselwortes", "2. Durch das Verbergen des Konstruktors", "3. Durch keine Setter-Methoden"},
                {"1. List", "2. Set", "3. Comparable und Comparator"},
                {"1. 'abstract class' kann Methodenimplementierungen enthalten, 'interface' nicht", "2. Ein Interface kann Zustände speichern, eine abstrakte Klasse nicht", "3. Es gibt keinen Unterschied"},
                {"1. Markiert eine Methode, die über Threads hinweg sicher ist", "2. Erzwingt die serielle Ausführung von Methoden", "3. Beides"},
                {"1. Eine anonyme innere Klasse", "2. Eine spezielle Art von Funktion in Java 8", "3. Ein spezieller Operator"},
                {"1. 'ArrayList' ist schneller beim Hinzufügen von Elementen", "2. 'LinkedList' ist schneller beim Einfügen und Entfernen von Elementen in der Mitte", "3. Beide haben die gleiche Leistung"},
                {"1. Um das Programm auszuführen", "2. Um Daten zu initialisieren", "3. Um Speicher freizugeben"},
                {"1. Mit einem 'try-catch' Block", "2. Mit einem 'throw' Schlüsselwort", "3. Mit einem 'throws' Schlüsselwort in der Methodensignatur"},
                {"1. 'public' ist überall zugänglich, 'private' nur innerhalb der Klasse, 'protected' innerhalb des Pakets und in Subklassen", "2. Es gibt keinen Unterschied zwischen 'protected' und 'private'", "3. 'public' und 'protected' sind identisch"},
                {"1. Eine Gruppe von verwandten Klassen und Interfaces", "2. Eine Sammlung von Daten", "3. Ein Speicherbereich"},
                {"1. Durch Implementierung des Runnable-Interfaces", "2. Durch Verwendung eines Executors", "3. Beides"},
                {"1. 'throw' wird innerhalb einer Methode verwendet, 'throws' in der Methodensignatur", "2. 'throw' initiiert eine Ausnahme, 'throws' behandelt sie", "3. 'throw' und 'throws' sind synonym"},
                {"1. Das Kopieren von Methoden von einer Klasse zur anderen", "2. Das Bereitstellen einer Basis für neue Klassen", "3. Die Nutzung von Methoden einer Klasse in einer anderen ohne Vererbung"},
                {"1. Die Fähigkeit, viele Formen anzunehmen", "2. Eine Methode in der Kindklasse, die die Methode der Elternklasse überschreibt", "3. Ein Interface mit mehreren Implementierungen"},
                {"1. Um auf die Mitglieder der übergeordneten Klasse zuzugreifen", "2. Um eine übergeordnete Klasse zu deklarieren", "3. Um eine Methode in der aktuellen Klasse zu überschreiben"},
                {"1. Automatische Speicherbereinigung von ungenutzten Objekten", "2. Manuelle Speicherverwaltung durch den Programmierer", "3. Ein Tool zur Speicheroptimierung"},
                {"1. Die Fähigkeit, Klassen zur Laufzeit zu inspizieren und zu modifizieren", "2. Ein Framework zur Webentwicklung", "3. Eine Methode zur Fehlerbehebung"},
                {"1. 'Overloading' bezieht sich auf Methoden mit demselben Namen aber unterschiedlichen Parametern, 'overriding' auf das Überschreiben einer Methode in einer Unterklasse", "2. 'Overloading' erfolgt zur Laufzeit, 'overriding' zur Kompilierzeit", "3. Es gibt keinen Unterschied"},
                {"1. Automatisches Schließen von Ressourcen am Ende des Blocks", "2. Ein spezieller Typ von Exception-Handling", "3. Ein Block, der mit 'try' beginnt und mit 'resources' endet"},
                {"1. List erlaubt Duplikate, Set nicht", "2. Set ist schneller als List", "3. List ist geordnet, Set unordered"},
                {"1. Zum Erstellen anonymer Klassen", "2. Als verkürzte Schreibweise für Interfaces mit nur einer Methode", "3. Zum Ersetzen von regulären Ausdrücken"},
                {"1. Um eine Methode in einem Interface als optional zu deklarieren", "2. Um eine Methode mit einer Standardimplementierung zu versehen", "3. Zum Definieren von Konstanten in Interfaces"},
                {"1. Ein Mechanismus zur Typüberprüfung bei der Kompilierung", "2. Eine spezielle Art von Java-Collection", "3. Ein Werkzeug zur Optimierung der Laufzeitperformance"},
                {"1. Checked müssen explizit behandelt werden, Unchecked nicht", "2. Unchecked sind schwerwiegender als Checked", "3. Checked sind Runtime Exceptions, Unchecked Compile-Time"},
                {"1. Eine Datenstruktur", "2. Eine Methode zur parallelen Ausführung von Code", "3. Eine API zur Verarbeitung von Collections mit funktionalen Ansätzen"},
                {"1. 'final' macht eine Variable unveränderlich, 'finally' ist ein Block, der immer ausgeführt wird, 'finalize' ist eine Methode, die vor der Garbage Collection aufgerufen wird", "2. Alle drei Schlüsselwörter sind Synonyme", "3. 'finalize' ist eine veraltete Methode zum Freigeben von Ressourcen"},
                {"1. Durch Verwendung eines globalen Arrays", "2. Mit einer statischen Methode, die eine einzige Instanz zurückgibt", "3. Durch Verwendung von Enum"},
                {"1. 'transient' verhindert die Serialisierung, 'volatile' sorgt für Sichtbarkeit von Änderungen in Threads", "2. Beide verhindern die Serialisierung von Variablen", "3. 'transient' ist für temporäre Variablen, 'volatile' für konstante Werte"},
                {"1. '==' prüft auf Referenzgleichheit, 'equals()' auf inhaltliche Gleichheit", "2. 'equals()' ist langsamer als '=='", "3. Es gibt keinen Unterschied bei Strings"}
        };
        int[] answers = {2, 3, 1, 3, 3, 3, 1, 3, 2, 2, 1, 1, 1, 1, 3, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 3, 1, 2, 1, 1};

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". Frage: " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Deine Antwort (1, 2, 3): ");
            int answer = scanner.nextInt();
            if (answer == answers[i]) {
                System.out.println("Richtig!");
                score++;
            } else {
                System.out.println("Falsch!");
            }
            System.out.println();
        }

        System.out.println("Du hast " + score + " von " + questions.length + " Fragen richtig beantwortet.");
        scanner.close();
    }
}