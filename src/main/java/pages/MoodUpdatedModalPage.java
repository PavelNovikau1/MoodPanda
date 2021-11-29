package pages;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage extends RateYourHappinessModalPage {

    private static final String GO_TO_MY_DIARY_BUTTON_CSS = ".btn.btn-ssm.btn-default.ButtonMyDiary.pull-left";

    public MyDiaryPage goToMyDiaryPage() {
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new MyDiaryPage();
    }
}
