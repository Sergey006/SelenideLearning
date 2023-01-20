package tests.first;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DynamicIDTest extends BaseTest {

    final static String url = "dynamicid";

    @Test
    public void clickButton() {
        open(url);
        $(By.cssSelector(".btn.btn-primary")).click();
    }

}
