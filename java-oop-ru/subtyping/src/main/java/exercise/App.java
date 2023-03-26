package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        data.entrySet().stream()
                .forEach (x -> {
                    var k = x.getKey();
                    var v = x.getValue();
                    storage.unset(k);
                    storage.set(v, k);
                }
    }
}
// END
