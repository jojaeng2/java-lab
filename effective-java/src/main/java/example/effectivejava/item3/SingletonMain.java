package example.effectivejava.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonMain {

    public static void main(String[] args) {
        HelloWorld helloWorld = HelloWorld.INSTANCE;

        System.out.println("helloWorld.getValue() = " + helloWorld.getValue());
        helloWorld.setValue(2);
        System.out.println("helloWorld.getValue() = " + helloWorld.getValue());

    }
}
