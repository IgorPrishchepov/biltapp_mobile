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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static android.DriverManager.createAndroidDriver;
import static android.DriverManager.getDriver;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class BaseTest {

    protected IntroductionPageSmart introductionPageSmart;
    protected WaitManager waitManager;
    protected UserActionsManager userActionsManager;
    protected HomePageSmart homePageSmart;
    protected SettingsManagerSmart settingsManagerSmart;
    protected SignInMenu signInMenu;
    protected WidgetView widgetView;
    protected BaseMenu baseMenu;
    protected FillTextFieldManager fillTextFieldManager;

    @Parameters({"appPath"})
    @BeforeClass
    public void setupDriver(String appPath) {
        try {
            createAndroidDriver(appPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    @AfterClass
    public void closeDriver() {
        try {
            getDriver().quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
