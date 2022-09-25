package chapter_13.src;

public class C implements A, B{

    public static void main(String[] args) {
        new C().hello();
    }

    public void hello() {
        B.super.hello();
    }
}
