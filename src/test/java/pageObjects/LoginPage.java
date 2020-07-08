package pageObjects;

import driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul li")
    private WebElement messageLabel;


    public void typeIntoUserNameField(String userName) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.sendKeys(userName);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        signOnButton.click();
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        return warningText;
    }
}
