package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptMethods javaScriptMethods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptMethods=new JavaScriptMethods(driver);
        PageFactory.initElements(driver,this);
    }

    //Indetificam WebElemente-le specifice pt pagina asta
    @FindBy(xpath = "//h5")
    List<WebElement> elements;

    // facem methode specifice pt pagina
    public void GoToDesiredMeniu( String menu) {
        javaScriptMethods.javaScriptScrollPage(0,400);
        elementsMethods.selectElementFromListByText(elements, menu);
    }
}
