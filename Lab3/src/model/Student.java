package model;

public class Student extends Person {

    private int studentNumber;

    private double averageMark;

    private String classNumber;

    public Student() {
    }

    public Student(int studentNumber, double averageMark, String classNumber) {
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.classNumber = classNumber;
    }

    public Student(String name, String phoneNumber, String emailAddress, int studentNumber, double averageMark, String classNumber) {
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.classNumber = classNumber;
    }

    public Student(Person p, int studentNumber, double averageMark, String classNumber) {
        super(p.getName(), p.getPhoneNumber(), p.getEmailAddress());
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.classNumber = classNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                "\nphone number: " + getPhoneNumber() +
                "\nemail: " + getEmailAddress() +
                "\nstudent number:" + studentNumber +
                "\naverage mark: " + averageMark +
                "\nclass: " + classNumber + '\n';
    }
}
