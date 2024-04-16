package ex4;
import ex3.Persoana;
import utils.FileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainEx2CitireOcteti {
    private static String fisierPersoane = "persoaneOcteti.txt";

    public static void main(String[] args) {
        List<Object> persoane = Arrays.stream(FileManagement.citireObiectDinFisier(fisierPersoane)).toList();

        for(Object p : persoane.stream().distinct().toList()) {
            for(Object q : persoane) {
                if(checkEqual(Persoana) p, (Persoana) q) {
                    System.out.println(q);
                }
            }
        }

    }

    private static boolean checkEqual(Persoana p1, Persoana p2) {
        if(p1.getNume().equals(p2.getNume()) && p1.getPrenume().equals(p2.getPrenume()))
            return true;
        return false;
    }
}
