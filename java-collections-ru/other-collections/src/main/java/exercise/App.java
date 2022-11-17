package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {

        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        Set<String> keySet = new TreeSet<>();
        keySet.addAll(data1.keySet());
        keySet.addAll(data2.keySet());

        for (var key: keySet) {
            if (!data1.containsKey(key)) {
                result.put(key, "added");
            } else if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (data1.get(key).equals(data2.get(key))) {
                result.put(key, "unchanged");
            } else {// иначе не равны
                result.put(key, "changed");
            }
        }
        return result;
    }
}
//END
