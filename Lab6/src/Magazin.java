public class Magazin {
    private static int nrMagazine = 0;
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private double venit;
    private double suprafata;
    private double chirie;

    public Magazin() {
    }

    public Magazin(String numeMagazin, Proprietar proprietar, double venit, double suprafata) {
        this.numeMagazin = numeMagazin;
        this.proprietar = new Proprietar(proprietar);
        this.venit = venit;
        this.suprafata = suprafata;
        this.id = ++nrMagazine;
    }

    public Magazin(Magazin magazin) {
        this.numeMagazin = magazin.getNumeMagazin();
        this.proprietar = new Proprietar(magazin.getProprietar());
        this.venit = magazin.getVenit();
        this.suprafata = magazin.getSuprafata();
        this.id = ++nrMagazine;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = new Proprietar(proprietar);
    }

    public double getVenit() {
        return venit;
    }

    public void setVenit(double venit) {
        this.venit = venit;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public double getChirie() {
        return chirie;
    }

    public void setChirie(CalculeazaChiria c) {
        this.chirie = c.formulaCalcul(suprafata);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "id=" + id +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + proprietar +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                '}';
    }
}
