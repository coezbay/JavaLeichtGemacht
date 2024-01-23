public class J_00_OOPV_AbstrakteKlasse {

    /*
        In der objektorientierten Programmierung, insbesondere in Sprachen wie Java, können keine Objekte aus abstrakten Klassen direkt erstellt werden.
        Der Grund dafür liegt in der Natur und dem Zweck abstrakter Klassen:

        Definition von abstrakten Klassen:
        Eine abstrakte Klasse ist eine Klasse, die nicht vollständig implementiert ist.
        Sie dient als Vorlage oder Blaupause für andere Klassen.
        Abstrakte Klassen können abstrakte Methoden enthalten, das sind Methoden ohne Implementierung.
        Sie bieten lediglich eine Deklaration (d.h. die Signatur der Methode), die von Unterklassen implementiert werden muss.

        Unvollständige Implementierung:
        Da abstrakte Klassen nicht vollständig implementiert sind (sie haben mindestens eine abstrakte Methode ohne Implementierung), können sie nicht direkt instanziiert werden.
        Eine Instanz einer Klasse muss alle Methoden implementiert haben, damit sie funktionsfähig ist.
        Bei einer abstrakten Klasse ist dies nicht der Fall, da mindestens eine Methode noch keine konkrete Funktionalität hat.

        Verwendung als Vorlage:
        Der Hauptzweck einer abstrakten Klasse ist es, als Vorlage für andere Klassen zu dienen.
        Sie definiert gemeinsame Eigenschaften und Verhaltensweisen, die in mehreren abgeleiteten Klassen gemeinsam genutzt werden können.
        Diese abgeleiteten Klassen, die von der abstrakten Klasse erben, müssen alle abstrakten Methoden implementieren, bevor sie instanziiert werden können.

        Förderung von Vererbung:
        Durch das Verbot der direkten Instanziierung abstrakter Klassen wird die Verwendung von Vererbung gefördert.
        Entwickler werden ermutigt, spezifischere Unterklassen zu erstellen, die die abstrakten Methoden implementieren und dadurch vollständige und instanziierbare Klassen werden.

        Design und Architektur:
        Abstrakte Klassen sind ein wichtiges Instrument für das Design von Software-Architekturen.
        Sie ermöglichen es, eine allgemeine Form und Struktur für eine Gruppe verwandter Klassen zu definieren, wobei die spezifischen Details in den Unterklassen ausgearbeitet werden.

        Zusammengefasst sind abstrakte Klassen in der objektorientierten Programmierung ein Mittel, um unvollständige Klassen zu definieren, die als Basis für andere Klassen dienen.
        Sie können nicht direkt instanziiert werden, da sie nicht vollständig implementiert sind und somit nicht alle Funktionen eines vollständigen Objekts bieten können.
        Stattdessen dienen sie als Grundlage für konkrete Klassen, die ihre abstrakten Methoden implementieren und somit vollständige und instanziierbare Einheiten darstellen.
     */

}
