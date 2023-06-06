package com.potter.utils;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.io.FileUtils.getFile;

public class Files {
    public static PDF getPdf(String path) throws IOException {
        return new PDF(getFile(path));
    }
    public static String readTextFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }
    public static String readTextFromPath(String path) throws IOException {
        return readTextFromFile(getFile(path));
    }
    public static XLS getXls(String path) throws IOException {
        return new XLS(getFile(path));
    }
}
