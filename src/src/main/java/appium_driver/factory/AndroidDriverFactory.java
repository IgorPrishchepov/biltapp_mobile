package appium_driver.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ihar_Pryshchepau on 6/2/2016.
 */
public class AndroidDriverFactory implements AppiumDriverFactory {

    public AppiumDriver createDriver(DesiredCapabilities caps) throws MalformedURLException {
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
}
