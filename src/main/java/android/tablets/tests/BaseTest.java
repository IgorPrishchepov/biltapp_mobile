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
import android.tablets.pages.*;
import android.tablets.menus.RegistrationMenu;
import android.tablets.settings_service.SettingsManagerTab;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import static android.DriverManager.createAndroidDriver;
import static android.DriverManager.getDriver;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class BaseTest {

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

    @BeforeClass
    public void setupDriver() {
        try {
            createAndroidDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
