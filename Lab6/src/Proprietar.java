import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Proprietar {
    private String nume;
    private String prenume;
    private int varsta;


    public Proprietar() {
    }

    public Proprietar(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public Proprietar(Proprietar proprietar) {
        this.nume = proprietar.getNume();
        this.prenume = proprietar.getPrenume();
        this.varsta = proprietar.getVarsta();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proprietar that = (Proprietar) o;
        return varsta == that.varsta && Objects.equals(nume, that.nume) && Objects.equals(prenume, that.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, varsta);
    }

    @Override
    public String toString() {
        return "Proprietar{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
