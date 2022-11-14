package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans (List<Map<String,String>> users ) {
        return users.stream()
                .filter(i -> i.get("gender").equals("male"))
                .sorted(Comparator.comparing(j -> j.get("birthday")))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
