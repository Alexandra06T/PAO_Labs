package exercitiu;

public class Patrulater implements Calcul {

    private double latura1;

    private double latura2;

    private double latura3;

    private double latura4;

    public Patrulater(double latura1, double latura2, double latura3, double latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public double getLatura1() {
        return latura1;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
    }

    public double getLatura2() {
        return latura2;
    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
    }

    public double getLatura3() {
        return latura3;
    }

    public void setLatura3(double latura3) {
        this.latura3 = latura3;
    }

    public double getLatura4() {
        return latura4;
    }

    public void setLatura4(double latura4) {
        this.latura4 = latura4;
    }

    @Override
    public String toString() {
        return "Patrulater{" +
                "latura1=" + latura1 +
                ", latura2=" + latura2 +
                ", latura3=" + latura3 +
                ", latura4=" + latura4 +
                '}';
    }

    @Override
    public double calculPerimetru() {
        return latura1 + latura2 + latura3 + latura4;
    }
}
