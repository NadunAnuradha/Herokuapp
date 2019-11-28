package auto.testcases;

import auto.pages.JsAlertPage;
import org.testng.annotations.Test;
import auto.utility.Init;

public class TestJsAlert extends Init{

    @Test
    public void testJsConfirm() throws InterruptedException {
        JsAlertPage jsAlertPage = new JsAlertPage(driver);
        jsAlertPage.NavigatetJsAlert();
        jsAlertPage.VerifyJsConfirm();
    }

    @Test
    public void testJsCancel() throws InterruptedException {
        JsAlertPage jsAlertPage = new JsAlertPage(driver);
        jsAlertPage.NavigatetJsAlert();
        jsAlertPage.testJsCancel();
    }
}
