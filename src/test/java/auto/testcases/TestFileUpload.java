package auto.testcases;

import auto.pages.FileUploadPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestFileUpload extends Init{

        @Test
        public void testFileUpload() throws InterruptedException {
            WelcomePage  welcomePage = new  WelcomePage(driver);
            FileUploadPage fileUploadPage = new FileUploadPage(driver);
            welcomePage.NavigatetoFileUpload();
            fileUploadPage.verifyFileUpload();

    }

}
