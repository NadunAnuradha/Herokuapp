package auto.testcases;

import auto.pages.IFramepage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestIFrame extends Init {


    @Test
    public void testIFrame() throws InterruptedException {
        WelcomePage welcomePage = new  WelcomePage(driver);
        IFramepage iFramepage = new IFramepage(driver);
        welcomePage.NavigatetIFrame();
        iFramepage.AccessIFrame();
    }
}
