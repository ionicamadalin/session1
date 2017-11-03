package org.madalin.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache {


    private static Map<String, Object> CACHE=new HashMap<>();


    public static boolean containsKeyInCache(Object key) {
        return CACHE.containsKey(key);
    }

    public static Object getFrom(Object key) {
        return CACHE.get(key);
    }

    public static Object putInCache(String key, Object value) {
        return CACHE.put(key, value);
    }
}
