package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public static Map<String, String> swapKeyValue(Map<String, String> baseData) {
        Map<String, String> swapped = new HashMap<String, String>();
        for(Map.Entry<String, String> entry : baseData.entrySet())
        swapped.put(entry.getValue(), entry.getKey());
        return swapped;
        }
// END
