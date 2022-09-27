package collections;

import java.util.Objects;

public class Person {
    private String sId;
    private String lastName;
    private String firstName;


    public Person(String sId) {
        this.sId = sId;
    }

    public Person(String sId, String lastName, String firstName) {
        this.sId = sId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }
    public String getSId() {
        return sId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return sId.equals(person.sId) && Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sId, lastName, firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "sId='" + sId + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
