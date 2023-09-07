package handler;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DynamicLoadingPage;

import static com.codeborne.selenide.Selenide.$;

public class RenderedElementTest {

    @Test
    void renderedLoadingPageTest() {
        final SelenideElement renderedElement = $("#finish h4");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

        dynamicLoadingPage.openPageTwo();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.waitBeforeElementIsVisible();

        Assertions.assertTrue(renderedElement.exists());
    }
}