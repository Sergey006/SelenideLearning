package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HiddenLayersTest extends BaseTest {

    final static String taskUrl = "hiddenlayers";

    @Test
    public void hiddenLayersTest() {
        open(taskUrl);
        clickGreenButton();
        assertThatThrownBy(() -> clickGreenButton())
                .hasCauseExactlyInstanceOf(ElementClickInterceptedException.class)
                .hasMessageContaining("element click intercepted");
    }

    private void clickGreenButton() {
        $(By.id("greenButton")).click();
    }
}
