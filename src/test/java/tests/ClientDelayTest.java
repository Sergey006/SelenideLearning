package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ClientDelayTest extends BaseTest {
    private final String url = "clientdelay";

    @Test
    public void clientDelayTest() {
        open(url);
        $(By.cssSelector(".btn.btn-primary")).click();
        $(By.id("spinner")).shouldBe(disappear, Duration.ofSeconds(20));
        $(By.id("content"))
                .shouldBe(visible)
                .shouldHave(text("Data calculated on the client side."))
                .click();
    }

}
