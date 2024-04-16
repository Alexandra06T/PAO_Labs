package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainEx1CitireChar {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            HashMap<String, String> persoane = new HashMap<>();

            String persoana;
            while((persoana = br.readLine()) != null) {
                String[] info = persoana.split(";");

                //tinem un hashmap cu cheile nume prenume si valorile string-ul cu informatii despre persoana
                //la fiecare persoana duplicat o adaugam la aceeasi cheie si facem append la informatii
                persoane.merge(info[0] + " " + info[1], persoana, (before, after) -> before + '\n' + after);
            }

            //afisam persoanele duplicat
            for(String key : persoane.keySet()) {
                String[] info = persoane.get(key).split("\n");
                if(info.length > 1) {
                    //daca e duplicat afisam informatiile
                    System.out.println(key);
                    for(String p : info) {
                        String[] infoP = p.split(";");
                        for(String i : infoP) {
                            System.out.println(i);
                        }
                        System.out.println();
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
