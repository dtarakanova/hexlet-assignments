package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List buildApartmentsList(List<Home> apartments, int n) {
        List sortedApps = apartments.stream()
                .sorted(x -> x.getArea())
                .limit(n)
                .collect(Collectors.toList());
        return sortedApps;
    }
}

// END
