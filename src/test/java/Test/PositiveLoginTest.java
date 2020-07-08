package Test;

import driver.DriverUtils;
import org.testng.annotations.Test;
import pageObjects.FooterPage;
import pageObjects.LoginPage;

import static navigations.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTest extends BaseTest {

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        FooterPage footerPage = new FooterPage();
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        assertTrue(footerPage.isBannerAfterLoginDisplayed());
    }


}
