package com.javaleichtgemacht.adressbuch;

public class Main {
    public static void main(String[] args) {
        Adressbuch meinAdressbuch = new Adressbuch();

        // Hinzufügen von Kontakten
        Contact contact1 = new Contact("Max Mustermann", "0123456789", "max@beispiel.com");
        Contact contact2 = new Contact("Min Mustermann", "9876543210", "min@beispiel.com");
        meinAdressbuch.addContact(contact1);
        meinAdressbuch.addContact(contact2);

        // Auflisten aller Kontakte
        System.out.println("Alle Kontakte:");
        meinAdressbuch.listAllContacts();

        // Einen Kontakt suchen
        System.out.println("\nSuche nach Min:");
        System.out.println(meinAdressbuch.findContact("Min Mustermann"));

        // Einen Kontakt entfernen und erneut auflisten
        System.out.println("\nNach dem Entfernen von Max:");
        meinAdressbuch.removeContact("Max Mustermann");
        meinAdressbuch.listAllContacts();
    }
}