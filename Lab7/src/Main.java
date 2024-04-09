import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        List<Payment> paymentList = new ArrayList<>();
        List<Tranzactie> tranzactieList = new ArrayList<>();

        User user1 = new User("Ana", "Popescu", "RO123");
        Payment payment1 = new Payment(50, Currency.RON, user1, "cheltuieli");
        paymentList.add(payment1);
        Tranzactie tranzactie1 = new Tranzactie(1, payment1);
        tranzactieList.add(tranzactie1);
        Payment payment2 = new Payment(500, Currency.TRY, user1, "haine");
        paymentList.add(payment2);
        Tranzactie tranzactie2 = new Tranzactie(2, payment2);
        tranzactieList.add(tranzactie2);
        Payment payment3 = new Payment(100, Currency.USD, user1, "cumparaturi");
        paymentList.add(payment3);
        Tranzactie tranzactie3 = new Tranzactie(3, payment3);
        tranzactieList.add(tranzactie3);

        Tranzactie stornare1 = stornare(tranzactie1);
        tranzactieList.add(stornare1);
        System.out.println("Tranzactie initiala: " + tranzactie1);
        System.out.println("Tranzactie finala: " + stornare1);

        Tranzactie stornare3 = stornare(tranzactie3);
        tranzactieList.add(stornare3);
        System.out.println("Tranzactie initiala: " + tranzactie3);
        System.out.println("Tranzactie finala: " + stornare3);

        Set<String> tari = new HashSet<>();
        for(Payment p : paymentList) {
            tari.add(p.getCurrency().getNumeTara());
        }

        System.out.println("Tari pentru care s-au facut plati: " + tari);

        infoUser(user1, tranzactieList);

    }

    public static Tranzactie stornare(Tranzactie tranzactie) throws CloneNotSupportedException {
        Tranzactie tranzactieNoua = (Tranzactie) tranzactie.clone();
        tranzactieNoua.newId();
        tranzactieNoua.setAmount(tranzactie.getAmount() * (-1));
        tranzactieNoua.getPayment().setAmount(tranzactie.getPayment().getAmount() * (-1));
        tranzactieNoua.setRefNmb(tranzactie.getId());
        return tranzactieNoua;
    }

    public static void infoUser(User user, List<Tranzactie> tranzactieList) {
        System.out.println("Tranzactii " + user.getNume() + " " + user.getPrenume());
        for(Tranzactie t : tranzactieList) {
            if(t.getPayment().getUser().equals(user)) {
                System.out.println(t.getPayment().getCurrency() + " " + t.getPayment().getAmount());
            }
        }
    }
}
