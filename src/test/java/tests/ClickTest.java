package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ClickTest extends BaseTest {
    private final String url = "click";

    @Test
    public void clientDelayTest() {
        open(url);
        $(By.cssSelector(".btn.btn-primary")).click();
        $(By.cssSelector(".btn.btn-success")).shouldBe(visible);
    }
}
