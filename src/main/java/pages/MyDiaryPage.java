package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class MyDiaryPage extends HeaderPage {

    private static final String LAST_CHANGED_MOOD_VALUE_CSS = "[class|='badge badge']";
    private static final String DISPLAYED_TEXT_ON_MY_UPDATES_PAGE_XPATH = "//*[contains(@class,'media m1 ')]//div[contains(@class,'media-content')]";


    public String getUpdatedMoodValue() {
        log.info("Get new updated mood value");
        return $(LAST_CHANGED_MOOD_VALUE_CSS).getText();
    }

    public String getTextMessage() {
        log.info("Get new text message");
        return $(By.xpath(DISPLAYED_TEXT_ON_MY_UPDATES_PAGE_XPATH)).getText();
    }
}
