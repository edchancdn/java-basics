package objects;

public class Test {

    public static void main(String[] args) {

        Person p1 = new Person("Jane", "Smith", 56789);

        Student s1 = new Student("John", "Doe", 12345, 777888, 90);

        System.out.println(s1.disp());
        System.out.println(p1.disp());


    }

    /* 1. Student s1 = new Student();
    What are the variables available for object s1?
    Answer:
    s1 can access the following variables indirectly through getter and setter methods:
    String firstName
    String lastName
    int sinNum
    int studentNum
    double marks
     */

    /* 2. Write Test class to create object of Person and Student class
    See Test class
     */

    /* 3. Add constructor with parameters in both classes
    See Student and Person classes
     */

    /* 4. Add default constructor in student class
    See Student class
    Cannot add a default constructor in Student class with no parameters,
    because the Person class does not have a default constructor.
    The Person class only has a constructor with parameters.
     */

    /* 5. Add disp() methods in both classes to display members
    See Student and Person classes
     */

    /* Modify Test class to call disp() method on student object and person object,
    calling disp() on student object does it call disp() of super class as constructor?
    Answer:
    No the disp() of super class is not called because the disp() of Student class
    overrides it.
     */
}
