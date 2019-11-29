package auto.testcases;

import auto.pages.IFramepage;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestIFrame extends Init {


    @Test
    public void testIFeame() throws InterruptedException {
        IFramepage iFramepage = new IFramepage(driver);
        iFramepage.NavigatetIFrame();
        iFramepage.AccessIFrame();
    }
}
