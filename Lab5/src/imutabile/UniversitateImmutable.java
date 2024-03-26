package imutabile;

public final class UniversitateImmutable {

    private final String nume;
    private final Locatie locatie;

    public UniversitateImmutable(String nume, Locatie locatie) {
        this.nume = nume;
        this.locatie = new Locatie(locatie);
    }

    public String getNume() {
        return nume;
    }

    public Locatie getLocatie() {
        return new Locatie(locatie);
    }
}
