import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread {

    private int contor;
    private Map<String, Object> cache = new ConcurrentHashMap<>();

    public MyCache() {
    }

    public void addObject(Object o) {
        this.contor++;
        cache.put(String.valueOf(this.contor), o);
    }

    @Override
    public void run() {
        try {
            sleep(2000);
            cache.forEach((key, o) -> {
                Timestamp crt = new Timestamp(System.currentTimeMillis());
                StoredObject storedObject = (StoredObject) o;
                if(crt.after(storedObject.getExpirationTime())){
                    storedObject.setExpired(true);
                }
            });
            cache.forEach((k, o) -> System.out.println( k + " " +  ((StoredObject) o).isExpired()));
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("Fir intrerupt");
        }
    }
}
