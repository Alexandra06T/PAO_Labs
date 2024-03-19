package shopping_mall_exercitiu;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public ShoppingMall() {
    }


    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void achizitie(double amount) {

        bankCard.doTransaction(amount);
    }
}
