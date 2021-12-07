package pages;

import lombok.extern.log4j.Log4j2;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class MoodUpdatedModalPage extends RateYourHappinessModalPage {

    private static final String GO_TO_MY_DIARY_BUTTON_CSS = ".btn.btn-ssm.btn-default.ButtonMyDiary.pull-left";

    public MyDiaryPage goToMyDiaryPage() {
        log.info("Open My Diary page");
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new MyDiaryPage();
    }
}
