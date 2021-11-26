import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utils.PropertyReader;

public class HeaderPageTest extends BaseTest {

    @Test(description = "Checking the possibility of exiting from account")
    public void logOutTest() {
        loginPage.openPage()
                .login(System.getProperty("mail", PropertyReader.getProperty("mail")), System.getProperty("password", PropertyReader.getProperty("password")))
                .logout();
        Assert.assertTrue(MainPage.isImageOnMainPageDisplayed());
    }
}
