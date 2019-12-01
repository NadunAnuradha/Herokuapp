package auto.pages;


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


    final static  String SUCCESS_MSG = "You clicked: Ok";
    final static  String null_MSG = "You entered: null";


    @FindBy(css = "#content > div > ul > li:nth-child(2) > button")
    private WebElement btnJSconfirm;

    @FindBy(css = "#content > div > ul > li:nth-child(3) > button")
    private WebElement btnJSPrompt;

    @FindBy(css = "#result")
    private WebElement JsresultMsg;



    public void VerifyJsConfirm() throws InterruptedException {
        btnJSconfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(getText(JsresultMsg), SUCCESS_MSG);

    }

    public void testJsCancel() throws InterruptedException {
        btnJSPrompt.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Assert.assertEquals(getText(JsresultMsg), null_MSG);

    }

}
