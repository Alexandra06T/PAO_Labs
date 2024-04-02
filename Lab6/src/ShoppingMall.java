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

    public List<Magazin> getMagazinByProprietar(Proprietar proprietar) {
        List<Magazin> magazineProprietar = new ArrayList<>();
        for(Magazin m : this.magazine) {
            if(m.getProprietar().equals(proprietar)) {
                magazineProprietar.add(m);
            }
        }
        if(magazineProprietar.isEmpty()) {
            return null;
        }
        return magazineProprietar;
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "magazine=" + magazine +
                '}';
    }
}
