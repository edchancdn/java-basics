package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayLists {

    public static void main(String[] args) {

        arrayListPrimitiveWrappers();

        arrayListObjects();
    }

    public static void arrayListPrimitiveWrappers() {
        // ArrayList of primitive wrappers

        // Define an ArrayList
        ArrayList<Integer> aList1 = new ArrayList<>();

        // Create elements into the list
        aList1.add(4);
        aList1.add(2);
        aList1.add(8);
        aList1.add(6);
        aList1.add(10);
        System.out.println(aList1);

        // Read an element
        System.out.println("Read element on index 2: " + aList1.get(2));
        System.out.println("");

        // Read all the elements in the list
        System.out.println("Read all elements:");
        for (int i = 0; i < aList1.size(); i++) {
            System.out.println(aList1.get(i));
        }
        System.out.println("");

        // Update an element
        aList1.set(1, 9);
        System.out.println("Update element on index 1: " + aList1);

        // ArrayList allows duplicate values
        aList1.add(6);
        System.out.println("Add an element: " + aList1);

        // Delete an element
        aList1.remove(1);
        System.out.println("Delete an element: " + aList1);

        // Sort the list
        Collections.sort(aList1);
        System.out.println("Sort the list: " + aList1);

        // Sort the list in reverse order
        Collections.reverse(aList1);
        System.out.println("Sort the list in reverse order: " + aList1);

        System.out.println("ArrayList size: " + aList1.size());
        aList1.clear();
        System.out.println("Clear the ArrayList: " + aList1);
    }

    public static void arrayListObjects() {
        // ArrayList of objects

        // Define an ArrayList of Person objects
        ArrayList<Person> aPersons = new ArrayList<>();

        // Create objects and create elements into the list
        Person p1 = new Person("123", "Doe", "John");
        aPersons.add(p1);

        Person p2 = new Person("456", "Deer", "Jane");
        aPersons.add(p2);

        Person p3 = new Person("789", "Anderson", "Jim");
        aPersons.add(p3);

        // ArrayList allows duplicate values
        Person p4 = new Person("123", "Doe", "John");
        aPersons.add(p4);
        System.out.println(aPersons);
        System.out.println("Equality check for elements on index 0 and 3: " + aPersons.get(0).equals(aPersons.get(2)));

        System.out.println("list size: " + aPersons.size());
        System.out.println("");

        // Read all elements
        System.out.println("Read all elements");
        for (int i = 0; i < aPersons.size(); i++) {
            Person p = aPersons.get(i);
            System.out.println(p);
            System.out.println("Hello " + p.getFirstName() + " " + p.getLastName());
        }
        System.out.println("");

        // Read elements - enhanced for loop
        System.out.println("Read elements using for each loop");
        for (Person p :aPersons) {
            System.out.println("Hello " + p.getFirstName() + " " + p.getLastName());
        }
        System.out.println("");

        // Delete an element by reference variable
        aPersons.remove(p4);
        System.out.println("Removed element: ");
        for (Person p :aPersons) {
            System.out.println(p);
        }
        System.out.println("");

        // Sort list of objects

        // Define the comparator to be used for sorting by order of lastName, firstName, sId properties
        Comparator compareLnFnSid = Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getSId);
        // Sort the list using the defined comparator
        Collections.sort(aPersons, compareLnFnSid);
        System.out.println("Sorted list of objects using a custom comparator, by lastName, firstName, sId:");
        for (Person p :aPersons) {
            System.out.println(p);
        }
        System.out.println("");

        // Sort the list using an inline Comparator.
        aPersons.sort(Comparator.comparing(Person::getSId));
        System.out.println("Sorted list of objects using an inline comparator, by sId:");
        for (Person p :aPersons) {
            System.out.println(p);
        }
        System.out.println("");

        // Sort the list using an inline Comparator, and sort in reverse order.
        aPersons.sort(Comparator.comparing(Person::getSId).reversed());
        System.out.println("Sorted list of objects using an inline comparator, by sId, in reverse order:");
        for (Person p :aPersons) {
            System.out.println(p);
        }
        System.out.println("");
    }
}
