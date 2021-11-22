package pages;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    public static boolean isImageOnMainPageDisplayed() {
        return $(HOME_PAGE_IMAGE_CSS).isDisplayed();
    }
}
