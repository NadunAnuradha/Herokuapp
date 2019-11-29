package auto.pages;

import auto.utility.Elements;
import auto.utility.Services;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IFramepage extends Services {
    public IFramepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = Elements.linkFrame)
    private WebElement linkFrame;

    @FindBy(css = Elements.linkiFrame)
    private WebElement linkiFrame;

    @FindBy(css = Elements.Iframe)
    private WebElement Iframe;

    @FindBy(css = Elements.txtIframe)
    private WebElement txtIframe;

    @FindBy(css = Elements.Iframetxt_String)
    private WebElement Iframetxt_String;


    public void NavigatetIFrame() throws InterruptedException {
        click(linkFrame);
        click(linkiFrame);
    }

    public void AccessIFrame() throws InterruptedException {

        driver.switchTo().frame(Iframe);
        clearAndType(txtIframe, "I love pizza");
        Assert.assertEquals(getText(txtIframe), Elements.Iframetxt_String);
    }
}
