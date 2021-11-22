package pages;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage extends RateYourHappinessModalPage {


    public MyDiaryPage goToMyDiaryPage() {
        $(GO_TO_MY_DIARY_BUTTON_CSS).click();
        return new MyDiaryPage();
    }
}
