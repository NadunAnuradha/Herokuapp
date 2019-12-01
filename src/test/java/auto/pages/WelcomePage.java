package auto.pages;


import auto.utility.Services;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WelcomePage extends Services {
    public WelcomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#content > ul > li:nth-child(21) > a")
    private WebElement linkAuthentication;

    @FindBy(css = "#content > ul > li:nth-child(29) > a")
    private WebElement linkJsalerts;

    @FindBy(css = "#content > ul > li:nth-child(18) > a")
    private WebElement linkFileupload;

    @FindBy(css = "#content > ul > li:nth-child(22) > a")
    private WebElement linkFrame;

    @FindBy(css = "#content > div > ul > li:nth-child(2) > a")
    private WebElement linkiFrame;


    public void NavigatetoFileUpload()  {
        click(linkFileupload);
    }

    public void NavigatetoLogin() throws InterruptedException {
        click(linkAuthentication);
    }

    public void NavigatetJsAlert() throws InterruptedException {
        click(linkJsalerts);
    }

    public void NavigatetIFrame() throws InterruptedException {
        click(linkFrame);
        click(linkiFrame);
    }
}
