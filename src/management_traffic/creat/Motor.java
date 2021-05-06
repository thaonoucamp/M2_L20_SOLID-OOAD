package management_traffic.creat;

public class Motor extends Vehicle{
    private int horse;

    public Motor() {
    }

    public Motor(int horse) {
        this.horse = horse;
    }

    public Motor(String trademark, String bornYear, String price, String color, String id, int horse) {
        super(trademark, bornYear, price, color, id);
        this.horse = horse;
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Motor{" + super.toString() +
                "horse=" + horse +
                '}';
    }
}
