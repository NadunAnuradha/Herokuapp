package auto.utility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Init extends Driverbase {
    protected WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        driver = getDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {

        if (driver != null)
            driver.quit();

    }
}