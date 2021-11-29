import org.testng.Assert;
import org.testng.annotations.Test;

public class MyDiaryPageTest extends BaseTest {

    @Test(description = "Checking if the text area is filled")
    public void textAreaFillingTest() {
        loginPage.openPage()
                .login("pablo777@mailinator.com", "TestPass123")
                .waitForMoodButtonVisible()
                .clickUpdateMoodButton()
                .fillingTextArea("I am OK")
                .clickUpdateMoodButtonOnModalPage()
                .goToMyDiaryPage();
        Assert.assertEquals(myDiaryPage.getTextMessage(), "I am OK");
    }
}
