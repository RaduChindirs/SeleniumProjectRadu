package ShareData;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends ShareData {
    @BeforeMethod
    public void prepareEnvironment() {
        prepareBrowser();
    }

    @AfterMethod
    public void clearEnvironment() {
        clearBrowser();
    }

}
