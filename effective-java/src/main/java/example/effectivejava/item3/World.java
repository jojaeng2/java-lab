package example.effectivejava.item3;

public class World {
    private static final World INSTANCE = new World();

    private World() {}

    public static World getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("Hello World!!!");
    }
}
