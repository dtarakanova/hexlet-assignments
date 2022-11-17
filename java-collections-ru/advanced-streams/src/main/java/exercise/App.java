package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String configFile) {
        return Arrays.stream(configFile.split("\n"))
                .filter(x -> x.startsWith("environment="))
                .map (x -> x.replaceAll("environment=",""))
                .map (t -> t.replaceAll(",  \"", ""))
                .map(s -> s.split(","))
                .flatMap(strings -> Arrays.stream(strings))
                .filter(x -> x.contains("X_FORWARDED_"))
                .map (x -> x.replaceAll("\"",""))
                .map (x -> x.replaceAll("X_FORWARDED_",""))
                .collect(Collectors.joining(","));

    }

}
//END
