package exercise;

import java.util.HashMap;
import java.util.Map;


// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        if (sentence.length() == 0) {
            return map;
        }
        for (var i = 0; i < words.length; i++) {
            int count = 0;
            for (var j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            map.put(words[i], count);
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append("  " + entry.getKey() + ": " + entry.getValue() + "\n");
        }
        result.append("}");
        String fin = result.toString();
        return fin;
    }
}
//END
