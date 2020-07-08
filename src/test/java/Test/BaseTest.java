package Test;

import driver.DriverManager;
import driver.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void setup() {
        DriverManager.getDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
