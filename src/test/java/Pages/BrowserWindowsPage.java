package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class BrowserWindowsPage extends CommonPage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement tabutton;

    @FindBy(id = "sampleHeading")
    private WebElement newSamplePage;

    @FindBy(id = "windowButton")
    private WebElement windowButtonElement;

    @FindBy(id = "sampleHeading")
    private WebElement newWindowSamplePage;

    public void newTab() {
        elementsMethods.clickOnElements(tabutton);
        windowsMethods.switchToOpenTabs();
        System.out.println("Textul from the new tab is " + newSamplePage.getText());
        windowsMethods.close();
        windowsMethods.swithcnToMainTab();
    }

    public void newWidows() {
        elementsMethods.clickOnElements(windowButtonElement);
        windowsMethods.switchToOpenWindow();
        System.out.println("Textul from the new window is " + newWindowSamplePage.getText());
        driver.close();
        windowsMethods.switchToMainWindow();
    }
}
