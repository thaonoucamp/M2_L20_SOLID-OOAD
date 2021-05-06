package management_traffic.creat;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String brand;
    private String bornYear;
    private String price;
    private String color;
    private String id;

    public Vehicle() {
    }

    public Vehicle(String brand, String bornYear, String price, String color, String id) {
        this.brand = brand;
        this.bornYear = bornYear;
        this.price = price;
        this.color = color;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "trademark='" + brand + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", id='" + id + '\''
                ;
    }
}
