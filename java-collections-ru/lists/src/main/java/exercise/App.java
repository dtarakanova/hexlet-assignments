package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        word = word.toLowerCase();
        String[] arSymbols = word.split("");
        List<String> toCheck = new ArrayList<>(Arrays.asList(arSymbols));
        String[] allSymbols = symbols.split("");
        List<String> symbolList = new ArrayList<>(Arrays.asList(allSymbols));
        for (String x : toCheck) {
            if (symbolList.contains(x)) {
                symbolList.remove(x);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END