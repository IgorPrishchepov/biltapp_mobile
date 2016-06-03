package android.smartphones.tests;

import android.global_services.ReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import static appium_driver.DriverManager.clickOnElement;
import static appium_driver.DriverManager.getElement;
import static android.smartphones.titles_and_messages.Pages.SIGN_IN_PAGE_NAME_SMART;


/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class SandBoxTestSmartTest extends BaseTest {

    @Test(priority = 0)
    public void skipIntro() {
        waitManager.waitElementToBeClickable(15, getElement(introductionPageSmart.skipButton));
        clickOnElement(introductionPageSmart.skipButton);
    }

    @Test(testName = "TC BILTAPPTST-468_1,2,3", enabled = true, priority = 1, description = "Settings menu: SignIn")
    public void settingsMenuSignInTest() {
        settingsManagerSmart.openSignInFromSettings();
        String result = signInMenu.getMenuTitle().getText();
        try {
            Assert.assertEquals(result, SIGN_IN_PAGE_NAME_SMART);
        } catch (AssertionError ex) {
            ReportManager.takeScreenShot("settingsMenuSignInTest");
        } finally {
            baseMenu.getLeftMenuCloseButton().click();
            settingsManagerSmart.goToHomePage();
            waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
            Assert.assertEquals(result, SIGN_IN_PAGE_NAME_SMART);
        }
    }
}
