package ex3;

import java.io.*;

public class Persoana extends Object implements Externalizable, Serializable  {
    private static final long serialVersionUID = 1L;
    private String nume;
    private String prenume;
    private int varsta;
    private double suma;
    private String valuta;

    public Persoana() {
    }

    public Persoana(String nume, String prenume, int varsta, double suma, String valuta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        this.valuta = valuta;
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

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public String toString() {
        return nume + ' ' + prenume +
                " " + varsta +
                " " + suma +
                " " + valuta;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(nume);
        out.writeUTF(prenume);
        out.writeInt(varsta);
        out.writeDouble(suma);
        out.writeUTF(valuta);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        nume = in.readUTF();
        prenume = in.readUTF();
        varsta = in.readInt();
        suma = in.readDouble();
        valuta = in.readUTF();
    }
}
