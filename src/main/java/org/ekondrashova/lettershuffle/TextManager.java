package org.ekondrashova.lettershuffle;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextManager {
    private final FileReader fileReader = new FileReader();
    private final StringUtils stringUtils = new StringUtils();

    private final Map<String, String> shuffledWords = new HashMap<>();

    public void process(String path) {
        String text;

        try {
            text = fileReader.readTextFromFile(path);
        } catch (IOException e) {
            System.out.println("Файл не найден");
            return;
        }

        String[] words = text.split("(?U)\\W+");

        for (String s : words) {
            shuffledWords.put(s, stringUtils.shuffleLetters(s));
        }

        for (Map.Entry<String, String> entry : shuffledWords.entrySet()) {
            String word = entry.getKey();
            String shuffledWord = entry.getValue();
            text = text.replace(word, shuffledWord);
        }

        System.out.println(text);
    }
}
