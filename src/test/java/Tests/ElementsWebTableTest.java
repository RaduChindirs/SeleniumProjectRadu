package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementsWebTableTest {
    public WebDriver driver;
    @Test

    public void automationMethods(){

             // Deschidem un browser de Chrome, o copie a browserul local
        driver=new ChromeDriver();

            // Acesam o pagina web
        driver.get("https://demoqa.com/");

            //Maximizeaza pagina web
        driver.manage().window().maximize();

            // facem un scroll; 0 si 400 coordonate
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

           //Click pe Elements/ Click pe Web Table/ Open the Register Form
        WebElement elementsFields=driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsFields.click();
        WebElement webTableField=driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTableField.click();
        WebElement addField=driver.findElement(By.id("addNewRecordButton"));
        addField.click();

           //Complecteaza Register Form and Submit Form
        WebElement firstNameField=driver.findElement(By.id("firstName"));
        String firstNameValue="Radu";
        firstNameField.sendKeys(firstNameValue);

        WebElement lastNameField=driver.findElement(By.id("lastName"));
        String lastNameValue="Chindris";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailField=driver.findElement(By.id("userEmail"));
        String emailValue="r@r.com";
        emailField.sendKeys(emailValue);

        WebElement ageField=driver.findElement(By.id("age"));
        String ageValue="44";
        ageField.sendKeys(ageValue);

        WebElement salaryField=driver.findElement(By.id("salary"));
        String salaryValue="4512";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField=driver.findElement(By.id("department"));
        String departmentValue="HR";
        departmentField.sendKeys(departmentValue);

        WebElement submitField=driver.findElement(By.id("submit"));
        submitField.click();


    }
}
