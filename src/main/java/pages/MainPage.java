package pages;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    private static final String HOME_PAGE_IMAGE_CSS = ".img-responsive.img-centered";

    public static boolean isImageOnMainPageDisplayed() {
        return $(HOME_PAGE_IMAGE_CSS).isDisplayed();
    }
}
