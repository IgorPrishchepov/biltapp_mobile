package android.tablets.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static appium_driver.DriverManager.clickOnElement;
import static appium_driver.DriverManager.getElement;

/**
 * Created by Ihar_Pryshchepau on 3/28/2016.
 */
public class CriticalPassTest extends BaseTest {

    @Test(testName = "TC BILTAPPTST-281_1", enabled = true, priority = 1, description = "Introduction page swipe back")
    public void intoductionPageSwipeBackButtonsTest() {
        for (int i = 1; i < 4; i++) {
            settingsManagerTab.openIntroductionPage();
            introductionPage.getToSpecificIntroPage(4);
            userActionsManager.swipeToRightNumberOfTimes(i);
            waitManager.waitElementToBeClickable(15, getElement(introductionPage.skipButton));
            String result = getElement(introductionPage.skipButton).getText();
            clickOnElement(introductionPage.skipButton);
            Assert.assertEquals(result, "Skip");
        }
    }
}
