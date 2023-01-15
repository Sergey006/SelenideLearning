package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.sergey.Props;

import java.util.Properties;

public class BaseTest {

    final static Properties props = Props.getInstance().getProperties();

    @BeforeEach
    public void beforeTest() {
        Configuration.baseUrl = props.getProperty("url");
    }

    @AfterEach
    public void afterTest() {
    }
}
