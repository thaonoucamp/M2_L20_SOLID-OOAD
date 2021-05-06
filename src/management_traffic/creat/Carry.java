package management_traffic.creat;

public class Carry extends Vehicle {
    private float payload;

    public Carry() {
    }

    public Carry(float payload) {
        this.payload = payload;
    }

    public Carry(String trademark, String bornYear, String price, String color, String id, float payload) {
        super(trademark, bornYear, price, color, id);
        this.payload = payload;
    }

    public float getPayload() {
        return payload;
    }

    public void setPayload(float payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Carry{" + super.toString() +
                "payload=" + payload +
                '}';
    }
}
