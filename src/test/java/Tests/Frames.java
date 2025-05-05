package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptMethods;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Frames extends ShareData {
    public FramesMethods framesMethods;
    public ElementsMethods elementsMethods;
    public JavaScriptMethods javaScriptMethods;

    @Test
    public void automationMethod() {

        framesMethods=new FramesMethods(driver);
        elementsMethods=new ElementsMethods(driver);
        javaScriptMethods=new JavaScriptMethods(driver);

        javaScriptMethods.javaScriptScrollPage(0,400);

        //Click pe Elements/ Click pe Web Table/ Open the Register Form
        WebElement alertFrameWindouwElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethods.clickOnElements(alertFrameWindouwElement);
     //   alertFrameWindouwElement.click();

        WebElement frameElements = driver.findElement(By.xpath("//span[text()='Frames']"));
        elementsMethods.clickOnElements(frameElements);
      //  frameElements.click();

        WebElement frame1Element = driver.findElement(By.id("frame1"));
        framesMethods.switchToFrame(frame1Element);
//        //schimbat focusul pe frame
//        driver.switchTo().frame(frame1Element);
        WebElement sampleHeadingFramePage = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul from the first frame is: " + sampleHeadingFramePage.getText());


        framesMethods.switchToDefoultFrame();
        // intoarcere cu focusul pe pagina principala
//        driver.switchTo().defaultContent();


        WebElement frame2Element = driver.findElement(By.id("frame2"));
        framesMethods.switchToFrame(frame2Element);
        //schimbat focusul pe frame 2
      //  driver.switchTo().frame(frame2Element);
        WebElement sampleHeading2FramePage = driver.findElement(By.id("sampleHeading"));
        javaScriptMethods.javaScriptScrollPage(200,200);
       // js.executeScript("window.scrollBy(200,200)");
        System.out.println("Textul from the second frame is: " + sampleHeading2FramePage.getText());
    }
}
