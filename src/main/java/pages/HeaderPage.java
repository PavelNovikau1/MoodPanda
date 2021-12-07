package pages;

import lombok.extern.log4j.Log4j2;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class HeaderPage extends LoginPage {

    private static final String DROPDOWN_ACCOUNT_MENU_CSS = "#Settings";
    private static final String LOGOUT_BUTTON_CSS = "[href*='Logout']";

    public void logout() {
        log.info("Click on >ACCOUNT< button");
        $(DROPDOWN_ACCOUNT_MENU_CSS).click();
        log.info("Click on >LOGOUT< button");
        $(LOGOUT_BUTTON_CSS).click();
    }
}
