package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingPage {
    public void openPageOne(){
        open("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    public void openPageTwo(){
        open("https://the-internet.herokuapp.com/dynamic_loading/2");
    }

    public void clickStartButton(){
        $("#start button").click();
    }

    public void waitBeforeElementIsVisible(){
        Configuration.timeout = 30000;
        $("#finish h4").shouldBe(Condition.visible);
    }

    public String getFinishElementText(){
        return $("#finish h4").getText();
    }
}
