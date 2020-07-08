package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final BrowserType BROWSER_TYPE = BrowserType.FIREFOX;
    private static WebDriver driver;

    public DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            BrowserFactory.getBrowser(BROWSER_TYPE);

        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
