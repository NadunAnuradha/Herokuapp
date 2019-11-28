package auto.pages;


import auto.utility.Services;
import auto.utility.Elements;
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

    @FindBy(css = Elements.txtUserName)
    private WebElement txtUserName;

    @FindBy(css = Elements.txtPassword)
    private WebElement txtPassword;

    @FindBy(css = Elements.btnLogin)
    private WebElement btnLogin;

    @FindBy(css = Elements.actualMsg)
    private WebElement actualMsg;

    public void verifyLogin(String username, String password) throws InterruptedException {

        clearAndType(txtUserName, username);
        clearAndType(txtPassword, password);
        click(btnLogin);
        assertTrue(getText(actualMsg).contains(Elements.MSG_SUCCESS),
                "Actual '" + getText(actualMsg) + "' should be same as expected '" + Elements.MSG_SUCCESS + "'.");
    }

    public void verifyLoginWithInvalidUser(String username, String password) {

        clearAndType(txtUserName, username);
        clearAndType(txtPassword, password);
        click(btnLogin);
        assertTrue(getText(actualMsg).contains(Elements.MSG_ERROR),
                "Actual '" + getText(actualMsg) + "' should be same as expected '" + Elements.MSG_ERROR + "'.");
    }
}
