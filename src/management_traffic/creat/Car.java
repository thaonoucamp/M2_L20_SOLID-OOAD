package management_traffic.creat;

public class Car extends Vehicle {
    private int chair;
    private String engine;

    public Car() {
    }

    public Car(int chair, String engine) {
        this.chair = chair;
        this.engine = engine;
    }

    public Car(String trademark, String bornYear, String price, String color, String id, int chair, String engine) {
        super(trademark, bornYear, price, color, id);
        this.chair = chair;
        this.engine = engine;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "chair=" + chair +
                ", engine='" + engine + '\'' +
                '}';
    }
}
