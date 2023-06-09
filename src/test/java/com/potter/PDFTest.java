package com.potter;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static com.potter.utils.Files.*;


public class PDFTest {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "src/test/resources/pdf-file.pdf";
        String textFromFile = "Тестовый файл для PDF теста";

        PDF pdfFile = getPdf(pdfFilePath);
        assertThat(pdfFile, PDF.containsText(textFromFile));
    }
}
