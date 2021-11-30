package pages;

import lombok.extern.log4j.Log4j2;
import lombok.val;
import lombok.var;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class RateYourHappinessModalPage extends HeaderPage {

    private static final String UPDATE_MOOD_BUTTON_ON_MODAL_PAGE_CSS = "//*[@type='button'][contains(text(),'Update Mood')]";
    private static final String SLIDER_CSS = ".ui-slider-handle";
    private static final String TEXT_AREA_CSS = "#TextBoxUpdateMoodTag";

    public RateYourHappinessModalPage updateMood(int moodValue) {
        log.info(String.format("Set mod value : '%s' into text area", moodValue));
        $(SLIDER_CSS).click();
        val defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (var i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        return this;
    }

    public MoodUpdatedModalPage clickUpdateMoodButtonOnModalPage() {
        log.info("Click '>UPDATE MOOD< button'");
        $(By.xpath(UPDATE_MOOD_BUTTON_ON_MODAL_PAGE_CSS)).click();
        return new MoodUpdatedModalPage();
    }

    public MoodUpdatedModalPage fillingTextArea(String text) {
        log.info(String.format("Type text: '%s' into text area", text));
        $(TEXT_AREA_CSS).sendKeys(text);
        return new MoodUpdatedModalPage();
    }
}