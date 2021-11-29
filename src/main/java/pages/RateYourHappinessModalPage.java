package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage extends HeaderPage {

    private static final String UPDATE_MOOD_BUTTON_ON_MODAL_PAGE_CSS = "//*[@type='button'][contains(text(),'Update Mood')]";
    private static final String SLIDER_CSS = ".ui-slider-handle";
    private static final String TEXT_AREA_CSS = "#TextBoxUpdateMoodTag";

    public RateYourHappinessModalPage updateMood(int moodValue) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue) {
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue) {
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        return this;
    }

    public MoodUpdatedModalPage clickUpdateMoodButtonOnModalPage() {
        $(By.xpath(UPDATE_MOOD_BUTTON_ON_MODAL_PAGE_CSS)).click();
        return new MoodUpdatedModalPage();
    }

    public MoodUpdatedModalPage fillingTextArea(String text) {
        $(TEXT_AREA_CSS).sendKeys(text);
        return new MoodUpdatedModalPage();
    }
}