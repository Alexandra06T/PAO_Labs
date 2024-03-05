import java.util.Arrays;
import java.util.Scanner;

//Scrieti un program java care citeste 3 numere de la tastatura si le compara
//exemplu de afisaj: 2< 6 < 8
public class ex2 {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        a[0] = scanner.nextInt();
        System.out.println("Introduceti al doilea numar:");
        a[1] = scanner.nextInt();
        System.out.println("Introduceti al treilea numar:");
        a[2] = scanner.nextInt();

        Arrays.sort(a);

        System.out.println(a[0] + " < " + a[1] + " < " + a[2]);

    }
}
