package objects;

public class Student extends Person {

    private int studentNum;
    private double marks;

    public int getStudentNum() {
        return studentNum;
    }

    public Student(String firstName, String lastName, int sinNum) {
        super(firstName, lastName, sinNum);
    }

    public Student(String firstName, String lastName, int sinNum, int studentNum, double marks) {
        super(firstName, lastName, sinNum);
        this.studentNum = studentNum;
        this.marks = marks;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String disp() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", marks=" + marks +
                '}';
    }
}
