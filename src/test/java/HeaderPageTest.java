import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class HeaderPageTest extends BaseTest {

    @Test(description = "Checking the possibility of exiting from account")
    public void logOutTest() {
        loginPage.openPage()
                .login("pablo777@mailinator.com", "TestPass123")
                .logout();
        Assert.assertTrue(MainPage.isImageOnMainPageDisplayed());
    }
}
