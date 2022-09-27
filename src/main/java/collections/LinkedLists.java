package collections;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        linkedListPrimitiveWrappers();

        linkedListObjects();
    }

    public static void linkedListPrimitiveWrappers() {

        // Define the LinkedList
        LinkedList<Integer> lList1 = new LinkedList<>();
        System.out.println("Defined the LinkedList: " + lList1);

        // Add elements into the list
        lList1.add(2);
        lList1.add(4);
        lList1.add(6);
        lList1.add(7);
        lList1.add(8);
        System.out.println("Added elements in the list: " + lList1);

        // Update an element in the list
        lList1.set(2, 24);
        System.out.println("Updated element in index 2: " + lList1);

        // Delete an element from the list
        lList1.remove(lList1.size() - 1);
        System.out.println("Deleted the last element from the list: " + lList1);

        // Iterate over the list
        System.out.println("Loop through the list:");
        for (int i = 0; i < lList1.size(); i++) {
            System.out.println(lList1.get(i));
        }

        // Iterate over the list using for each
        System.out.println("Loop through the list using for each:");
        for (Integer num :lList1) {
            System.out.println(num);
        }
    }

    public static void linkedListObjects() {
        // Define a LinkedList of object
        LinkedList<Person> persons = new LinkedList<>();
        System.out.println("Defined a LinkedList of object: " + persons);
        System.out.println("");

        // Add persons into the list
        Person p1 = new Person("223", "Crawford", "Hailey");
        persons.add(p1);
        Person p2 = new Person("445", "Granger", "Alex");
        persons.add(p2);
        Person p3 = new Person("998", "Ashcroft", "William");
        persons.add(p3);
        Person p4 = new Person("776", "Wagner", "Alison");
        persons.add(p4);
        System.out.println("Added elements to the list:");
        for (Person p :persons) {
            System.out.println(p);
        }
        System.out.println("");

        // Update a person in the list
        p2.setLastName("Goodfred");
        persons.set(1, p2);
        System.out.println("Updated lastName of element on index 1:");
        for (Person p :persons) {
            System.out.println(p);
        }
        System.out.println("");

        // Delete a person from the list
        persons.remove(persons.size() - 1);
        System.out.println("Deleted the last person from the list:");
        for (Person p :persons) {
            System.out.println(p);
        }
        System.out.println("");

        // Iterate through the list
        System.out.println("Loop through the list:");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

    }
}
