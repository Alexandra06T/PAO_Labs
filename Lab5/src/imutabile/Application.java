package imutabile;

public class Application {
    public static void main(String[] args) {
        Locatie locatie = new Locatie("Bucuresti", "Str. Academiei");

        Universitate universitate = new Universitate("UB", locatie);
        System.out.println("Cream universitate mutabil: " + universitate.getLocatie());

        // cream alta universitate cu acceasi locatie
        UniversitateImmutable universitateImmutable = new UniversitateImmutable("UB2", locatie);

        // schimbam adresa locatiei
        locatie.setAdresa("Str. Regina Elisabeta");

        // vedem ca locatia s a schimbat pentru universitate mutabil
        System.out.println("Universitate mutabil dupa modificare: " + universitate.getLocatie());

        // universitate imutabil nu isi schimba locatia
        Locatie locImm = universitateImmutable.getLocatie();
        System.out.println("Universitate imutabil dupa modificare: " + locImm);

        // incercam sa modificam orasul locatiei universitatii immutable prin getter
        universitateImmutable.getLocatie().setOras("Alt oras");
        System.out.println("Universitate imutabil dupa modificare prin getter: " + locImm);
    }
}
