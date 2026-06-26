package helpers;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;


public class BaseTest {
    @BeforeAll
    static void setup(){
        Configuration.baseUrl = "https://qaplayground.dev/apps";
        Configuration.pageLoadStrategy = "eager";
    }
}
