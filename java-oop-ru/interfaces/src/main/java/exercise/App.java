package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List sortedApps = apartments.stream()
                .sorted(Home::toCompare)
                .limit(n)
                .collect(Collectors.toList());
        return sortedApps;
    }
}
// END
