package handler;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UploadFileTest {

    @Test
    public void uploadTest() {
        open("https://the-internet.herokuapp.com/upload");
        File uplaodedFile = new File("src/test/resources/json.JPG");

        $("#file-upload").uploadFile(uplaodedFile);
        $("#file-submit").click();

        $("h3").shouldHave(text("File Uploaded!"));
        $("#uploaded-files").shouldHave(text("json.JPG"));
    }
}
