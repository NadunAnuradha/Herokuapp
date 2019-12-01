package auto.testcases;

import auto.pages.JsAlertPage;
import auto.pages.WelcomePage;
import org.testng.annotations.Test;
import auto.utility.Init;

public class TestJsAlert extends Init{


    @Test
    public void testJsConfirm() throws InterruptedException {
        WelcomePage welcomePage = new  WelcomePage(driver);
        JsAlertPage jsAlertPage = new JsAlertPage(driver);
        welcomePage.NavigatetJsAlert();
        jsAlertPage.VerifyJsConfirm();
    }

    @Test
    public void testJsCancel() throws InterruptedException {
        WelcomePage welcomePage = new  WelcomePage(driver);
        JsAlertPage jsAlertPage = new JsAlertPage(driver);
        welcomePage.NavigatetJsAlert();
        jsAlertPage.testJsCancel();
    }
}
