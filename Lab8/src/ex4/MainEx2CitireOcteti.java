package ex4;
import ex3.Persoana;
import utils.FileManagement;

import java.io.*;
import java.util.*;

public class MainEx2CitireOcteti {
    private static String fisierPersoane = "persoaneOcteti.txt";

    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(fisierPersoane);
            ObjectInputStream reader = new ObjectInputStream(fis)) {

            HashMap<String, String> persoane = new HashMap<>();
            int n;
            while ((n = fis.available()) > 0) {
                Persoana p = (Persoana) reader.readObject();
                String pers = p.getNume() + " " + p.getPrenume();
                persoane.merge(pers, p.toString(), (before, after) -> before + '\n' + after);
            }

            //afisam persoanele duplicat
            for(String key : persoane.keySet()) {
                String[] info = persoane.get(key).split("\n");
                if(info.length > 1) {
                    //daca e duplicat afisam informatiile
                    System.out.println();
                    System.out.println(key);
                    for(String p : info) {
                        System.out.println(p);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
