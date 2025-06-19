package Tests;

import Pages.CommonPage;
import Pages.FramePage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class FramesTests extends Hooks {
    public FramePage framePage;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {

        framePage=new FramePage(getDriver());
        homePage=new HomePage(getDriver());
        commonPage=new CommonPage(getDriver());

        homePage.GoToDesiredMeniu("Alerts, Frame & Windows");
        commonPage.GoToDesiredSubMeniu("Frames");
        framePage.frameOane();
        framePage.frameTwo();



//        WebElement frame1Element = getDriver().findElement(By.id("frame1"));
//        framesMethods.switchToFrame(frame1Element);
////        //schimbat focusul pe frame
////        driver.switchTo().frame(frame1Element);
//        WebElement sampleHeadingFramePage = getDriver().findElement(By.id("sampleHeading"));
//        System.out.println("Textul from the first frame is: " + sampleHeadingFramePage.getText());
//
//
//        framesMethods.switchToDefoultFrame();
//        // intoarcere cu focusul pe pagina principala
////        driver.switchTo().defaultContent();
//
//
//        WebElement frame2Element = getDriver().findElement(By.id("frame2"));
//        framesMethods.switchToFrame(frame2Element);
//        //schimbat focusul pe frame 2
//      //  driver.switchTo().frame(frame2Element);
//        WebElement sampleHeading2FramePage = getDriver().findElement(By.id("sampleHeading"));
//        javaScriptMethods.javaScriptScrollPage(200,200);
//       // js.executeScript("window.scrollBy(200,200)");
//        System.out.println("Textul from the second frame is: " + sampleHeading2FramePage.getText());
    }
}
