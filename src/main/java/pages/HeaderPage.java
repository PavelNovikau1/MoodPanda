package pages;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage extends LoginPage {


    public void logout() {
        $(DROPDOWN_ACCOUNT_MENU_CSS).click();
        $(LOGOUT_BUTTON_CSS).click();
    }
}
