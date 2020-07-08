package Test;

import driver.DriverUtils;
import org.testng.annotations.Test;
import pageObjects.*;

import static navigations.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.*;


public class FailedLoginTest extends BaseTest {

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("NotExistingLogin");
        loginPage.typeIntoPasswordField("NotProperPassword");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
