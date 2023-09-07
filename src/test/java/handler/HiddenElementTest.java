package handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DynamicLoadingPage;

public class HiddenElementTest {

    @Test
    void hiddenLoadingPageTest() {
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

        dynamicLoadingPage.openPageOne();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.waitBeforeElementIsVisible();

        String text = dynamicLoadingPage.getFinishElementText();
        Assertions.assertEquals("Hello World!", text);
    }
}
