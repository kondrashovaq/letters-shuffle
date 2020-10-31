package org.ekondrashova.lettershuffle;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public String readTextFromFile(String path) throws IOException {
        return Files.readString(Paths.get(path), StandardCharsets.UTF_8);
    }
}
