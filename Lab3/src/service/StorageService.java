package service;

import model.Profesor;
import model.Student;

import java.util.Objects;

public class StorageService {

    private static Student[] studenti = new Student[1000];

    private static int nrStudenti = 0;

    private static Profesor[] profesori = new Profesor[1000];

    private static int nrProfesori = 0;

    public static void addStudent(Student s) {
        if(nrStudenti >= 1000) {
            System.out.println("Too many students.");
        }
        else{
            studenti[nrStudenti++] = s;
        }
    }

    public static void addProfesor(Profesor p) {
        if(nrProfesori >= 1000) {
            System.out.println("Too many teachers.");
        }
        else{
            profesori[nrProfesori++] = p;
        }
    }

    public static Student findStudent(String name) {

        if(nrStudenti > 0) {
            for(Student st : studenti) {
                if(st != null && Objects.equals(st.getName(), name)) {
                    return st;
                }
            }
        }

        return null;
    }

    public static Profesor findProfesor(String name) {

        if(nrProfesori > 0) {
            for(Profesor p : profesori) {
                if(p != null && Objects.equals(p.getName(), name)) {
                    return p;
                }
            }
        }

        return null;
    }

    public static boolean deleteStudent(String name) {
        for(int i = 0; i < nrStudenti; i++) {

            if(Objects.equals(studenti[i].getName(), name)) {
                for(int j = i; j < nrStudenti - 1; j++) {
                    studenti[j] = studenti[j+1];
                }

                nrStudenti--;

                return true;
            }
        }
        return false;
    }

    public static boolean deleteProfesor(String name) {
        for(int i = 0; i < nrProfesori; i++) {

            if(Objects.equals(profesori[i].getName(), name)) {
                for(int j = i; j < nrProfesori - 1; j++) {
                    profesori[j] = profesori[j+1];
                }

                nrProfesori--;

                return true;
            }
        }
        return false;
    }
}
