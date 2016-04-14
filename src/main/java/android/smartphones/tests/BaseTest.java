package android.smartphones.tests;

import android.services.UserActionsManager;
import android.services.WaitManager;
import android.smartphones.pages.IntroductionPageSmart;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static android.DriverManager.createAndroidDriver;
import static android.DriverManager.getDriver;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class BaseTest {

    protected IntroductionPageSmart introductionPageSmart;
    protected WaitManager waitManager;
    protected UserActionsManager userActionsManager;

    @BeforeClass
    public void setupDriver() {
        try {
            createAndroidDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
        introductionPageSmart = new IntroductionPageSmart();
        waitManager = new WaitManager();
        userActionsManager = new UserActionsManager();
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
