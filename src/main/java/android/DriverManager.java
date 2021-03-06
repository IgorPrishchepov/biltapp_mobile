package android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.*;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class DriverManager {

   private static final ThreadLocal<AppiumDriver> driverPool = new ThreadLocal<>();
    private static AppiumDriver driver;

    public static void createAndroidDriver(String appPath) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
      /*  caps.setCapability(PLATFORM_NAME, "Android");
        caps.setCapability(PLATFORM_VERSION, "5.0");
        caps.setCapability(DEVICE_NAME, "Device_1");
      */  caps.setCapability(APP, appPath);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driverPool.set(driver);
        driverPool.get().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static AppiumDriver getDriver() {
        return driverPool.get();
    }


}
