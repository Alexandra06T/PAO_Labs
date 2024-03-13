package model;

public class Profesor extends Person {

    private String course;

    private int year;

    public Profesor() {
    }

    public Profesor(String name, String phoneNumber, String emailAddress, String course, int year) {
        super(name, phoneNumber, emailAddress);
        this.course = course;
        this.year = year;
    }

    public Profesor(String course, int year) {
        this.course = course;
        this.year = year;
    }

    public Profesor(Person p, String course, int year) {
        super(p.getName(), p.getPhoneNumber(), p.getEmailAddress());
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                "\nphone number: " + getPhoneNumber() +
                "\nemail: " + getEmailAddress() +
                "\ncourse: " + course +
                "\nyear: " + year;
    }
}
