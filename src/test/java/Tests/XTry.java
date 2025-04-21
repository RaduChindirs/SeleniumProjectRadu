package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XTry {
    public WebDriver driver;

    @Test
    public void Forms() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

        WebElement formElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formElement.click();
        WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceForm.click();
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "Radu";
        firstNameField.sendKeys(firstNameValue);
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String lastnameValue = "Chindris";
        lastNameField.sendKeys(lastnameValue);
        WebElement emailField = driver.findElement(By.id("userEmail"));
        String emailValue = "radu@r.com";
        emailField.sendKeys(emailValue);

        WebElement maleField = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleField = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherField = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));


        String genderValue = "Other";
        if (maleField.getText().equals(genderValue)) {
            js.executeScript("arguments[0].click();", maleField);// linie optionala
           // maleField.click();
        } else if (femaleField.getText().equals(genderValue)) {
          //  femaleField.click();
            js.executeScript("arguments[0].click();", femaleField);// linie optionala
        } else if (otherField.getText().equals(genderValue)) {
          //  otherField.click();
            js.executeScript("arguments[0].click();", otherField);// linie optionala
        }
    }
}
