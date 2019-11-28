package auto.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.Properties;

public class Driverbase {
    private  String browser;
    public static Properties prop;
    public WebDriver getDriver() {

        browser =  "chrome" ;
        if (browser.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (browser.equalsIgnoreCase("ie"))
            return new InternetExplorerDriver();
        else {
            return new FirefoxDriver();
        }
    }
}
