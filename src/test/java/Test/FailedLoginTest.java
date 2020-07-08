package Test;

import org.testng.annotations.Test;
import pageObjects.*;

import static org.testng.AssertJUnit.*;


public class FailedLoginTest extends BaseTest {

    @Test
    public void myFirstTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();
        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();
        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
