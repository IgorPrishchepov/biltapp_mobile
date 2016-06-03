package appium_driver.factory;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

import static appium_driver.factory.IDriverTypes.ANDROID;
import static appium_driver.factory.IDriverTypes.IOS;

/**
 * Created by Ihar_Pryshchepau on 6/2/2016.
 */
public class AppiumDriverFactoryManager {

    public AppiumDriver createDriver (String driverType, DesiredCapabilities caps) throws MalformedURLException {
        AppiumDriverFactory appiumDriverFactory;
        switch (driverType){
            case ANDROID:
                appiumDriverFactory = new AndroidDriverFactory();
                break;
            case IOS:
                appiumDriverFactory = new IOSDriverFactory();
                break;
            default:
                throw new SessionNotCreatedException("Driver type must be set to 'android' or 'ios'");
        }
        return appiumDriverFactory.createDriver(caps);
    }
}
