package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AjaxTest extends BaseTest {

    final static String url = "ajax";

    @Test
    public void ajaxTest() {
        open(url);
        $(By.id("ajaxButton")).click();
        $(By.id("spinner")).shouldBe(disappear, Duration.ofSeconds(20));
        $(By.id("content")).shouldBe(visible).shouldHave(text("Data loaded with AJAX get request."));
    }
}
