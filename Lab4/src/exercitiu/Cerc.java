package exercitiu;

public class Cerc implements Calcul {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                '}';
    }

    @Override
    public double calculPerimetru() {
        return 2 * raza * Math.PI;
    }
}
