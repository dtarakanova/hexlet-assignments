package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> swapped = new HashMap<String, String>();
        for(Map.Entry<String, String> entry : storage.entrySet()) {
            swapped.put(entry.getValue(), entry.getKey());
        }
        return swapped;
    }
}
// END
