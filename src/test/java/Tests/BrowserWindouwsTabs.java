package Tests;

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

public class BrowserWindouwsTabs {
    public WebDriver driver;

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
        WebElement alertFrameWindouwElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertFrameWindouwElement.click();
        WebElement alertElements = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        alertElements.click();
        WebElement newTab = driver.findElement(By.id("tabButton"));
        newTab.click();

        // Schimba foculus seleniniumului pe nou tab pt asta creeaza o lista cu toate taburile
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        // verificare text in noul tab
        WebElement newSamplePage = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul from the new tab is " + newSamplePage.getText());
        driver.close();

        driver.switchTo().window(tabList.get(0));

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();
        List<String> newWindouwList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newWindouwList.get(1));
        WebElement newWindowSamplePage = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul from the new window is " + newWindowSamplePage.getText());
        driver.close();
        driver.switchTo().window(tabList.get(0));

    }
}
