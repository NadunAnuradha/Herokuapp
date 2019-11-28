package auto.testcases;

import auto.pages.JsAlertPage;
import com.sun.jna.platform.win32.WinDef;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import auto.utility.Init;

public class TestJsAlert extends Init{

  //    @Parameters({ "UrlJs" })
//    @Test
//    public void testLoginSuccess(String UrlJs) throws InterruptedException {
        //JsAlertPage jsAlertPage = new JsAlertPage(driver);
        //jsAlertPage.clickOnButton(UrlJs);
   // }

    @Test
    public void testJsConfirm() throws InterruptedException {
    JsAlertPage jsAlertPage = new JsAlertPage(driver);
    jsAlertPage.VerifyJsConfirm();
    }

    @Test
    public void testJsCancel() throws InterruptedException {
        JsAlertPage jsAlertPage = new JsAlertPage(driver);
        jsAlertPage.testJsCancel();
    }
}
