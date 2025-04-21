package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethods {
    WebDriver driver;
    JavascriptExecutor js;

    public JavaScriptMethods(WebDriver driver) {
        this.driver = driver;
        this.js=(JavascriptExecutor) driver;
    }

    public void javaScriptScrollPage (int x, int y){
     //   JavascriptExecutor js = (JavascriptExecutor) driver; //Nu mai este nevoie de linia asta pt a fost definit la nivel de clasa
        js.executeScript("window.scrollBy(" + x + ", " + y + ")");
    }
    public void forceClick (WebElement element){
     //   JavascriptExecutor js=(JavascriptExecutor) driver;//Nu mai este nevoie de linia asta pt a fost definit la nivel de clasa
        js.executeScript("arguments[0].click();", element);
    }
}
