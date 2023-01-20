package tests.first;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class ClassAttributeTest extends BaseTest {

    final static String url = "classattr";

    @Test
    public void classAttributeTest() {
        open(url);
        $(By.xpath("//*[contains(@class, 'btn-primary')]")).click();
        webdriver().driver().switchTo().alert().accept();
    }
}
