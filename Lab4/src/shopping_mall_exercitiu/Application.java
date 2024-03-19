package shopping_mall_exercitiu;

public class Application {

    public static void main(String[] args) {
        CreditCard cc = new CreditCard("Utilizator1");

        DebitCard dc = new DebitCard("Utilizator2", 1000);



        ShoppingMall sm = new ShoppingMall();

        sm.setBankCard(dc);

        System.out.println("Debit card: ");

        sm.achizitie(100);

        sm.achizitie(500);

        sm.setBankCard(cc);

        System.out.println("Credit card: ");

        sm.achizitie(200);

        sm.achizitie(300);

        DebitCard dc2 = new DebitCard("alt", 1000);

        sm.setBankCard(dc2);

        sm.achizitie(500);

    }

}
