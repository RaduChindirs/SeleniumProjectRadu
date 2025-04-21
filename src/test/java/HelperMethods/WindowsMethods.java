package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowsMethods {
    WebDriver driver;

    public WindowsMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToOpenTabs (){
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
    }
// minutu 7 video 13
    public void swithcnToMainTab (){
        switchToMain();
    }
}
