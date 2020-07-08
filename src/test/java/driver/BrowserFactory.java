package driver;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
    private static final Logger logger = LoggerFactory.getLogger(BrowserType.class);

    public static WebDriver getBrowser(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/Users/arek/IdeaProjects/SeleniumTraining/driver/chromedriver");
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver", "C:/drivers/IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                logger.warn("Driver from Default");
                return new ChromeDriver();
        }
    }
}
