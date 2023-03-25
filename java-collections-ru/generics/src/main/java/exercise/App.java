package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        for (var i = 0; i < allChars.length; i++) {
            if (allChars[i].equals('a') || allChars[i].equals('o') || allChars[i].equals('i') || allChars[i].equals('e') || allChars[i].equals('u')) {
                i++;
            } else {
                result.append(allChars[i]);
            }
        }

        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean isOk = true;
            for (Map.Entry<String, String> item: where.entrySet()) {
                if (! (book.containsKey(item.getKey()) && book.get(item.getKey()).equals(item.getValue()))) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
