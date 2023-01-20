package tests.third;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VerifyTextTest extends BaseTest {
    private static final String url = "verifytext";

    @Test
    public void verifyTextTest() {
        open(url);
        $(By.xpath("//span[normalize-space(.)='Welcome UserName!']")).click();
    }
}
