package exercitiu;

public class Aplicatie {

    public static void main(String[] args) {

        Cerc cerc1 = new Cerc(2);

        Patrulater patrulater = new Patrulater(1, 2, 3, 4);

        Calcul c2 = new Cerc(3);

        System.out.println("Perimetru c2: " + c2.calculPerimetru());

        System.out.println("Perimetru cerc: " + cerc1.calculPerimetru());

        System.out.println("Perimetru patrulater: " + patrulater.calculPerimetru());
    }



}
