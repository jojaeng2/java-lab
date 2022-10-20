package example.effectivejava.item7;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CacheExample {


    public static void main(String[] args) {
        Map<Object, Object> cache = new WeakHashMap<>();
        Object key = new Object();
        Object value = new Object();

        cache.put(key, value);

    }
}
