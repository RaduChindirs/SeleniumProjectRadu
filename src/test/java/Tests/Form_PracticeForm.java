package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormePage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Form_PracticeForm extends ShareData {
    public HomePage homePage;
    public CommonPage commonPage;
    public PracticeFormePage practiceFormePage;

    @Test
    public void Forms() {
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormePage = new PracticeFormePage(getDriver());
        homePage.GoToDesiredMeniu("Forms");
        commonPage.GoToDesiredSubMeniu("Practice Form");
        practiceFormePage.completeFirstRegion("Radu", "Chindirs", "r@r.com", "Fabriii de Zahar nr 11", "4556777766");
        practiceFormePage.commpleteGender("Female");

//      practiceFormePage.completeSubject("Social Studies");
  //      javaScriptMethods.javaScriptScrollPage(0, 400);


        List<String> subjects = new ArrayList<>();
        subjects.add("Social Studies");
        subjects.add("Maths");
        practiceFormePage.completeSubjectWithList(subjects);


        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Music");
        hobbies.add("Reading");
        practiceFormePage.completeHobbys(hobbies);

        practiceFormePage.setDateOfBirth("July", "2023", "22");

        practiceFormePage.selectStateAndCity("NCR", "Delhi");// !!!! Nu e ok, nu e lista cu toate valorile e indentificat doar elementul



//        WebElement firstNameFiled = driver.findElement(By.id("firstName"));
//        elementsMethods.fillElement(firstNameFiled, "Casian");
//
//        WebElement lastNameField = driver.findElement(By.id("lastName"));
//        elementsMethods.fillElement(lastNameField, "Manole");
//
//        WebElement emailFiled = driver.findElement(By.id("userEmail"));
//        elementsMethods.fillElement(emailFiled, "radu@r.com");
//
//        WebElement mobilePhoneField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        elementsMethods.fillElement(mobilePhoneField, "5554446544");
//
//        WebElement addressField = driver.findElement(By.id("currentAddress"));
//        elementsMethods.fillElement(addressField, "Str Fabricii de Zahar nr 11");
//        addressField.sendKeys(Keys.ENTER);


//        WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
//        javaScriptMethods.forceClick(dateOfBirthField);
//
//        WebElement monthSelctorField = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//        elementsMethods.clickOnElements(monthSelctorField);
//
//        WebElement monthField = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[@value='7']"));
//        String month = monthField.getText();
//        elementsMethods.clickOnElements(monthField);
//        // monthField.click();
//
//        WebElement yearField = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[text()='1980']"));
//        String year = yearField.getText();
//        elementsMethods.clickOnElements(yearField);
//
//        WebElement dayField = driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, August 2nd, 1980']"));
//        String day = dayField.getText();
//        elementsMethods.clickOnElements(dayField);


//        String anNastereComplect = "0" + day + " " + month + "," + year;
//        System.out.println(anNastereComplect);

//
//        WebElement pictureElement = driver.findElement(By.id("uploadPicture"));
//        elementsMethods.uploadPictures(pictureElement);
//
//
//        List <WebElement> genderElements = driver.findElements(By.xpath("//label[@for='gender-radio-1' or @for='gender-radio-2' or @for='gender-radio-3']" ));
//        WebElement maleGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement femalelGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement otherGenderField = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
//
//        List<WebElement> genderElements = new ArrayList<>();
//        genderElements.add(maleGenderField);
//        genderElements.add(femalelGenderField);
//        genderElements.add(otherGenderField);

//        elementsMethods.selectElementFromListByText(genderElements, "Male");
//
//
//        WebElement subjectElement = driver.findElement(By.id("subjectsInput"));
//        elementsMethods.fillElement(subjectElement, "Social");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        // Step 2: Wait until the element is visible
//        wait.until(ExpectedConditions.visibilityOf(subjectElement));
//        elementsMethods.fillElement(subjectElement, Keys.ENTER);
//
//
//
//        WebElement sportFiled = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//        WebElement readingField = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
//        WebElement musicFiled = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
//
//        List<WebElement> hobbisElements = new ArrayList<>();
//        hobbisElements.add(sportFiled);
//        hobbisElements.add(readingField);
//        hobbisElements.add(musicFiled);
//
//        elementsMethods.selectElementFromListByText(hobbisElements, "Sports");
//
//
//
//        WebElement stateElement = driver.findElement(By.id("react-select-3-input"));
//        javaScriptMethods.forceClick(stateElement);
//        stateElement.sendKeys("NCR");
//        stateElement.sendKeys(Keys.ENTER);
//
//        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
//       // javaScriptMethods.javaScriptScrollPage(0, 400);
//        javaScriptMethods.forceClick(cityElement);
//        cityElement.sendKeys("Delhi");
//        cityElement.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        javaScriptMethods.forceClick(submitElement);
//
//        List<String> expectedLables = Arrays.asList("Student Name", "Student Email", "Gender", "Mobile", "Date of Birth",
//                "Subjects", "Hobbies", "Picture", "Address", "State and City");
//
//        List<String> expectedValues = Arrays.asList("Casian Manole", "radu@r.com", "Male", "5554446544", anNastereComplect,//anNastereValue   "02 August,1980"
//                "Social Studies", "Sports", "Emag.png", "Str Fabricii de Zahar nr 11", "NCR Delhi");
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

    }
}

