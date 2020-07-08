package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage {


    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    public void clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
    }
}
