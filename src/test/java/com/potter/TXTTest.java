package com.potter;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static com.potter.utils.Files.readTextFromPath;

public class TXTTest {
    @Test
    void txtFile() throws IOException {
        String txtFilePath = "src/test/resources/txt-file.txt";
        String textFromFile = "Тестовый файл для TXT теста";

        String txtFile = readTextFromPath(txtFilePath);
        assertThat(txtFile, containsString(textFromFile));
    }
}
