package ex1;

import ex1.Suma2000Exception;

import java.io.*;
import java.util.Scanner;

public class MainEx1ScriereChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //deschidere fisier
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("persoaneChar.txt"))) {
            System.out.println("Introduceti informatiile:");

            while(true) {
                System.out.println("Quit? Press q. Else press any other key.");
                String q = scanner.nextLine();
                if(q.equals("q")) return;
                try {
                    //citire informatii de la tastatura
                    StringBuilder sb = new StringBuilder();
                    System.out.println("Introduceti numele:");
                    String nume = scanner.nextLine();
                    sb.append(nume);
                    sb.append(';');
                    System.out.println("Introduceti prenumele:");
                    String prenume = scanner.nextLine();
                    sb.append(prenume);
                    sb.append(';');
                    System.out.println("Introduceti varsta:");
                    int varsta = scanner.nextInt();
                    scanner.nextLine();
                    sb.append(varsta);
                    sb.append(';');
                    System.out.println("Introduceti suma:");
                    double suma = scanner.nextDouble();
                    scanner.nextLine();
                    checkSuma(suma);
                    sb.append(suma);
                    sb.append(';');
                    System.out.println("Introduceti valuta:");
                    String valuta = scanner.nextLine();
                    sb.append(valuta);
                    sb.append('\n');
                    System.out.println(sb.toString());

                    //scriem in fisier
                    bw.write(sb.toString());

                } catch (IOException e) { //este aruncata de write
                    throw new RuntimeException(e);
                } catch (Suma2000Exception e) { // exceptie custom
                    System.out.println("Suma este prea mare. Se reia procesul de citire a informatiilor.");
                }
            }
        } catch (FileNotFoundException e) { //exceptie la deschiderea fisierului
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void checkSuma(double suma) throws Suma2000Exception {
        if(suma > 2000) {
            System.out.println("Suma mai mare de 2000!");
            throw new Suma2000Exception("Suma este mai mare de 2000!");
        }
    }

}
