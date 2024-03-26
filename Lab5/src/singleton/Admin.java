package singleton;

public class Admin {

    // instanta clasei
    private static Admin admin;

    //atribute
    private String nume;
    private String numarTelefon;

    //constructor privat
    private Admin() {}

    public static Admin getAdmin(){
        if(admin == null){
            admin = new Admin();
        }
        return admin;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        return nume + " " + numarTelefon;
    }
}
