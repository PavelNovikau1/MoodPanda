import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class MoodPandaTest extends BaseTest {

    @Test(description = "Checking the possibility of changing mood")
    public void moodTest() {
        loginPage.openPage()
                .login("pablo777@mailinator.com", "TestPass123")
                .waitForMoodButtonVisible()
                .clickUpdateMoodButton()
                .updateMood(3)
                .clickUpdateMoodButtonOnModalPage()
                .goToMyDiaryPage();
        Assert.assertEquals(myDiaryPage.getUpdatedMoodValue(), "3");
    }
}
