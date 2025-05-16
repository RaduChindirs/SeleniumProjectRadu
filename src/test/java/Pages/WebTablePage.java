package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends CommonPage {
    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addTable;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "userEmail")
    private WebElement emailField;

    @FindBy(id = "age")
    private WebElement ageField;

    @FindBy(id = "salary")
    private WebElement salaryElement;

    @FindBy(id = "department")
    private WebElement departmentField;

    @FindBy(id = "submit")
    private WebElement submitField;


    public void fillRegisterForm(String firstNameValue, String lasNameValue, String emailValue, String ageValue, String salaryValue, String departmentValue) {
        javaScriptMethods.forceClick(addTable);
        //elementsMethods.clickOnElements(addTable);
        elementsMethods.clickOnElements(firstNameField);
        elementsMethods.fillElement(firstNameField, firstNameValue);
        elementsMethods.fillElement(lastNameField, lasNameValue);
        elementsMethods.fillElement(emailField, emailValue);
        elementsMethods.fillElement(ageField, ageValue);
        elementsMethods.fillElement(salaryElement, salaryValue);
        elementsMethods.fillElement(departmentField, departmentValue);
        elementsMethods.clickOnElements(submitField);
    }
}
