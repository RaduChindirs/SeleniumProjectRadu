package HelperMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class ElementsMethods {
    WebDriver driver;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElements(WebElement elements) {
        elements.click();

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
}
