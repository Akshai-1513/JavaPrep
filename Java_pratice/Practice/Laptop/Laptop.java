package Practice.Laptop;

public class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop() {
    }

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public void setlaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public int getlaptopId() {
        return laptopId;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setosType(String osType) {
        this.osType = osType;
    }

    public String getosType() {
        return osType;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public double getprice() {
        return price;
    }

    public void setrating(int rating) {
        this.rating = rating;
    }

    public int getrating() {
        return rating;
    }
}

