package handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadFileTest {

    @Test
    public void downloadTest() throws FileNotFoundException {
        open("https://the-internet.herokuapp.com/download");
        File downloadedFile = $(byText("testing.docx")).download();

        String expectedFile = "testing.docx";
        String actualFile = downloadedFile.getName();

        Assertions.assertEquals(expectedFile, actualFile);
    }
}
