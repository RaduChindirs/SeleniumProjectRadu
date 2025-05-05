package HelperMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.time.Duration;
import java.util.List;

public class ElementsMethods {
    WebDriver driver;
    Actions actions;

    public ElementsMethods(WebDriver driver) {

        this.driver = driver;
      this.actions=new Actions(driver);
    }

    public void clickOnElements(WebElement elements) {
        elements.click();

    }
    public void enterElement(WebElement element){
        element.sendKeys(Keys.ENTER);
    }

    public void fillElement(WebElement element, String value) {
        element.sendKeys(value);
    }
    public void fillElement(WebElement element, Keys value) {
        element.sendKeys(value);
    }

    public void uploadPictures(WebElement element) {
        String file = new File("src/test/resources/Emag.png").getAbsolutePath();
        element.sendKeys(file);
    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value) {
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).getText().equals(value)) {
                clickOnElements(elementsList.get(i));
                break;
            }
        }
    }

    public void selectTextFromAnElement (WebElement webElement){
        webElement.getText();
    }

    public void fillWithActions (WebElement webElement, String value){
        actions.sendKeys(value).perform();
        waitVisibilityElement(webElement);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public  void waitVisibilityElement(WebElement webElement){
        //definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public void fillMultipleValues (WebElement webElement, List<String> list){
        for (String values: list){
            webElement.sendKeys(values);
            waitVisibilityElement(webElement);
            webElement.sendKeys(Keys.ENTER);
        }
    }

    public void clickMultipleValues (List<WebElement> webElements, List<String> list){
        for (String value: list){
            for(WebElement webElement:webElements){
                if (webElement.getText().equals(value)){
                    webElement.click();
                    break;
                }
            }
        }
    }
}
