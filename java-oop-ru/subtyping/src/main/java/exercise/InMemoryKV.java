package exercise;

import java.util.Map;
import java.util.HashMap;


// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> storage = new HashMap<>();

    public InMemoryKV(Map<String, String> storage) {
       this.storage = storage;
    }

    public void set(String key, String value) {
        storage.put(key, value);
    }

    public void unset(String key) {
        storage.remove(key);
    }

    public String get(String key, String defaultValue) {
        String getValue = storage.getOrDefault(key, defaultValue);
       return getValue;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        map.putAll(storage);
        return map;
    }
}
// END
