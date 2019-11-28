package auto.pages;

import auto.utility.Elements;
import auto.utility.Services;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FileUpload extends Services {
    public FileUpload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = Elements.linkFileupload)
    private WebElement linkFileupload;

    @FindBy(css = Elements.txtFileupload)
    private WebElement txtFileupload;

    @FindBy(css = Elements.btnFilesubmit)
    private WebElement btnFilesubmit;

    @FindBy(css = Elements.Result_upload)
    private WebElement Result_upload;

    @FindBy(css = Elements.Result_upload_Filename)
    private WebElement Result_upload_Filename;

    public void NavigatetoFileUpload() throws InterruptedException {
        click(linkFileupload);
    }

    public void verifyFileUpload() throws InterruptedException{
        clearAndType(txtFileupload, "C:\\Exilesoft\\Herokuapp\\burrito.jpg");
        btnFilesubmit.click();
        Assert.assertEquals(getText(Result_upload), Elements.MSG_upload_Success);
        Assert.assertEquals(getText(Result_upload_Filename), Elements.Upload_FileName);
    }
}
