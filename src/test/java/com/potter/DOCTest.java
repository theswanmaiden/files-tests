package com.potter;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DOCTest {

    @Test
    public void docFile(){
        String docFile = "src/test/resources/docs/text.doc";
        String docxFile = "src/test/resources/docs/text.docx";

        assertThat(Files.getFileExtension(docFile), equalTo("doc"));
        assertThat(Files.getFileExtension(docxFile), equalTo("docx"));
    }
}
