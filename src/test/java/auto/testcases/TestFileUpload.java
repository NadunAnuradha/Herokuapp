package auto.testcases;

import auto.pages.FileUpload;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestFileUpload extends Init {

    @Test
    public void testFileUpload() throws InterruptedException {
        FileUpload fileUpload = new FileUpload(driver);
        fileUpload.NavigatetoFileUpload();
        fileUpload.verifyFileUpload();
    }
}
