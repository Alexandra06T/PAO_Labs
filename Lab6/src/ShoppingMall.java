import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {
    private List<Magazin> magazine;

    public ShoppingMall() {
        this.magazine = new ArrayList<>();
    }

    public ShoppingMall(List<Magazin> magazine) {
        this.magazine = new ArrayList<>(magazine);
    }

    public void addMagazin(Magazin magazin) {
        magazine.add(magazin);
    }

    public List<Magazin> getMagazine() {
        return magazine;
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "magazine=" + magazine +
                '}';
    }
}
