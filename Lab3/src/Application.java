import model.Profesor;
import model.Student;
import service.StorageService;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Available commands:\ncreate\nread\nupdate\ndelete\nquit");

            String cmd = scanner.nextLine();
            System.out.println("Received command: " + cmd);

            if(Objects.equals(cmd, "quit")) {
                return;
            }

            System.out.println("Enter type of person:");
            String typ = scanner.nextLine();
            System.out.println("Received command: " + typ);

            if(Objects.equals(cmd, "create")) {

                if(Objects.equals(typ, "profesor")) {

                    System.out.println("name:");
                    String name = scanner.nextLine();

                    if(StorageService.findProfesor(name) != null) {
                        System.out.println("Already existing");
                        continue;
                    }

                    System.out.println("phone number:");
                    String phno = scanner.nextLine();

                    System.out.println("email");
                    String email = scanner.nextLine();

                    System.out.println("course:");
                    String course = scanner.nextLine();

                    System.out.println("year:");
                    int year = scanner.nextInt();

                    StorageService.addProfesor(new Profesor(name, phno, email, course, year));
                    System.out.println("Teacher created successfully");
                }
                else if(Objects.equals(typ, "student")) {

                    System.out.println("name:");
                    String name = scanner.nextLine();

                    if(StorageService.findStudent(name) != null) {
                        System.out.println("Already existing");
                        continue;
                    }

                    System.out.println("phone number:");
                    String phno = scanner.nextLine();

                    System.out.println("email");
                    String email = scanner.nextLine();

                    System.out.println("class number:");
                    String clno = scanner.nextLine();

                    System.out.println("student number:");
                    int stno = scanner.nextInt();

                    System.out.println("average mark:");
                    double avm = scanner.nextDouble();

                    StorageService.addStudent(new Student(name, phno, email, stno, avm, clno));
                    System.out.println("Student created successfully\n");
                }
                else {

                    System.out.println("Invalid type of person");
                }
            }
            else if(Objects.equals(cmd, "read")) {

                if(Objects.equals(typ, "profesor")) {

                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    Profesor p = StorageService.findProfesor(name);

                    if(p != null) {
                        System.out.println(p.toString());
                    }
                    else {
                        System.out.println("Not existing");
                    }

                }
                else if(Objects.equals(typ, "student")) {

                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    Student s = StorageService.findStudent(name);

                    if(s != null) {
                        System.out.println(s.toString());
                    }
                    else {
                        System.out.println("Not existing");
                    }
                }
                else {
                    System.out.println("Invalid type of person");
                }
            }
            else if(Objects.equals(cmd, "update")) {

                if(Objects.equals(typ, "profesor")) {

                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    Profesor p = StorageService.findProfesor(name);

                    if(p != null) {
                        System.out.println(p.toString());
                    }
                    else {
                        System.out.println("Not existing");
                    }

                    while(true) {

                        System.out.println("Update:\nname\nphone number\nemail\ncourse\nyear:");
                        String field = scanner.nextLine();

                        if(Objects.equals(field, "name")) {

                            System.out.println("name: ");
                            String name2 = scanner.nextLine();

                            if(StorageService.findProfesor(name2) != null) {
                                System.out.println("There is already a teacher with this name.");
                                continue;
                            }

                            p.setName(name2);
                            System.out.println("Name updated successfully");
                        }
                        else if(Objects.equals(field, "phone number")) {
                            System.out.println("phone number: ");
                            String phno2 = scanner.nextLine();

                            p.setPhoneNumber(phno2);
                            System.out.println("Phone number updated successfully");
                        }
                        else if(Objects.equals(field, "email")) {
                            System.out.println("email: ");
                            String em = scanner.nextLine();

                            p.setEmailAddress(em);
                            System.out.println("Email updated successfully");

                        }
                        else if(Objects.equals(field, "course")) {
                            System.out.println("course: ");
                            String c = scanner.nextLine();

                            p.setCourse(c);
                            System.out.println("Course updated successfully");

                        }
                        else if(Objects.equals(field, "year")) {
                            System.out.println("year: ");
                            int y = scanner.nextInt();

                            p.setYear(y);
                            System.out.println("Year updated successfully");

                        }
                        else {
                            System.out.println("Invalid field");
                        }

                        System.out.println("Do you want to update any other field? [y/n]");
                        String answer = scanner.nextLine();

                        if(Objects.equals(answer, "n")) {
                            break;
                        }

                    }

                }
                else if(Objects.equals(typ, "student")) {

                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    Student s = StorageService.findStudent(name);

                    if(s != null) {
                        System.out.println(s.toString());
                    }
                    else {
                        System.out.println("Not existing");
                    }

                    while(true) {

                        System.out.println("Update:\nname\nphone number\nemail\nstudent number\naverage mark\nclass:");
                        String field = scanner.nextLine();

                        if(Objects.equals(field, "name")) {

                            System.out.println("name: ");
                            String name2 = scanner.nextLine();

                            if(StorageService.findStudent(name2) != null) {
                                System.out.println("There is already a student with this name.");
                                continue;
                            }

                            s.setName(name2);
                            System.out.println("Name updated successfully");
                        }
                        else if(Objects.equals(field, "phone number")) {
                            System.out.println("phone number: ");
                            String phno2 = scanner.nextLine();

                            s.setPhoneNumber(phno2);
                            System.out.println("Phone number updated successfully");
                        }
                        else if(Objects.equals(field, "email")) {
                            System.out.println("email: ");
                            String em = scanner.nextLine();

                            s.setEmailAddress(em);
                            System.out.println("Email updated successfully");

                        }
                        else if(Objects.equals(field, "student number")) {
                            System.out.println("student number: ");
                            int sno2 = scanner.nextInt();

                            s.setStudentNumber(sno2);
                            System.out.println("Student number updated successfully");

                        }
                        else if(Objects.equals(field, "average mark")) {
                            System.out.println("average mark: ");
                            double am = scanner.nextDouble();

                            s.setAverageMark(am);
                            System.out.println("Average mark updated successfully");

                        }
                        else if(Objects.equals(field, "class")) {
                            System.out.println("class: ");
                            String c = scanner.nextLine();

                            s.setClassNumber(c);
                            System.out.println("Class number updated successfully");

                        }
                        else {
                            System.out.println("Invalid field");
                        }

                        System.out.println("Do you want to update any other field? [y/n]");
                        String answer = scanner.nextLine();

                        if(Objects.equals(answer, "n")) {
                            break;
                        }

                    }

                }
                else {
                    System.out.println("Invalid type of person");
                    continue;
                }
            }
            else if(Objects.equals(cmd, "delete")) {

                if(Objects.equals(typ, "profesor")) {

                    System.out.println("name:");
                    String name = scanner.nextLine();

                    if(StorageService.deleteProfesor(name)) {
                        System.out.println("Teacher deleted successfully");
                    }
                    else {
                        System.out.println("Teacher couldn't be deleted: There is no teacher with this name.");
                    }
                }
                else if(Objects.equals(typ, "student")) {

                    System.out.println("name:");
                    String name = scanner.nextLine();

                    if(StorageService.deleteStudent(name)) {
                        System.out.println("Student deleted successfully");
                    }
                    else {
                        System.out.println("Student couldn't be deleted: There is no student with this name.");
                    }
                }
                else {
                    System.out.println("Invalid type of person");
                    continue;
                }
            }
            else {
                System.out.println("Invalid command.");
                continue;
            }

        }
    }
}


