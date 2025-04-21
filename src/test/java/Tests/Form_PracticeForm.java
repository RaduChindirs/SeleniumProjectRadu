package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Form_PracticeForm {
    //Define variabila globala driver
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public JavaScriptMethods javaScriptMethods;

    @Test
    public void Forms() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        elementsMethods = new ElementsMethods(driver);
        javaScriptMethods = new JavaScriptMethods(driver);

       javaScriptMethods.javaScriptScrollPage(0,400);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 400)");

        WebElement formElement = driver.findElement(By.xpath("//h5[text()='Forms']"));

        elementsMethods.clickOnElements(formElement);  //refactorizare si folosire de constructor din Helper Method
        //formElement.click();                         // inaite de a folosi methoda ElementsMethods

        WebElement practiveFormField = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        elementsMethods.clickOnElements(practiveFormField); //refactorizare si folosire de constructor din Helper Method
        //practiveFormField.click();                        // inaite de a folosi methoda ElementsMethods


        // js.executeScript("window.scrollBy(0, 400)");
//
        WebElement firstNameFiled = driver.findElement(By.id("firstName"));
        elementsMethods.fillElement(firstNameFiled, "Casian");
//        String firstnameValue = "Casian";
//        firstNameFiled.sendKeys(firstnameValue);
//
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        elementsMethods.fillElement(lastNameField, "Manole");
//        String lastNameValue = "Manole";
//        lastNameField.sendKeys(lastNameValue);
//
        WebElement emailFiled = driver.findElement(By.id("userEmail"));
        elementsMethods.fillElement(emailFiled, "radu@r.com");
//        String emailValue = "radu@r.com";
//        emailFiled.sendKeys(emailValue);
//
        WebElement mobilePhoneField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        elementsMethods.fillElement(mobilePhoneField, "55544444");
//        String phoneNumberValue = "3433234459";
//        mobilePhoneField.sendKeys(phoneNumberValue);
//        mobilePhoneField.sendKeys(Keys.ENTER);
//
//        WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
//        js.executeScript("arguments[0].click();", dateOfBirthField);
//        //  dateOfBirthField.click();
//
//        WebElement monthSelctorField = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//        monthSelctorField.click();
//
//        WebElement monthField = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[@value='7']"));
//        String month=monthField.getText();
//        monthField.click();
//
//        WebElement yearField = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[text()='1980']"));
//        String year= yearField.getText();
//        yearField.click();
//
//        WebElement dayField = driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, August 2nd, 1980']"));
//        String day= dayField.getText();
//        dayField.click();
//
//
//        String anNastereComplect="0"+day + " "+ month +"," + year;
//        System.out.println( anNastereComplect);
//
//
//
        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
        elementsMethods.uploadPictures(pictureElement);
//        String file = new File("src/test/resources/Emag.png").getAbsolutePath();
//        pictureElement.sendKeys(file);
//
//        js.executeScript("window.scrollBy(0, 400)");
//
//        WebElement addressField = driver.findElement(By.id("currentAddress"));
//        String addressValue = "Str Fabricii de Zahar nr 11";
//        addressField.sendKeys(addressValue);
//        addressField.sendKeys(Keys.ENTER);
//
        WebElement maleGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femalelGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        List<WebElement> genderElements = new ArrayList<>();
        genderElements.add(maleGenderField);
        genderElements.add(femalelGenderField);
        genderElements.add(otherGenderField);

        String genderValue = "Male";
        // if (genderValue.equals("AAAA")) ;
        // maleGenderField.click();

        elementsMethods.selectElementFromListByText(genderElements, "Female");

//        if (maleGenderField.getText().equals(genderValue)) {
//            maleGenderField.click();
//
//        } else if (femalelGenderField.getText().equals(genderValue)) {
//            femalelGenderField.click();
//
//        } else if (otherGenderField.getText().equals(genderValue)) {
//            otherGenderField.click();
//
//        }
//
////        switch (genderValue){
////            case "Male":
////                genderValue.equals(maleField.getText());
////                maleField.click();
////                break;
////            case "Female":
////                genderValue.equals(femaleField.getText());
////                femaleField.click();
////                break;
////            case "Other":
////                genderValue.equals(otherField.getText());
////                otherField.click();
////
////        }
//
//        WebElement subjectElement = driver.findElement(By.id("subjectsInput"));
//        String subjectValue = "Social Studies";
//        subjectElement.sendKeys(subjectValue);
//        subjectElement.sendKeys(Keys.ENTER);
//
//        WebElement sportFiled = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//        WebElement readingField = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
//        WebElement musincFiled = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
//
//        String hobbiValue = "Music";
//
//        if (sportFiled.getText().equals(hobbiValue)) {
//            sportFiled.click();
//        } else if (readingField.getText().equals(hobbiValue)) {
//            readingField.click();
//
//        } else if (musincFiled.getText().equals(hobbiValue)) {
//            musincFiled.click();
//
//        }
//
//        WebElement stateElement = driver.findElement(By.id("react-select-3-input"));
//        js.executeScript("arguments[0].click();", stateElement);// linie optionala
//        stateElement.sendKeys("NCR");
//        stateElement.sendKeys(Keys.ENTER);
//
//        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
//        js.executeScript("arguments[0].click();", cityElement);// linie optionala
//        cityElement.sendKeys("Delhi");
//        cityElement.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", submitElement);// linie optionala
//        // submitElement.click();
//
//        List<String> expectedLables = Arrays.asList("Student Name", "Student Email", "Gender", "Mobile", "Date of Birth",
//                "Subjects", "Hobbies", "Picture", "Address", "State and City");
//
//        List<String> expectedValues = Arrays.asList("Casian Manole", emailValue, "Male", phoneNumberValue, anNastereComplect,//anNastereValue   "02 August,1980"
//                "Social Studies", hobbiValue, "Emag.png", "Str Fabricii de Zahar nr 11", "NCR Delhi");
//
//        List<WebElement> labels = driver.findElements(By.xpath("//tbody/tr/td[1]"));
//        List<WebElement> valori = driver.findElements(By.xpath("//tbody/tr/td[2]"));
//        for (int i = 0; i <= 9; i++) {
//
//            WebElement coloanaLabels = labels.get(i);
//            WebElement coloanaValori = valori.get(i);
//            System.out.println("Lable: " + coloanaLabels.getText() + " = " + coloanaValori.getText());
//            Assert.assertEquals(coloanaValori.getText(), expectedValues.get(i));
//            Assert.assertEquals(coloanaLabels.getText(), expectedLables.get(i));
//
//        }
//
    }
}

