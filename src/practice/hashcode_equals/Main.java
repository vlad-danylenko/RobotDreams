package src.practice.hashcode_equals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact(124, "Vasiliy", "380681234136");
        Contact contact2 = new Contact(124, "Vasiliy", "380681234136");

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(contact2);
        System.out.println(contacts.contains(contact2));
        System.out.println(contacts.indexOf(contact2));
        System.out.println(contacts.get(0));

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());

        System.out.println(contact1.equals(contact2));
    }
}
