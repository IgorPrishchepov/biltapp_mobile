package android.tablets.tests;

import android.global_menus.BaseMenu;
import android.global_menus.ForgotPasswordMenu;
import android.global_menus.SignInMenu;
import android.global_menus.SignUpMenu;
import android.global_pages.IntroductionPage;
import android.global_services.FillTextFieldManager;
import android.global_services.UserActionsManager;
import android.global_services.WaitManager;
import android.global_webviews.WidgetView;
import android.tablets.menus.RegistrationMenu;
import android.tablets.pages.*;
import android.tablets.settings_service.SettingsManagerTab;
import appium_driver.GlobalConfig;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static appium_driver.DriverManager.getDriver;
import static appium_driver.factory.IDriverTypes.IOS;
import static io.appium.java_client.remote.MobileCapabilityType.APP;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class BaseTest {

    protected DesiredCapabilities caps;
    protected IntroductionPage introductionPage;
    protected HomePageTab homePageTab;
    protected WaitManager waitManager;
    protected UserActionsManager userActionsManager;
    protected SettingsManagerTab settingsManagerTab;
    protected MyStuffPageTab myStuffPageTab;
    protected WidgetView widgetView;
    protected SignInMenu signInMenu;
    protected SearchPageTab searchPageTab;
    protected static ModelOverviewPage modelOverviewPage;
    protected static ModelExtrasPage modelExtrasPage;
    protected RegistrationMenu registrationMenu;
    protected ModelPartsListPage modelPartsListPage;
    protected ModelPlayerPage modelPlayerPage;
    protected ForgotPasswordMenu forgotPasswordMenu;
    protected SignUpMenu signUpMenu;
    protected FillTextFieldManager fillTextFieldManager;
    protected BaseMenu menu;

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
        introductionPage = new IntroductionPage();
        waitManager = new WaitManager();
        userActionsManager = new UserActionsManager();
        homePageTab = new HomePageTab();
        settingsManagerTab = new SettingsManagerTab();
        myStuffPageTab = new MyStuffPageTab();
        widgetView = new WidgetView();
        signInMenu = new SignInMenu();
        searchPageTab = new SearchPageTab();
        modelOverviewPage = new ModelOverviewPage();
        modelExtrasPage = new ModelExtrasPage();
        modelPartsListPage = new ModelPartsListPage();
        modelOverviewPage = new ModelOverviewPage();
        modelPlayerPage = new ModelPlayerPage();
        forgotPasswordMenu = new ForgotPasswordMenu();
        signUpMenu = new SignUpMenu();
        fillTextFieldManager = new FillTextFieldManager();
        menu = new BaseMenu();

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
