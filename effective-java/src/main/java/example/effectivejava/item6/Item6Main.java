package example.effectivejava.item6;

import java.util.Hashtable;
import java.util.Stack;

public class Item6Main {
    public static void main(String[] args) {
        long bef;
        long aft;
        bef = System.currentTimeMillis();
        long sum = 0L;
        for (long i=0; i<=10000000; i++) {
            sum += i;
        }
        aft = System.currentTimeMillis();
        long result = aft - bef;
        System.out.println("result = " + result);

        // auto boxing
        int num1 = 100;
        Integer num2 = num1;

        // auto unboxing
        Integer num3 = new Integer(100);
        int num4 = num3;


    }

}
