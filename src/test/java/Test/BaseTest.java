package Test;

import driver.DriverManager;
import driver.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static navigations.ApplicationURLs.APPLICATION_URL;

public class BaseTest {


    @BeforeMethod
    public void setup() {
        DriverManager.getDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
