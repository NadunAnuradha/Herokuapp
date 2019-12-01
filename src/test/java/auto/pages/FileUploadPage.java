package auto.pages;

import auto.utility.Services;
import auto.utility.Configfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FileUploadPage extends Services {
    public FileUploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    final static  String MSG_upload_Success = "File Uploaded!";
    final static  String Upload_FileName = "burrito.jpg";

    @FindBy(css = "#file-upload")
    private WebElement txtFileupload;

    @FindBy(css = "#file-submit")
    private WebElement btnFilesubmit;

    @FindBy(css = "#content > div > h3")
    private WebElement Result_upload;

    @FindBy(css = "#uploaded-files")
    private WebElement Result_upload_Filename;


    public void verifyFileUpload() throws InterruptedException{
        clearAndType(txtFileupload, Configfile.fileuploadpath);
        btnFilesubmit.click();
        Assert.assertEquals(getText(Result_upload), MSG_upload_Success);
        Assert.assertEquals(getText(Result_upload_Filename), Upload_FileName);
    }
}
