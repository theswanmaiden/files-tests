package com.potter;

import com.codeborne.xlstest.XLS;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;


public class XLSTest {
    @Test
    void xlsFile() throws IOException {
        String xlsFilePath = "src/test/resources/xls-file.xls";
        String textFromFile = "Тестовый файл для XLS теста";

        XLS xls = getXls(xlsFilePath);
        String xlsText = xls.excel.getSheetAt(0).getRow(1).getCell(1).toString();
        assertThat(xlsText, containsString(textFromFile));
    }
}
