package appium_driver;

import appium_driver.factory.AppiumDriverFactoryManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class DriverManager {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver()  {
        if (null == driver) {
            DesiredCapabilities caps = GlobalConfig.getConfig().getCaps();
            String driverType = GlobalConfig.getConfig().getDriverType();
            AppiumDriverFactoryManager driverManager = new AppiumDriverFactoryManager();
            try {
                driver = driverManager.createDriver(driverType, caps);
            }catch (MalformedURLException e){
                e.printStackTrace();
            }
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            driver.quit();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            driver = null;
        }
    }

     public static MobileElement getElement(MobileElement element) {
        return element;
    }

    public static void clickOnElement(MobileElement element) {
        element.click();
    }

   }
