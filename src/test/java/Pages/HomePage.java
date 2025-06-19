package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class HomePage extends CommonPage {
    //Indetificam WebElemente-le specifice pt pagina asta
    @FindBy(xpath = "//h5")
   private List<WebElement> elements;

    @FindBy(xpath = "//p[text()='Consent']")
   private WebElement consentElement;

//    WebDriver driver;
//    ElementsMethods elementsMethods;
//    JavaScriptMethods javaScriptMethods;

    public HomePage(WebDriver driver) {
        super(driver);
//        this.driver = driver;
//        this.elementsMethods = new ElementsMethods(driver);
//        this.javaScriptMethods=new JavaScriptMethods(driver);
        //       PageFactory.initElements(driver, this);
    }


    // facem methode specifice pt pagina
    public void GoToDesiredMeniu(String menu) {
//        try {
//            elementsMethods.clickOnElements(consentElement);
//        } catch (NoSuchElementException ignored) {
//
//        }

        javaScriptMethods.javaScriptScrollPage(0, 400);
        LoggerUtility.infoLog("The user scrolls down the page");
        elementsMethods.selectElementFromListByText(elements, menu);
        LoggerUtility.infoLog("The user selects from menu the option with the value: " + menu);
        // elementsMethods.clickOnElements(consentElement); trebuie decomentat doar in situatia cand cere acest consent cand testele automate sunt rulate
    }
}
