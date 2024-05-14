import java.sql.Timestamp;

public class StoredObject {
    private Object myInfo;
    private boolean expired;
    private Timestamp expirationTime;

    public StoredObject() {
    }

    public StoredObject(Object myInfo) {
        this.myInfo = myInfo;
        this.expirationTime = new Timestamp(System.currentTimeMillis() + 60);
    }


    public Object getMyInfo() {
        return myInfo;
    }

    public void setMyInfo(Object myInfo) {
        this.myInfo = myInfo;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Timestamp expirationTime) {
        this.expirationTime = expirationTime;
    }
}
