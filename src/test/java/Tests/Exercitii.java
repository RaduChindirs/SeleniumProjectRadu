package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Exercitii {
   public WebDriver driver;
   @Test
   public void webForm (){
       driver=new EdgeDriver();
       driver.get("https://demoqa.com/");
       driver.manage().window().maximize();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,400)");

       WebElement formFiled= driver.findElement(By.xpath("//h5[text()='Forms']"));
       formFiled.click();
       WebElement practiveFormField=driver.findElement(By.xpath("//span[text()='Practice Form']"));
       practiveFormField.click();

       js.executeScript("window.scrollBy(0,400)");

       WebElement firstNameField= driver.findElement(By.id("firstName"));
       String firstNameValue="Radu";
     firstNameField.sendKeys(firstNameValue);

     WebElement lastNameField=driver.findElement(By.id("lastName"));
     String lastNameValue="Chindris";
     lastNameField.sendKeys(lastNameValue);

     WebElement emailVField=driver.findElement(By.id("userEmail"));
     String emailValue="r.r@r.com";
     emailVField.sendKeys(emailValue);

       js.executeScript("window.scrollBy(0,400)");

     WebElement maleField=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
     WebElement femaleField=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
     WebElement otherField=driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
     String genderValue="Other";

//       if (genderValue.equals(maleField.getText())) {
//
//           maleField.click();
//       } else if (genderValue.equals(femaleField.getText())) {
//           femaleField.click();
//
//       } else if (genderValue.equals(otherField.getText())) {
//           otherField.click();
//
//       }
       switch (genderValue){
           case "Male":
               genderValue.equals(maleField.getText());
               maleField.click();
               break;
           case "Female":
               genderValue.equals(femaleField.getText());
               femaleField.click();
               break;
           case "Other":
               genderValue.equals(otherField.getText());
               otherField.click();

       }


   }
}
