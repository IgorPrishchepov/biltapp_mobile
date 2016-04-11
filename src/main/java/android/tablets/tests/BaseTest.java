package android.tablets.tests;

import android.tablets.pages.*;
import android.tablets.pop_up_menus.*;
import android.tablets.services.FillTextFieldManager;
import android.tablets.services.SettingsManager;
import android.tablets.services.UserActionsManager;
import android.tablets.services.WaitManager;
import android.tablets.webviews.WidgetView;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static android.DriverManager.createAndroidDriver;
import static android.DriverManager.getDriver;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class BaseTest {

    protected IntroductionPage introductionPage;
    protected HomePage homePage;
    protected WaitManager waitManager;
    protected UserActionsManager userActionsManager;
    protected SettingsManager settingsManager;
    protected MyStuffPage myStuffPage;
    protected WidgetView widgetView;
    protected SignInMenu signInMenu;
    protected SearchPage searchPage;
    protected static ModelOverviewPage modelOverviewPage;
    protected static ModelExtrasPage modelExtrasPage;
    protected RegistrationMenu registrationMenu;
    protected ModelPartsListPage modelPartsListPage;
    protected ModelPlayerPage modelPlayerPage;
    protected ForgotPasswordMenu forgotPasswordMenu;
    protected SignUpMenu signUpMenu;
    protected FillTextFieldManager fillTextFieldManager;

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
        homePage = new HomePage();
        settingsManager = new SettingsManager();
        myStuffPage = new MyStuffPage();
        widgetView = new WidgetView();
        signInMenu = new SignInMenu();
        searchPage = new SearchPage();
        modelOverviewPage = new ModelOverviewPage();
        modelExtrasPage = new ModelExtrasPage();
        modelPartsListPage = new ModelPartsListPage();
        modelOverviewPage = new ModelOverviewPage();
        modelPlayerPage = new ModelPlayerPage();
        forgotPasswordMenu = new ForgotPasswordMenu();
        signUpMenu = new SignUpMenu();
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
