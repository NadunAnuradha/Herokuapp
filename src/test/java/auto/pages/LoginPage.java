package auto.pages;

import auto.utility.Services;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Services {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    final static String MSG_SUCCESS = "You logged into a secure area!";
    final static String MSG_ERROR = "Your username is invalid!";


    @FindBy(css = "#username")
    private WebElement txtUserName;

    @FindBy(css = "#password")
    private WebElement txtPassword;

    @FindBy(css = "button.radius")
    private WebElement btnLogin;

    @FindBy(css = "#flash")
    private WebElement actualMsg;


    public void verifyLogin(String username, String password) throws InterruptedException {

        clearAndType(txtUserName, username);
        clearAndType(txtPassword, password);
        click(btnLogin);
        assertTrue(getText(actualMsg).contains(MSG_SUCCESS),
                "Actual '" + getText(actualMsg) + "' should be same as expected '" + MSG_ERROR + "'.");
    }

    public void verifyLoginWithInvalidUser(String username, String password) {

        clearAndType(txtUserName, username);
        clearAndType(txtPassword, password);
        click(btnLogin);
        assertTrue(getText(actualMsg).contains(MSG_ERROR),
                "Actual '" + getText(actualMsg) + "' should be same as expected '" + MSG_ERROR + "'.");
    }
}
