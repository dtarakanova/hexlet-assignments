package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> swapped = storage.toMap();
        for(Map.Entry<String, String> entry : storage.entrySet()) {
            storage.set(entry.getValue(), entry.getKey());
        }
        return swapped;
    }
}
// END
