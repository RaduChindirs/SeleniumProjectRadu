package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Elements_CheckBox {
    public WebDriver driver;
    @Test

    public void checkBox() {
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement textBox = driver.findElement(By.xpath("//span[text()='Check Box']"));
        textBox.click();

        //button[@class='rct-collapse rct-collapse-btn']
        WebElement dropDownListHome = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
        dropDownListHome.click();

        WebElement dropDownListDesktop = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button"));
        dropDownListDesktop.click();
        WebElement selectNotes = driver.findElement(By.xpath("//span[text()='Notes']"));
        selectNotes.click();

        WebElement dropDownListDocuments = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button"));
        dropDownListDocuments.click();
        WebElement selectOffice = driver.findElement(By.xpath("//span[text()='Office']"));
        selectOffice.click();

        WebElement dropDownListDownlods = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/button"));
        dropDownListDownlods.click();
        WebElement selectWordFile = driver.findElement(By.xpath("//span[text()='Word File.doc']"));
        selectWordFile.click();
        WebElement selectExcelFile = driver.findElement(By.xpath("//span[text()='Excel File.doc']"));
        selectExcelFile.click();

    }
}
