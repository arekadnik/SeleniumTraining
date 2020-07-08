package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LandingPage {


    public LandingPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "#Content a")
    private WebElement enterStoreLink;

    public void clickOnEnterStoreLink() {
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();

    }
}
