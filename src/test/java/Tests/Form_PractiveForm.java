package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Form_PractiveForm {
      //Define variabila globala driver
    public WebDriver driver;

    @Test
    public  void Forms(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

        WebElement formElement=driver.findElement(By.xpath("//h5[text()='Forms']"));
        formElement.click();

        WebElement practiveFormField=driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiveFormField.click();

        WebElement firstNameFiled=driver.findElement(By.id("firstName"));
        String firstnameValue="Radu";
        firstNameFiled.sendKeys(firstnameValue);

        WebElement lastNameField=driver.findElement(By.id("lastName"));
        String lastNameValue="Chindris";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailFiled=driver.findElement(By.id("userEmail"));
        String emailValue="radu@r.com";
        emailFiled.sendKeys(emailValue);

        WebElement mobilePhoneField=driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String phoneNumberValue="343323445";
        mobilePhoneField.sendKeys(phoneNumberValue);

        WebElement pictureElement=driver.findElement(By.id("uploadPicture"));
        String file = new File("src/test/resources/Emag.png").getAbsolutePath();
        pictureElement.sendKeys(file);


    }
}
