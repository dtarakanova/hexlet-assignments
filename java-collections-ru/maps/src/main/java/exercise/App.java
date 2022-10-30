package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> words = new HashMap<>();
        if (sentence.length() == 0) {
            return words;
        }
        String[] allWords = sentence.split(" ");

        for (var i = 0; i < allWords.length; i++) {
            var count = 0;
            for (var j = 0; j < allWords.length; j++) {
                if (allWords[i].equals(allWords[j])) {
                    count = count + 1;
                }
            }
            words.put(allWords[i], count);
        }
        return words;
    }

    public static String toString(Map<String, Integer> words) {
        String result = "";
        if (words.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        for (Map.Entry<String, Integer> n : words.entrySet()) {
            stringBuilder.append("  " + n.getKey() + ": " + n.getValue() + "\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
//END
