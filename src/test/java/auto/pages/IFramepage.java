package auto.pages;

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

    final static String Iframetxt_String = "I love pizza";

    @FindBy(css = "#mce_0_ifr")
    private WebElement Iframe;

    @FindBy(css = "#tinymce")
    private WebElement txtIframe;


    public void AccessIFrame() throws InterruptedException {

        driver.switchTo().frame(Iframe);
        clearAndType(txtIframe, "I love pizza");
        Assert.assertEquals(getText(txtIframe), Iframetxt_String);
    }
}
