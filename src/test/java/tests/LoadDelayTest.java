package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoadDelayTest extends BaseTest {

    final static String url = "";

    @Test
    public void loadDelay() {
        open(url);
        $(By.linkText("Load Delay")).click();
        $(By.xpath("//*[@class='btn btn-primary']")).click();
    }

}
