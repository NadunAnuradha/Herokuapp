package auto.testcases;

import auto.pages.LoginPage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestLogin extends Init{

    @Test
    public void testLoginSuccess() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogin("tomsmith", "SuperSecretPassword!");
    }

    @Test
    public void testLoginWithInvalidUser() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLoginWithInvalidUser("abcdef", "abcdef");
    }

}