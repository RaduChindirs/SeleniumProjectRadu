package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Form_PractiveForm {
    //Define variabila globala driver
    public WebDriver driver;

    @Test
    public void Forms() {
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

        WebElement formElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formElement.click();

        WebElement practiveFormField = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiveFormField.click();


       // js.executeScript("window.scrollBy(0, 400)");

        WebElement firstNameFiled = driver.findElement(By.id("firstName"));
        String firstnameValue = "Casian";
        firstNameFiled.sendKeys(firstnameValue);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Manole";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailFiled = driver.findElement(By.id("userEmail"));
        String emailValue = "radu@r.com";
        emailFiled.sendKeys(emailValue);

        WebElement mobilePhoneField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String phoneNumberValue = "343323445";
        mobilePhoneField.sendKeys(phoneNumberValue);

        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
        String file = new File("src/test/resources/Emag.png").getAbsolutePath();
        pictureElement.sendKeys(file);

        js.executeScript("window.scrollBy(0, 400)");

        WebElement maleGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femalelGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderValue = "Male";
        // if (genderValue.equals("AAAA")) ;
        // maleGenderField.click();

        if (maleGenderField.getText().equals(genderValue)) {
            maleGenderField.click();

        } else if (femalelGenderField.getText().equals(genderValue)) {
            femalelGenderField.click();

        } else if (otherGenderField.getText().equals(genderValue)) {
            otherGenderField.click();

        }

//        switch (genderValue){
//            case "Male":
//                genderValue.equals(maleField.getText());
//                maleField.click();
//                break;
//            case "Female":
//                genderValue.equals(femaleField.getText());
//                femaleField.click();
//                break;
//            case "Other":
//                genderValue.equals(otherField.getText());
//                otherField.click();
//
//        }

        WebElement subjectElement = driver.findElement(By.id("subjectsInput"));
        String subjectValue = "Social Studies";
        subjectElement.sendKeys(subjectValue);
        subjectElement.sendKeys(Keys.ENTER);

        WebElement stateElement = driver.findElement(By.id("react-select-3-input"));
        js.executeScript("arguments[0].click();", stateElement);// linie optionala
        stateElement.sendKeys("NCR");
        stateElement.sendKeys(Keys.ENTER);

        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
        js.executeScript("arguments[0].click();", cityElement);// linie optionala
        cityElement.sendKeys("Delhi");
        cityElement.sendKeys(Keys.ENTER);

    }
}
