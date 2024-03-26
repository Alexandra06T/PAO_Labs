package imutabile;

public class Locatie {
    private String oras;
    private String adresa;

    public Locatie(String oras, String adresa) {
        this.oras = oras;
        this.adresa = adresa;
    }

    public Locatie(Locatie locatie) {
        this.oras = locatie.getOras();
        this.adresa = locatie.getAdresa();
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Locatie{" +
                "oras='" + oras + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
