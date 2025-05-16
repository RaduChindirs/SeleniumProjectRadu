package Tests;

import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class AlertsFrameWindows_Alerts extends ShareData {
    public HomePage homePage;
    public CommonPage commonPage;
    public AlertsPage alertsPage;

    @Test
    public void automationMethod () {
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());
        homePage = new HomePage(getDriver());
        homePage.GoToDesiredMeniu("Alerts, Frame & Windows");
        commonPage.GoToDesiredSubMeniu("Alerts");
 //       javaScriptMethods.javaScriptScrollPage(0, 400);

        alertsPage.alertOkElements();
        alertsPage.alertDelayElements();
        alertsPage.alertConfirmElements();
       alertsPage.promtButtonElementAlert("Radu");



//
//        WebElement alertOkElements = driver.findElement(By.id("alertButton"));
//        elementsMethods.clickOnElements(alertOkElements);
//        // alertOkElements.click();
//
//     //   alertMethods.interractWithAlertsOK();
//        Alert alertOK = driver.switchTo().alert();  // ne multam cu focusul pe alerta
//        alertOK.accept();
//
//
//        WebElement alertDelayElements = driver.findElement(By.id("timerAlertButton"));
//        elementsMethods.clickOnElements(alertDelayElements);
////        alertDelayElements.click();
//
//
//        alertMethods.interrectWithDelayAlert();
        //definim un wait explicit ca sa astepte dupa alerta
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();


//        WebElement alertConfirmElements = driver.findElement(By.id("confirmButton"));
//        alertConfirmElements.click();
//        Alert alertConfirm = driver.switchTo().alert();
//        alertConfirm.dismiss();
//
//        WebElement promtButtonElement = driver.findElement(By.id("promtButton"));
//        promtButtonElement.click();
//        Alert promtButton = driver.switchTo().alert();
//        promtButton.sendKeys("Radu Chindris");
//        promtButton.accept();

    }
}
