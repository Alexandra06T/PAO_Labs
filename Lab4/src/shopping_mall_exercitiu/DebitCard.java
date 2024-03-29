package shopping_mall_exercitiu;

public record DebitCard(String utilizator, double limitAmount) implements BankCard {
    private static double spentAmount;

    public void doTransaction(double amount) {
        if(amount > limitAmount) {
            System.out.println("Not enough money");
        }
        else {

            spentAmount += amount;

            System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);

            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
        }

    }

}
