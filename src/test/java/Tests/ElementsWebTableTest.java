package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementsWebTableTest extends ShareData {
    public ElementsMethods elementsMethods;
    public JavaScriptMethods javaScriptMethods;
    public HomePage homePage;
    public CommonPage commonPage;

    @Test
    public void automationMethods() {
        elementsMethods = new ElementsMethods(getDriver());
        javaScriptMethods = new JavaScriptMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        javaScriptMethods.javaScriptScrollPage(0, 400);
        homePage.GoToDesiredMeniu("Elements");
        commonPage.GoToDesiredSubMeniu("Web Tables");

//        List<WebElement> tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Integer actualTableSize = tableElements.size();
//
//        WebElement addField = driver.findElement(By.id("addNewRecordButton"));
//        addField.click();
//
//        //Complecteaza Register Form and Submit Form
//        WebElement firstNameField = driver.findElement(By.id("firstName"));
//        String firstNameValue = "Radu";
//        firstNameField.sendKeys(firstNameValue);
//
//        WebElement lastNameField = driver.findElement(By.id("lastName"));
//        String lastNameValue = "Chindris";
//        lastNameField.sendKeys(lastNameValue);
//
//        WebElement emailField = driver.findElement(By.id("userEmail"));
//        String emailValue = "r@r.com";
//        emailField.sendKeys(emailValue);
//
//        WebElement ageField = driver.findElement(By.id("age"));
//        String ageValue = "44";
//        ageField.sendKeys(ageValue);
//
//        WebElement salaryField = driver.findElement(By.id("salary"));
//        String salaryValue = "4512";
//        salaryField.sendKeys(salaryValue);
//
//        WebElement departmentField = driver.findElement(By.id("department"));
//        String departmentValue = "HR";
//        departmentField.sendKeys(departmentValue);
//
//        WebElement submitField = driver.findElement(By.id("submit"));
//        submitField.click();
//        //  Comparare tabel initial cu cel dupa introducere nou record
////        List<WebElement> webTableNou = driver.findElements(By.xpath("//div[@class='rt-tbody'] /div/div[@class='rt-tr -even'or@class='rt-tr -odd']"));
////        Integer sizeDupaIntroducereNouRecord = webTableNou.size();
////        System.out.println("Nr de element in tabel dupa introducere nou record este  " + sizeDupaIntroducereNouRecord);
////
////        Assert.assertTrue(actualTableSize + 1==sizeDupaIntroducereNouRecord);
//
//
////        Integer expectedTableSize = actualTableSize + 1;
////        Assert.assertEquals(tableElements.size(),expectedTableSize);
//
//        List<WebElement> expectedTableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Integer expectedTableSize = actualTableSize + 1;
//        Assert.assertEquals(expectedTableElements.size(), expectedTableSize);
//        String actualTableValue = expectedTableElements.get(3).getText();
//        Assert.assertTrue(actualTableValue.contains(lastNameValue));
//        Assert.assertTrue(actualTableValue.contains(firstNameValue));
//        Assert.assertTrue(actualTableValue.contains(emailValue));
//        Assert.assertTrue(actualTableValue.contains(ageValue));
//        Assert.assertTrue(actualTableValue.contains(salaryValue));
//        Assert.assertTrue(actualTableValue.contains(departmentValue));
    }
}

