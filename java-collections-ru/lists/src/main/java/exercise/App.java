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
        String[] all = symbols.split("");
        List<String> mimi = new ArrayList<>(Arrays.asList(all));
        for (String x : toCheck) {
            if (mimi.contains(x)) {
                mimi.remove(x);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END