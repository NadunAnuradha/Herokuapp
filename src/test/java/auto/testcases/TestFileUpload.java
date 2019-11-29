package auto.testcases;

import auto.pages.FileUploadPage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestFileUpload extends Init{

        @Test
        public void testFileUpload() throws InterruptedException {
            FileUploadPage fileUploadPage = new FileUploadPage(driver);
            fileUploadPage.NavigatetoFileUpload();
            fileUploadPage.verifyFileUpload();

    }

}
