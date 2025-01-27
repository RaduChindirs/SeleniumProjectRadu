package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Elements_WebTable {
    public WebDriver driver;

    @Test

    public void automationMethods() {

        // Deschidem un browser de Chrome, o copie a browserul local
        driver = new ChromeDriver();

        // Acesam o pagina web
        driver.get("https://demoqa.com/");

        //Maximizeaza pagina web
        driver.manage().window().maximize();

        // facem un scroll; 0 si 400 coordonate
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        //Click pe Elements/ Click pe Web Table/ Open the Register Form
        WebElement elementsFields = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsFields.click();
        WebElement webTableField = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTableField.click();

        List<WebElement> tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer actualTableSize = tableElements.size();

        WebElement addField = driver.findElement(By.id("addNewRecordButton"));
        addField.click();

        //Complecteaza Register Form and Submit Form
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "Radu";
        firstNameField.sendKeys(firstNameValue);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Chindris";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String emailValue = "r@r.com";
        emailField.sendKeys(emailValue);

        WebElement ageField = driver.findElement(By.id("age"));
        String ageValue = "44";
        ageField.sendKeys(ageValue);

        WebElement salaryField = driver.findElement(By.id("salary"));
        String salaryValue = "4512";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField = driver.findElement(By.id("department"));
        String departmentValue = "HR";
        departmentField.sendKeys(departmentValue);

        WebElement submitField = driver.findElement(By.id("submit"));
        submitField.click();
     //  Comparare tabel initial cu cel dupa introducere nou record
//        List<WebElement> webTableNou = driver.findElements(By.xpath("//div[@class='rt-tbody'] /div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Integer sizeDupaIntroducereNouRecord = webTableNou.size();
//        System.out.println("Nr de element in tabel dupa introducere nou record este  " + sizeDupaIntroducereNouRecord);
//
//        Assert.assertTrue(actualTableSize + 1==sizeDupaIntroducereNouRecord);


//        Integer expectedTableSize = actualTableSize + 1;
//        Assert.assertEquals(tableElements.size(),expectedTableSize);

        List<WebElement> expectedTableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer expectedTableSize = actualTableSize + 1;
        Assert.assertEquals(expectedTableElements.size(),expectedTableSize);
        String actualTableValue=expectedTableElements.get(3).getText();
        Assert.assertTrue(actualTableValue.contains(lastNameValue));
        Assert.assertTrue(actualTableValue.contains(firstNameValue));
        Assert.assertTrue(actualTableValue.contains(emailValue));
        Assert.assertTrue(actualTableValue.contains(ageValue));
        Assert.assertTrue(actualTableValue.contains(salaryValue));
        Assert.assertTrue(actualTableValue.contains(departmentValue));
    }
}
