package auto.testcases;

import auto.pages.LoginPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestLogin extends Init{

    @Test
    public void testLoginSuccess() throws InterruptedException {
        WelcomePage welcomePage = new  WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        welcomePage.NavigatetoLogin();
        loginPage.verifyLogin("tomsmith", "SuperSecretPassword!");
    }

    @Test
    public void testLoginWithInvalidUser() throws InterruptedException {
        WelcomePage welcomePage = new  WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        welcomePage.NavigatetoLogin();
        loginPage.verifyLoginWithInvalidUser("abcdef", "abcdef");
    }

}