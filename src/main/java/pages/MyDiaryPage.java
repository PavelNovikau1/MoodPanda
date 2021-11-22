package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MyDiaryPage extends HeaderPage {

    public String getUpdatedMoodValue() {
        return $(LAST_CHANGED_MOOD_VALUE_CSS).getText();
    }

    public String getTextMessage() {
        return $(By.xpath(DISPLAYED_TEXT_ON_MY_UPDATES_PAGE_XPATH)).getText();
    }
}
