package Test;

import org.testng.annotations.Test;
import pageObjects.*;

import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTest extends BaseTest {

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();
        FooterPage footerPage = new FooterPage();

        assertTrue(footerPage.isBannerAfterLoginDisplayed());
    }

}
