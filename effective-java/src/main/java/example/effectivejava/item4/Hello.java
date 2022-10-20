package example.effectivejava.item4;

import java.util.Collections;
import java.util.function.Predicate;

public class Hello {

    private Hello(){
        // Don't let anyone instantiate this class.
        throw new IllegalStateException("호출할 수 없는 생성자입니다.");
    }

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello World!1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!2");
            }
        };

        process(r1);
        process(r2);
    }

    public static void process(Runnable r) {
        r.run();
    }
}
