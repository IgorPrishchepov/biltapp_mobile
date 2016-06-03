package android.global_services;

import appium_driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class WaitManager {

    private static WebDriverWait wait;

    public void waitElementToBeClickable(int timeOfWait, WebElement element) {
        wait = new WebDriverWait(DriverManager.getDriver(), timeOfWait);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementToBeVisibleByLocator(int timeOfWait, By locator) {
        wait = new WebDriverWait(DriverManager.getDriver(), timeOfWait);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitElementToBeVisible(int timeOfWait, WebElement element) {
        wait = new WebDriverWait(DriverManager.getDriver(), timeOfWait);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
