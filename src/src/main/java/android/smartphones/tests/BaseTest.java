package android.smartphones.tests;

import android.global_menus.BaseMenu;
import android.global_menus.SignInMenu;
import android.global_services.FillTextFieldManager;
import android.global_services.UserActionsManager;
import android.global_services.WaitManager;
import android.global_webviews.WidgetView;
import android.smartphones.pages.HomePageSmart;
import android.smartphones.pages.IntroductionPageSmart;
import android.smartphones.settings_service.SettingsManagerSmart;
import appium_driver.GlobalConfig;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static appium_driver.DriverManager.getDriver;
import static appium_driver.factory.IDriverTypes.IOS;
import static io.appium.java_client.remote.MobileCapabilityType.APP;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class BaseTest {

    protected DesiredCapabilities caps;
    protected IntroductionPageSmart introductionPageSmart;
    protected WaitManager waitManager;
    protected UserActionsManager userActionsManager;
    protected HomePageSmart homePageSmart;
    protected SettingsManagerSmart settingsManagerSmart;
    protected SignInMenu signInMenu;
    protected WidgetView widgetView;
    protected BaseMenu baseMenu;
    protected FillTextFieldManager fillTextFieldManager;

    @Parameters({"driverType", "appPath", "deviceName"})
    @BeforeClass
    public void setupDriver(String driverType, String appPath, String deviceName) {
        caps = new DesiredCapabilities();
        GlobalConfig.getConfig().setDriverType(driverType);
        caps.setCapability(APP, appPath);
        if(driverType.equalsIgnoreCase(IOS)){
            caps.setCapability("deviceName", deviceName);
        }
        GlobalConfig.getConfig().setCaps(caps);
        introductionPageSmart = new IntroductionPageSmart();
        waitManager = new WaitManager();
        userActionsManager = new UserActionsManager();
        homePageSmart = new HomePageSmart();
        settingsManagerSmart = new SettingsManagerSmart();
        signInMenu = new SignInMenu();
        widgetView = new WidgetView();
        baseMenu = new BaseMenu();
        fillTextFieldManager = new FillTextFieldManager();
    }

    @AfterSuite
    public void closeDriver() {
        try {
            getDriver().quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
