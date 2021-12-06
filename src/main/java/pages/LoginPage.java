package pages;

import lombok.extern.log4j.Log4j2;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class LoginPage extends MainPage {

    private static final String EMAIL_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxEmail";
    private static final String PASSWORD_INPUT_CSS = "#ContentPlaceHolderContent_TextBoxPassword";
    private static final String LOGIN_BUTTON_CSS = "#ContentPlaceHolderContent_ButtonLogin";

    public LoginPage openPage() {
        openUrl("/login/");
        return this;
    }

    public FeedPage login(String email, String password) {
        log.info(String.format("Type text: '%s' into USERNAME input", email));
        $(EMAIL_INPUT_CSS).sendKeys(email);
        log.info(String.format("Type text: '%s' into PASSWORD input", password));
        $(PASSWORD_INPUT_CSS).sendKeys(password);
        log.info("Click on >LOGIN BUTTON<");
        $(LOGIN_BUTTON_CSS).click();
        return new FeedPage();
    }
}
