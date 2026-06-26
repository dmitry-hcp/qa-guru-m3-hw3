import com.codeborne.selenide.Configuration;
import helpers.BaseTest;
import org.junit.jupiter.api.Test;
import pages.VerifyPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QaPlayGroundTests extends BaseTest {

    @Test
    void verifyAccount () {
        VerifyPage verifyPage = new VerifyPage();

        verifyPage.open();
        verifyPage.enterCode("9");

        String infoText = verifyPage.getInfoText();

        assertEquals("Success", infoText);
    }
}
