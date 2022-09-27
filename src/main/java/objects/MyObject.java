package objects;

import objects.Automobile;

public class MyObject {
    public static void main(String[] args) {

        // Object instantiation
        Automobile f150 = new Automobile();

        // Setting properties
        f150.setMake("Ford");
        f150.setModel("F150");
        f150.setYear(2019);
        f150.setColor("black");
        f150.setKpl(12);

        // Object instantiation using constructor requiring input parameters
        Automobile a4 = new Automobile("Audi", "A4", 2018, "silver", 11);

        // Equality check
        Automobile a4z = a4;
        System.out.println(a4.equals(a4z));

        // Method execution
        a4.startEngine();
        a4.stopEngine();
    }
}
