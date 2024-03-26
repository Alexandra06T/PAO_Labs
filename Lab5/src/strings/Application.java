package strings;

public class Application {
    public static void main(String[] args) {

        System.out.println("[abc] a: " + "a".matches("[abc]"));
        System.out.println("[^abc] a: " + "d".matches("[^abc]"));
        System.out.println("[a-z] x: " + "x".matches("[a-z]"));
        System.out.println("[a-zA-Z] B: " + "B".matches("[a-zA-Z]"));
        System.out.println("[a-z][A-Z] aB: " + "aB".matches("[a-z][A-Z]"));
        System.out.println("[abc]+ abbc: " + "abbc".matches("[abc]+"));
        System.out.println("[abc]* '': " + "".matches("[abc]*"));
        System.out.println("[abc]{5} abcab: " + "abcab".matches("[abc]{5}"));
        System.out.println("[abc]{5,} abcababbc: " + "abcababbc".matches("[abc]{5,}"));
        System.out.println("[abc]{5,10} abcabaaa: " + "abcabaaa".matches("[abc]{5,10}"));

        /*
        2)
            Se da stringul
            "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat."

            1. sa se afiseze lungimea

             Folosind expresii regulate sa se implementeze:
            2. sa se afiseze true/false daca are doar litere mari si litere mici
            3. sa se imparta textul in cuvinte si sa se afiseze cuvintele de la mijloc
               (deoarece textul are numar par de cuvinte se va afisa : cu continutul)
            4. se se afiseze stringul reverse (vezi StringBuilder)
         */

        System.out.println();
        String str = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println("Lungime sir: " + str.length());

        System.out.println("Doar litere mari si mici (si separatori): " + str.matches("[a-zA-Z .]*"));

        String[] cuv = str.split("[ .]+");
        int middle = (int) Math.floor((double)cuv.length/2);
        System.out.println("Cuvintele din mijloc:");
        System.out.println((middle-1) + ": " + cuv[middle-1]);
        System.out.println((middle) + ": " + cuv[middle]);

        StringBuilder stB = new StringBuilder("Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.");
        stB.reverse();
        System.out.println("Reversed: " + stB);
    }
}
