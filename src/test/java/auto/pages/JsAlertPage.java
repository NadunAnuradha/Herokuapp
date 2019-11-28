package auto.pages;

import auto.utility.Elements;
import auto.utility.Services;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JsAlertPage extends Services {

    public JsAlertPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = Elements.linkJsalerts)
    private WebElement linkJsalerts;

    @FindBy(css = Elements.btnJSconfirm)
    private WebElement btnJSconfirm;

    @FindBy(css = Elements.btnJSPrompt)
    private WebElement btnJSPrompt;

    @FindBy(css = Elements.JsresultMsg)
    private WebElement JsresultMsg;

    public void NavigatetJsAlert() throws InterruptedException {
        click(linkJsalerts);
    }

    public void VerifyJsConfirm() throws InterruptedException {
        btnJSconfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(getText(JsresultMsg), Elements.SUCCESS_MSG);

    }

    public void testJsCancel() throws InterruptedException {
        btnJSPrompt.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Assert.assertEquals(getText(JsresultMsg), Elements.null_MSG);

    }

}
