import java.util.Scanner;

// Scrieți o metodă care returnează elementul N al secvenței Fibonacci. N este citit de la tastatura
//Exemplu de secventa Fibonacci 1 2 3 5 8
//Cum se formeaza secventa Fibonacci:
//1 2 (suma anterioarelor doua numere) ...
public class ex3 {
    public static void main(String[] args) {
        int a = 1, b = 1;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N <= 0) {
            System.out.println("Input invalid");
        }
        else if(N == 1 || N == 2) {
            System.out.println("Elementul " + N + " este 1");
        }
        else {
            int contor = 2, c = 2;
            while(contor < N) {
                a = b;
                b = c;
                c = a + b;
                contor ++;
            }
            System.out.println("Elementul " + N + " este " + c);
        }

    }
}
