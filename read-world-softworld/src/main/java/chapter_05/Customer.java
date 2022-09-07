package chapter_05;

public class Customer {

    private String name;
    private String level;

    public Customer(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}
