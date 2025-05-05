package Tests;

import Pages.BrowserWindowsPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class AlertsFrameWindows_BrowserWindouwsTabs extends ShareData {
    public HomePage homePage;
    public CommonPage commonPage;
    public BrowserWindowsPage browserWindowsPage;

    @Test
    public void automationMethod() {
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        browserWindowsPage=new BrowserWindowsPage(getDriver());
        homePage.GoToDesiredMeniu("Alerts, Frame & Windows");
        commonPage.GoToDesiredSubMeniu("Browser Windows");
        browserWindowsPage.newTab();
        browserWindowsPage.newWidows();



//        WebElement newTab = getDriver().findElement(By.id("tabButton"));
//        elementsMethods.clickOnElements(newTab);
//        // Schimba foculus seleniniumului pe nou tab
//        windowsMethods.switchToOpenTabs();
//        // verificare text in noul tab
//        WebElement newSamplePage = getDriver().findElement(By.id("sampleHeading"));
//        System.out.println("Textul from the new tab is " + newSamplePage.getText());
//        windowsMethods.close();

       // Schimba foculus seleniniumului pe tabul initial
//        windowsMethods.swithcnToMainTab();
//

//        // Schimba foculus seleniniumului pe noul Window
//        WebElement newWindow = getDriver().findElement(By.id("windowButton"));
//        newWindow.click();
//        windowsMethods.switchToOpenWindow();
//        WebElement newWindowSamplePage = getDriver().findElement(By.id("sampleHeading"));
//        System.out.println("Textul from the new window is " + newWindowSamplePage.getText());
//        getDriver().close();
//
//        // Schimba foculus seleniniumului pe window-ul initial
//        windowsMethods.switchToMainWindow();

    }
}
