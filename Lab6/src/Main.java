import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //magazin alimentar
        Proprietar proprietar1 = new Proprietar("Popescu", "Ana", 25);
        Magazin magazinAlimentar = new Magazin("Magazin Alimentar", proprietar1, 200.5, 100);
        CalculeazaChiria ma = new MagazinAlimentar();
        magazinAlimentar.setChirie(ma);
        System.out.println(magazinAlimentar);

        //magazin haine
        Proprietar proprietar2 = new Proprietar("Ionescu", "Maria", 30);
        Magazin magazinHaine = new Magazin("Magazin Haine", proprietar2, 200.5, 100);
        CalculeazaChiria mh = new MagazinHaine();
        magazinHaine.setChirie(mh);
        System.out.println(magazinHaine);

        //magazin chimicale
        Proprietar proprietar3 = new Proprietar("Ionescu", "Alina", 27);
        Magazin magazinChimicale = new Magazin("Magazin Chimicale", proprietar3, 200.5, 100);
        CalculeazaChiria mc = new MagazinChimicale();
        magazinChimicale.setChirie(mc);
        System.out.println(magazinChimicale);

        Magazin magazinHaine2 = new Magazin("Magazin Haine", proprietar2, 200.5, 200);
        magazinHaine2.setChirie(mh);
        Magazin magazinAlimentar2 = new Magazin("Magazin Alimentar", proprietar2, 100.5, 100);
        magazinAlimentar2.setChirie(ma);

        ShoppingMall shoppingMall = new ShoppingMall();
        shoppingMall.addMagazin(magazinAlimentar);
        shoppingMall.addMagazin(magazinHaine);
        shoppingMall.addMagazin(magazinChimicale);
        shoppingMall.addMagazin(magazinHaine2);
        shoppingMall.addMagazin(magazinAlimentar2);

        System.out.println("Inainte de sortare: " + shoppingMall);
        Collections.sort(shoppingMall.getMagazine(),
                Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume))
                        .thenComparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getPrenume))
                        .thenComparing(Magazin::getChirie));
        System.out.println("Dupa sortare: " + shoppingMall);


        List<Magazin> magazineProprietar2 = shoppingMall.getMagazinByProprietar(proprietar2);
        if(magazineProprietar2 == null) {
            System.out.println("Proprietarul nu are magazine");
        }
        else {
            System.out.println("Inainte de sortare:" + magazineProprietar2);
            Collections.sort(magazineProprietar2,
                    Comparator.comparing(Magazin::getNumeMagazin)
                            .thenComparing(Magazin::getVenit)
                            .thenComparing(Magazin::getChirie)
                            .thenComparing(Magazin::getSuprafata));
            System.out.println("Dupa sortare: " + magazineProprietar2);

            double venitTotal = 0;
            for (Magazin m : magazineProprietar2) {
                venitTotal += m.getVenit();
            }
            System.out.println("Venit total Proprietar2: " + venitTotal);

            double chirietotala = 0;
            for (Magazin m : magazineProprietar2) {
                chirietotala += m.getChirie();
            }
            System.out.println("Chirie totala Proprietar2: " + chirietotala);
        }
    }
}
