package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<String> sortedApps = apartments.stream()
                .sorted((another1, another2) -> another1.compareTo(another2))
                .limit(n)
                .map(x -> x.toString())
                .collect(Collectors.toList());
        return sortedApps;
    }
}
// END
