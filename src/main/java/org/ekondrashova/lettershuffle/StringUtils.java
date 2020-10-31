package org.ekondrashova.lettershuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringUtils {
    public String shuffleLetters(String word) {
        if (word.length() < 2) {
            return word;
        }

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        return first + shuffleString(word.substring(1, word.length() - 1)) + last;
    }

    private String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }
}
