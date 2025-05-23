package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends CommonPage {
    //   public WebDriver driver;
//    public ElementsMethods elementsMethods;
//    public JavaScriptMethods javaScriptMethods;
    // public AlertMethods alertMethods;

//    public AlertsPage(WebDriver driver) {
//        this.elementsMethods = new ElementsMethods(driver);
//        this.driver = driver;
//        this.javaScriptMethods = new JavaScriptMethods(driver);
//        this.alertMethods=new AlertMethods(driver);
//        PageFactory.initElements(driver, this);
//    }


    @FindBy(id = "alertButton")
    private WebElement alertButton;

    @FindBy(id = "timerAlertButton")
    private WebElement alertDelayElements;

    @FindBy(id = "confirmButton")
    private WebElement alertConfirmElements;

    @FindBy(id = "promtButton")
    private WebElement promptButtonElements;


    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void alertOkElements() {
        elementsMethods.clickOnElements(alertButton);
        alertMethods.interractWithAlertsOK();
    }

    public void alertDelayElements() {
        elementsMethods.clickOnElements(alertDelayElements);
        alertMethods.interrectWithDelayAlert();
    }

    public void alertConfirmElements() {
        elementsMethods.clickOnElements(alertConfirmElements);
        alertMethods.interrectWithConfirmAlert();
    }

    public void promtButtonElementAlert(String name) {
        elementsMethods.clickOnElements(promptButtonElements);
        Alert promptButton = driver.switchTo().alert();
        promptButton.sendKeys(name);
        promptButton.accept();

    }

}
