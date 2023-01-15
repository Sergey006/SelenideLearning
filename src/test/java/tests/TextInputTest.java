package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextInputTest extends BaseTest {

    private static final String url = "textinput";

    @Test
    public void clientDelayTest() {
        open(url);
        String typedText = "change";
        $(By.id("newButtonName")).val(typedText);
        SelenideElement element = $(By.cssSelector(".btn.btn-primary"));
        element.click();
        element.shouldHave(text(typedText));
    }
}
