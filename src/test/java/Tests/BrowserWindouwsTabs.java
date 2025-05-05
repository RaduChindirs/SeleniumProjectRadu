package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import HelperMethods.WindowsMethods;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindouwsTabs extends ShareData {
    public ElementsMethods elementsMethods;
    public JavaScriptMethods javaScriptMethods;
    public WindowsMethods windowsMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethod() {


        elementsMethods = new ElementsMethods(driver);
        javaScriptMethods = new JavaScriptMethods(driver);
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);
        windowsMethods = new WindowsMethods(driver);

        javaScriptMethods.javaScriptScrollPage(0, 400);

        homePage.GoToDesiredMeniu("Alerts, Frame & Windows");
        commonPage.GoToDesiredSubMeniu("Browser Windows");

        WebElement newTab = driver.findElement(By.id("tabButton"));
        elementsMethods.clickOnElements(newTab);
        // Schimba foculus seleniniumului pe nou tab
        windowsMethods.switchToOpenTabs();
        // verificare text in noul tab
        WebElement newSamplePage = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul from the new tab is " + newSamplePage.getText());
        windowsMethods.close();

       // Schimba foculus seleniniumului pe tabul initial
        windowsMethods.swithcnToMainTab();

        // Schimba foculus seleniniumului pe noul Window
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();
        windowsMethods.switchToOpenWindow();
        WebElement newWindowSamplePage = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul from the new window is " + newWindowSamplePage.getText());
        driver.close();

        // Schimba foculus seleniniumului pe window-ul initial
        windowsMethods.switchToMainWindow();

    }
}
