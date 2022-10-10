package example.effectivejava.item3;

public class Hello {
    public static final Hello INSTANCE = new Hello();

    private Hello() {
        if(INSTANCE != null) throw new IllegalStateException("Singleton 유지!!");
    }

    public void print() {
        System.out.println("Hello World!");
    }

    private Object readResolve() { return INSTANCE; }
}
