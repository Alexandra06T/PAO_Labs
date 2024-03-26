package singleton;

public class Application {

    public static void main(String[] args) {
        Admin admin1 = Admin.getAdmin(); // initializare
        Admin admin2 = Admin.getAdmin(); // aceeasi instanta
        System.out.println(admin1.equals(admin2)); // intoarce true pt ca exista o singura instanta

        admin1.setNume("Admin1");
        admin1.setNumarTelefon("0123456789");

        System.out.println("admin1:\n" + admin1.toString());

        admin2.setNume("Admin2");
        admin2.setNumarTelefon("0987654321");

        System.out.println("admin2:\n" + admin2.toString());

        System.out.println("admin1:\n" + admin1.toString());

    }
}
