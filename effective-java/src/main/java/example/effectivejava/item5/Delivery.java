package example.effectivejava.item5;

public class Delivery {
    private String type;
    private String area;

    public Delivery(String type, String area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public String getArea() {
        return area;
    }
}
