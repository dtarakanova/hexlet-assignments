package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        String newSymbols = symbols.toLowerCase();
        String newWord = word.toLowerCase();

        List<String> symbolsList = new ArrayList<>();
        for (var i = 0; i < newSymbols.length(); i++) {
            symbolsList.add(Character.toString(newSymbols.charAt(i)));
        }

        List<String> wordList = new ArrayList<>();
        for (var j = 0; j < newWord.length(); j++) {
            wordList.add(Character.toString(newWord.charAt(j)));
        }

        for (String n : wordList) {
            if (symbolsList.contains(n)) {
                symbolsList.remove(n);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
