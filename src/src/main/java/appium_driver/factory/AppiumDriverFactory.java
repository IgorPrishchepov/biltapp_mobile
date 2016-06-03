package appium_driver.factory;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

/**
 * Created by Ihar_Pryshchepau on 6/2/2016.
 */
public interface AppiumDriverFactory {

    AppiumDriver createDriver (DesiredCapabilities caps) throws MalformedURLException;
}
