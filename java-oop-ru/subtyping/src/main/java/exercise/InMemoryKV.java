package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV {
    Map<String, String> baseData;

    public InMemoryKV (Map<String, String> baseData){
        this.baseData = baseData;
    }

    public void set(String key, String value) {
        baseData.put(key, value);
    }

    public void unset (String key) {
        baseData.remove(key);
    }

    public String get(String key, String defaultValue) {
        String getValue = baseData.getOrDefault(key, defaultValue);
        return getValue;
    }

    public Map<String, String> toMap() {
        return baseData.stream().collect(Collectors.toMap());
    }
}
// END
