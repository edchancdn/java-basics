package objects;

public class Person {

    private String firstName;
    private String lastName;
    private int sinNum;

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName, int sinNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sinNum = sinNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSinNum() {
        return sinNum;
    }

    public void setSinNum(int sinNum) {
        this.sinNum = sinNum;
    }

    public String disp() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sinNum=" + sinNum +
                '}';
    }
}
