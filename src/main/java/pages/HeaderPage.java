package pages;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage extends LoginPage {

    private static final String DROPDOWN_ACCOUNT_MENU_CSS = "#Settings";
    private static final String LOGOUT_BUTTON_CSS = "[href*='Logout']";

    public void logout() {
        $(DROPDOWN_ACCOUNT_MENU_CSS).click();
        $(LOGOUT_BUTTON_CSS).click();
    }
}
