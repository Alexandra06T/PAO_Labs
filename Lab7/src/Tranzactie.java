public class Tranzactie extends ConversieCurrencyImpl implements Cloneable {
    private static int nrTranzactii = 0;
    private int id;
    private Payment payment;
    private Currency currency;
    private double amount;
    private int refNmb;

    public Tranzactie(int id, Payment payment) {
        nrTranzactii++;
        this.id = nrTranzactii;
        this.payment = payment;
        this.currency = Currency.EUR;
        this.amount = conversieValutaToEur(payment.getAmount(), payment.getCurrency());
    }

    public int getId() {
        return id;
    }

    public void newId() {
        nrTranzactii++;
        this.id = nrTranzactii;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRefNmb() {
        return refNmb;
    }

    public void setRefNmb(int refNmb) {
        this.refNmb = refNmb;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Tranzactie clona = (Tranzactie) super.clone();
        clona.setPayment((Payment) clona.getPayment().clone());
        return clona;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb=" + refNmb +
                '}';
    }
}
