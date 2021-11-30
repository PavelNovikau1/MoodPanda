package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class FeedPage extends HeaderPage {

    private static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";

    public FeedPage waitForMoodButtonVisible() {
        log.info("Wait for 10 seconds that the >UPDATE MOOD BUTTON< is visible");
        $(UPDATE_MOOD_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public RateYourHappinessModalPage clickUpdateMoodButton() {
        log.info("Click 'UPDATE MOOD' button");
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }
}
