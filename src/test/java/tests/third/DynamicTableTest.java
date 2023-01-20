package tests.third;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;


public class DynamicTableTest extends BaseTest {
    private static final String url = "dynamictable";

    @Test
    public void dynamicTableTest() {
        open(url);

        String chromeCPU = $(By.cssSelector(".bg-warning")).getText().replace("Chrome CPU:", "").trim();

        List<SelenideElement> headers = $$(By.xpath("//*[@role='columnheader']"));
        SelenideElement cpuElement = headers.stream().filter(h -> h.has(text("CPU"))).findFirst().get();
        int indexOfCPU = headers.indexOf(cpuElement);

        List<SelenideElement> chromeRowElements = $$(By.xpath("//*[@role='cell' and text()='Chrome']/../span"));
        assertThat(chromeRowElements.get(indexOfCPU).getText()).isEqualTo(chromeCPU);
    }
}
