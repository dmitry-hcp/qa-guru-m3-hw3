package pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class VerifyPage {
    private final ElementsCollection code = elements(".code");
    private final SelenideElement info = element(".info");

    public VerifyPage open () {
        Selenide.open("/verify-account");
        return this;
    }

    public VerifyPage enterCode (String value) {
        code.asFixedIterable().forEach(el -> el.setValue(value));
        return this;
    }

    public String getInfoText () {
        return info.getText();
    }
}
