package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormePage {
    public WebDriver driver;
    public ElementsMethods elementsMethods;

    public PracticeFormePage(WebDriver driver) {
        this.elementsMethods = new ElementsMethods(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    WebElement firstNameElement;

    @FindBy(id = "lastName")
    WebElement lastNameElement;

    @FindBy(id = "userEmail")
    WebElement emailElement;

    @FindBy(css = "input[placeholder='Mobile Number']")
    WebElement mobilePhoneElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement maleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement femaleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    WebElement otherGenderElement;

    @FindBy(id = "currentAddress")
    WebElement adressElement;

    @FindBy(id = "react-select-3-input")
    WebElement stateElement;

    @FindBy(id = "react-select-4-input")
    WebElement cityElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    WebElement musicHobbyElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    WebElement sportsHobbyElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    WebElement readingHobbyElement;

//    @FindBy(xpath = "//div[@id='subjectsContainer']")
//    WebElement subjectElement;

    @FindBy(id = "subjectsInput")
    WebElement subjectElement;



    public void completeFirstRegion(String firstname, String lastname, String email, String address, String mobile) {
        elementsMethods.fillElement(firstNameElement, firstname);
        elementsMethods.fillElement(lastNameElement, lastname);
        elementsMethods.fillElement(emailElement, email);
        elementsMethods.fillElement(adressElement, address);
        elementsMethods.fillElement(mobilePhoneElement, mobile);
    }

    public void commpleteGender(String gender) {
        switch (gender) {
            case "Male":
                elementsMethods.clickOnElements(maleGenderElement);
                break;
            case "Female":
                elementsMethods.clickOnElements(femaleGenderElement);
                break;
            case "Other":
                elementsMethods.clickOnElements(otherGenderElement);
                break;
        }

    }
    public void completeSubject(String subject){
        elementsMethods.clickOnElements(subjectElement);
        elementsMethods.fillWithActions(subjectElement, subject);
    }
    public void completeSubjectWithList(List<String> list){
        elementsMethods.clickOnElements(subjectElement);
        elementsMethods.fillMultipleValues(subjectElement,list);

    }

    public void completeHobbys(List<String> hobies){
        List<WebElement> hobiesElement=new ArrayList<>();
        hobiesElement.add(sportsHobbyElement);
        hobiesElement.add(musicHobbyElement);
        hobiesElement.add(readingHobbyElement);
        elementsMethods.clickMultipleValues(hobiesElement, hobies);
    }

}
