package tests.third;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ScrollbarsTest extends BaseTest {

    private static final String url = "scrollbars";

    @Test
    public void scrollbarTest() {
        open(url);
        $(By.cssSelector(".btn.btn-primary")).click();
    }
}
