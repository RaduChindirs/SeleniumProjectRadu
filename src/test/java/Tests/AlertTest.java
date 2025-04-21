package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public AlertMethods alertMethods;

    @Test
    public void automationMethod() {
        // Deschidem un browser de Chrome, o copie a browserul local
        driver = new ChromeDriver();

        // Acesam o pagina web
        driver.get("https://demoqa.com/");

        // definim un wait implicit pt un interval maxim de timp
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizeaza pagina web
        driver.manage().window().maximize();

        // facem un scroll; 0 si 400 coordonate
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        //Click pe Elements/ Click pe Web Table/ Open the Register Form

        elementsMethods = new ElementsMethods(driver);
        alertMethods = new AlertMethods(driver);

        WebElement alertFrameWindouwElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethods.clickOnElements(alertFrameWindouwElement);
        // alertFrameWindouwElement.click();

        WebElement alertElements = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementsMethods.clickOnElements(alertElements);
        //   alertElements.click();
//
        WebElement alertOkElements = driver.findElement(By.id("alertButton"));
        elementsMethods.clickOnElements(alertOkElements);
        // alertOkElements.click();

        alertMethods.interractWithAlertsOK();
//        Alert alertOK = driver.switchTo().alert();  // ne multam cu focusul pe alerta
//        alertOK.accept();


        WebElement alertDelayElements = driver.findElement(By.id("timerAlertButton"));
        elementsMethods.clickOnElements(alertDelayElements);
//        alertDelayElements.click();


        alertMethods.interrectWithDelayAlert();
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
