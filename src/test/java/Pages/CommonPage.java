package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {
    WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptMethods javaScriptMethods;
    AlertMethods alertMethods;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.javaScriptMethods = new JavaScriptMethods(driver);
        this.alertMethods=new AlertMethods(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[@class='text']")
    private  List<WebElement> subElements;

    public void GoToDesiredSubMeniu (String subMenu){
        javaScriptMethods.javaScriptScrollPage(0,400);
        elementsMethods.selectElementFromListByText(subElements, subMenu);
        javaScriptMethods.javaScriptScrollPage(0, 400);
    }
}
