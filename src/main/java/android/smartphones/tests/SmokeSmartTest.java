package android.smartphones.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static android.smartphones.titles_and_messages.Buttons.LETS_START_BUTTON_NAME;
import static android.smartphones.titles_and_messages.Buttons.SKIP_BUTTON_NAME;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class SmokeSmartTest extends BaseTest {

    @Test(testName = "TC BILTAPPTST-268", enabled = true, priority = 0, description = "Introduction page swipe")
    public void swipeIntroductionPageTest() {
        waitManager.waitElementToBeClickable(15, introductionPage.getSkipButton());
        int result = 0;
        for (int i = 0; i < 3; i++) {
            String title = introductionPage.getSkipButton().getText();
            if (title.equals(SKIP_BUTTON_NAME)) {
                result = result + 1;
            }
            userActionsManager.swipeToLeft();
        }
        Assert.assertEquals(result, 3);
    }

    @Test(testName = "TC BILTAPPTST-268", enabled = true, priority = 1, description = "Introduction page swipe")
    public void swipeIntroductionLastPageTest() {
        waitManager.waitElementToBeClickable(10, introductionPage.getLetsGetStartedButton());
        String result = introductionPage.getLetsGetStartedButton().getText();
        introductionPage.getLetsGetStartedButton().click();
        Assert.assertEquals(result, LETS_START_BUTTON_NAME);
    }


}
