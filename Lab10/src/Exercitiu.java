import java.util.*;

import static java.util.stream.Collectors.*;

public class Exercitiu {
    public static void main(String[] args) {

        // Exercitiul 1
        Integer[] intregiOb = {0, 1, 2, 3, 4, 5, 80};
        System.out.println("Array initial " + Arrays.toString(intregiOb));

        //sortare descrescatoare
        Arrays.sort(intregiOb, (o1, o2) -> o2 - o1);
        System.out.println("Sortare descrescatoare " + Arrays.toString(intregiOb));

        //suma cu reduce
        Integer sumaR = Arrays.stream(intregiOb).reduce(0, (x, y) -> x+y);
        System.out.println("Suma cu reduce " + sumaR);

        //suma cu summingInt
        Integer sumaS = Arrays.stream(intregiOb).collect(summingInt(x -> x));
        System.out.println("Suma cu summingInt " + sumaR);

        //media cu averagingInt
        double media = Arrays.stream(intregiOb).collect(averagingInt(x -> x));
        System.out.println("Media cu averagingInt " + media);

        //min
        Integer min = Arrays.stream(intregiOb).min((x, y) -> x - y).get();
        System.out.println("Minimul " + min);

        //max
        Integer max = Arrays.stream(intregiOb).max((x, y) -> x - y).get();
        System.out.println("Maximul " + max);

        //filter
        int val = 3;
        System.out.println("Valorile mai mari de " + val);
        Arrays.stream(intregiOb).filter(x -> x > val).forEach(x -> System.out.print(x + " "));
        System.out.println();

        //Exercitiul 2
        int[] intregiP = {0, 80, 2, 5, 4, 1, 3};
        System.out.println("Array de primitive initial " + Arrays.toString(intregiP));

        //sortare crescatoare
        Arrays.sort(intregiP);
        System.out.println("Array primitive sortat crescator " + Arrays.toString(intregiP));

        //sortare crescatoare
        System.out.println("Array primitive sortat descrescator ");
        Arrays.stream(intregiP).boxed().sorted((x, y) -> y - x).forEach(x -> System.out.print(x + " "));
        System.out.println();

        //la patrat
        System.out.println("Elementele la patrat");
        Arrays.stream(intregiP).map(x -> x*x).forEach(x -> System.out.print(x + " "));
        System.out.println();

        //Exercitiul 3
        List<Magazin> magazine = new ArrayList<>();
        Magazin m1 = new Magazin("Magazin 1", 3);
        Magazin m2 = new Magazin("Magazin 2", 20);
        Magazin m3 = new Magazin("Magazin 3", 56);
        Magazin m4 = new Magazin("Magazin 4", 107);
        Magazin m5 = new Magazin("Magazin 5", 20);
        magazine.add(m1);
        magazine.add(m2);
        magazine.add(m3);
        magazine.add(m4);
        magazine.add(m5);

        //grupate dupa numarAngajati
        Map<Integer, List<Magazin>> mapGroupingByNumarAngajati = magazine.stream().collect(groupingBy(Magazin::getNumarAngajati));
        System.out.println("mapGroupingByNumarAngajati = " + mapGroupingByNumarAngajati);

        //suma angajatilor
        double sumaAng = magazine.stream().collect(summingInt(Magazin::getNumarAngajati));
        System.out.println("Suma angajatilor: " + sumaAng);
    }
}
