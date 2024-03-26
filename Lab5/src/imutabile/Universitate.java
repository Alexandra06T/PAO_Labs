package imutabile;

public class Universitate {

    private String nume;
    private Locatie locatie;

    public Universitate(String nume, Locatie locatie) {
        this.nume = nume;
        this.locatie = locatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}
