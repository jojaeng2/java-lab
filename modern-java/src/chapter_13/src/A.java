package chapter_13.src;

public interface A {

    default void hello() {
        System.out.println("Hello from A");
    }
}
