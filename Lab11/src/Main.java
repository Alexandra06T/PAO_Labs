public class Main {
    public static void main(String[] args) {
        MyCache cache = new MyCache();
        //adaugam in MyCache obiecte de tip String
        for(int i = 0; i < 30; i++) {
            StoredObject so = new StoredObject(String.valueOf(i));
            cache.addObject(so);
        }

        while (true) {
            try {
                cache.run();
                for(int i = 0; i < 100; i++) {
                    StoredObject so = new StoredObject(String.valueOf(i));
                    cache.addObject(so);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Fir de executie intrerupt!");
            }
        }
    }
}
