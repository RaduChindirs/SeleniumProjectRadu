package Tests;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class Elements_WebTables extends ShareData {

    public HomePage homePage;
    public CommonPage commonPage;
    public WebTablePage webTablePage;

    @Test
    public void automationMethods() {

        webTablePage=new WebTablePage(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        homePage.GoToDesiredMeniu("Elements");
        commonPage.GoToDesiredSubMeniu("Web Tables");
        webTablePage.fillRegisterForm("Raduu", "Chindris", "radu1@radu5.com", "44", "3000", "IT");


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

