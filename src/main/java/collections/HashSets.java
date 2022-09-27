package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    public static void main(String[] args) {

        /*
        hashSetWrapperClasses();

        hashSetObjects();
         */


        /*
        Sample usage of HashSet
         */
        HashSets hs = new HashSets();

        // mock inbound data: entity type (broker or customer)
        String entityType = "broker";
        //String entityType = "customer";

        switch (entityType) {
            case "customer":
                hs.sendDocuments(hs.getCustomerDocumentsRules());
                break;
            case "broker":
                hs.sendDocuments(hs.getBrokerDocumentsRules());
                break;
            default:
                break;
        }
    }

    /*
    Returns a set of rules for sending Customer documents
     */
    public HashSet<String> getCustomerDocumentsRules() {
        HashSet<String> rules = new HashSet<>();

        // Get the rules data from the DB
        rules.add("allow_mail");
        rules.add("allow_email");

        return rules;
    }

    /*
    Returns a set of rules for sending Broker documents
     */
    public HashSet<String> getBrokerDocumentsRules() {
        HashSet<String> rules = new HashSet<>();

        // Get the rules data from the DB
        rules.add("allow_b2b");
        rules.add("allow_email");

        return rules;
    }

    /*
    Send documents based on rules
     */
    public void sendDocuments(HashSet<String> rules) {
        if (rules.contains("allow_email")) {
            System.out.println("Documents sent through email...");
        }
        if (rules.contains("allow_mail")) {
            System.out.println("Documents sent through snail mail...");
        }
        if (rules.contains("allow_b2b")) {
            System.out.println("Documents sent through B2B chain...");
        }
    }

    public static void hashSetWrapperClasses() {
        // HashSet of wrapper classes

        // Define a HashSet
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Defined HashSet: " + hs);

        // Create elements in the set
        hs.add(3);
        hs.add(5);
        hs.add(6);
        hs.add(8);
        hs.add(9);
        System.out.println("Added numbers to the set: " + hs);

        // Add a duplicate value to the set
        hs.add(8);
        System.out.println("Attempted to add 8 to the set: " + hs);

        // Delete an element from the set
        // use the value to remove an element from the set, as HashSet in NOT index based
        hs.remove(9);
        System.out.println("Deleted number 9 from from the set: " + hs);

        // Loop through the set
        System.out.println("Loop through the set using for each:");
        for (Integer num :hs) {
            System.out.println(num);
        }

        // Loop through the set using the Iterator
        System.out.println("Loop through the set using Iterator interface:");
        Iterator<Integer> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void hashSetObjects() {
        // HashSet of objects

        // Define a HashSet of objects
        HashSet<Person> persons = new HashSet<>();
        System.out.println("Defined a HashSet: " + persons);

        // Add persons into the list
        Person p1 = new Person("223", "Crawford", "Hailey");
        persons.add(p1);
        Person p2 = new Person("445", "Granger", "Alex");
        persons.add(p2);
        Person p3 = new Person("998", "Ashcroft", "William");
        persons.add(p3);
        Person p4 = new Person("776", "Wagner", "Alison");
        persons.add(p4);
        System.out.println("Added elements to the set:");
        printSet(persons);

        // Add a duplicate element to the set
        Person p5 = new Person("998", "Ashcroft", "William");
        persons.add(p5);
        System.out.println("Attempted to add a duplicate element to the set:");
        printSet(persons);
    }

    private static void printSet(HashSet<Person> set) {
        for (Person p :set) {
            System.out.println(p);
        }
        System.out.println("");
    }
}
