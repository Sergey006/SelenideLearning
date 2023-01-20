package tests.third;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.BaseTest;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;


public class ProgressBar extends BaseTest {

    private static final String url = "progressbar";

    @Test
    public void progressBarTest() {
        open(url);

        $(By.id("startButton")).click();
        $(By.id("progressBar")).shouldHave(Condition.text("75"), Duration.ofSeconds(50));
        $(By.id("stopButton")).click();
        assertThat($(By.id("progressBar")).has(Condition.text("75"))).isTrue();
    }

}
