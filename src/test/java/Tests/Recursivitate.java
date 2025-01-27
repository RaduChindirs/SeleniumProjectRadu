package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Recursivitate {
    public WebDriver driver;

    @Test
    public void parcurgereLista() {
        driver = new EdgeDriver();
        driver.get("https://demoqa.com/sortable");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
        List<WebElement> listaElement = driver.findElements(By.xpath("//div[@id='demo-tabpane-list']//div[@class='list-group-item list-group-item-action']"));

       // Printeaza o lista cu elemente
        for (int i = 0; i < listaElement.size() - 1; i++) {
            WebElement webElement = listaElement.get(i);
            System.out.println("Numarul elementului este:" + webElement.getText());
        }
  // Metoda predefinata
//        for (int i = 1; i < listaElement.size() - 1; i++) {
//            WebElement webElement = listaElement.get(i);
//            WebElement urmatorulElement = listaElement.get(i++);
//            System.out.println("Numarul elementului este " + webElement.getText());
//            actions.clickAndHold(webElement) //metode predefinite
//                    .moveToElement(urmatorulElement)
//                    .release()
//                    .build()
//                    .perform();
//        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//
//            e.printStackTrace();
//        }
    }

}


