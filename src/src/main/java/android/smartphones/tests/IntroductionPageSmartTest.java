package android.smartphones.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static appium_driver.DriverManager.clickOnElement;
import static appium_driver.DriverManager.getElement;
import static android.smartphones.titles_and_messages.Buttons.LETS_START_BUTTON_NAME;
import static android.smartphones.titles_and_messages.Buttons.SKIP_BUTTON_NAME;

/**
 * Created by Ihar_Pryshchepau on 5/20/2016.
 */
public class IntroductionPageSmartTest extends BaseTest {

    @Test(testName = "TC BILTAPPTST-334_1,2,3,4,5,6", enabled = true, priority = 0, description = "Introduction page swipe")
    public void swipeIntroductionPageTest() {
        waitManager.waitElementToBeClickable(15, getElement(introductionPageSmart.skipButton));
        int result = 0;
        for (int i = 0; i < 3; i++) {
            String title = getElement(introductionPageSmart.skipButton).getText();
            if (title.equals(SKIP_BUTTON_NAME)) {
                result = result + 1;
            }
            userActionsManager.swipeToLeftSmarts();
        }
        Assert.assertEquals(result, 3);
    }

    @Test(testName = "TC BILTAPPTST-334_7", enabled = true, priority = 1, description = "Introduction page swipe")
    public void introductionLastPageTest() {
        waitManager.waitElementToBeClickable(10, getElement(introductionPageSmart.letsGetStartedButton));
        String result = getElement(introductionPageSmart.letsGetStartedButton).getText();
        clickOnElement(introductionPageSmart.letsGetStartedButton);
        Assert.assertEquals(result, LETS_START_BUTTON_NAME);
    }

    @Test(testName = "TC BILTAPPTST-466", enabled = true, priority = 2, description = "[Android] Introduction page buttons")
    public void intoductionPageButtonsTest() {
        for (int i = 0; i < 4; i++) {
            settingsManagerSmart.openIntroduction();
            waitManager.waitElementToBeClickable(10, getElement(introductionPageSmart.skipButton));
            userActionsManager.swipeToLeftNumberOfTimesSmart(i);
            if (i == 3) {
                waitManager.waitElementToBeClickable(10, getElement(introductionPageSmart.letsGetStartedButton));
                clickOnElement(introductionPageSmart.letsGetStartedButton);
                waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
            } else {
                clickOnElement(introductionPageSmart.skipButton);
            }
            waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        }
    }

    @Test(testName = "TC BILTAPPTST-281_1", enabled = true, priority = 3, description = "Introduction page swipe back")
    public void intoductionPageSwipeBackButtonsTest() {
        for (int i = 1; i < 4; i++) {
            settingsManagerSmart.openIntroduction();
            introductionPageSmart.getToSpecificIntroPage(4);
            userActionsManager.swipeToRightNumberOfTimes(i);
            waitManager.waitElementToBeClickable(15, getElement(introductionPageSmart.skipButton));
            String result = getElement(introductionPageSmart.skipButton).getText();
            clickOnElement(introductionPageSmart.skipButton);
            Assert.assertEquals(result, "Skip");
        }
    }
}
