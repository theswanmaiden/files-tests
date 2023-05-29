package com.potter;

import net.lingala.zip4j.ZipFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ZIPTest {

    @Test
    public void zipFile() throws IOException {
        String zipFilePath = "src/test/resources/secret.zip";
        String unzipFilePath = "src/test/resources/secret";
        String expectedText = "Текст из файла для ZIP теста";
        String password = "123";

        try (ZipFile zipFile = new ZipFile(zipFilePath, password.toCharArray())) {
            zipFile.extractFile("secret.txt", unzipFilePath);
        }

        String textFile = Files.readTextFromPath("src/test/resources/secret/secret.txt");
        assertThat(expectedText, containsString(textFile));
    }
}
