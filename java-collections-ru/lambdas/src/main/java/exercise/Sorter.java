package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<Map<String, String>> takeOldestMans(List<Map<String, String>> users) {
        List<Map<String, String>> sortedList = users.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return sortedList;
    }
}
// END
