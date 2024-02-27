package com.javaleichtgemacht.adressbuch;

import java.util.ArrayList;
import java.util.List;

public class Adressbuch {
    private final List<Contact> contacts;

    public Adressbuch() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public String findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact.getDetails();
            }
        }
        return "Kontakt nicht gefunden.";
    }

    public void listAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getDetails());
        }
    }
}