package ios;

import appium_driver.DriverManager;
import appium_driver.GlobalConfig;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static appium_driver.DriverManager.getDriver;
import static appium_driver.factory.IDriverTypes.IOS;
import static io.appium.java_client.remote.MobileCapabilityType.APP;

/**
 * Created by Ihar_Pryshchepau on 6/2/2016.
 */
public class BaseTest {

    protected DesiredCapabilities caps;

    @Parameters({"driverType", "appPath", "deviceName"})
    @BeforeClass
    public void setupDriver(String driverType, String appPath, String deviceName) {
        caps = new DesiredCapabilities();
        GlobalConfig.getConfig().setDriverType(driverType);
        caps.setCapability(APP, appPath);
        if (driverType.equalsIgnoreCase(IOS)) {
            caps.setCapability("deviceName", deviceName);
        }
        GlobalConfig.getConfig().setCaps(caps);
    }

    @Test()
    public void skipIntro() throws MalformedURLException {
        DriverManager.getDriver().findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]").click();
    }

    @AfterSuite()
    public void closeDriver() {
        try {
            getDriver().quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


