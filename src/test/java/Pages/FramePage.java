package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends CommonPage{
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "frame1")
    private WebElement frameOneElement;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingFramePage;

    @FindBy(id = "frame2")
    private WebElement frameTwoElement;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeading2FramePage;

    public void frameOane(){
        elementsMethods.clickOnElements(frameOneElement);
        framesMethods.switchToFrame(frameOneElement);
        System.out.println("Textul from the first frame is: " + sampleHeadingFramePage.getText());
        framesMethods.switchToDefoultFrame();
    }
    public void frameTwo(){
        elementsMethods.clickOnElements(frameTwoElement);
        framesMethods.switchToFrame(frameTwoElement);
        System.out.println("Textul from the second frame is: " + sampleHeading2FramePage.getText());
        framesMethods.switchToDefoultFrame();
    }
}
