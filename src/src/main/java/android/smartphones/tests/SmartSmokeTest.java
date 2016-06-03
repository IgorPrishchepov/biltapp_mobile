package android.smartphones.tests;

import android.global_menus.SuggestionBoxMenu;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static appium_driver.DriverManager.clickOnElement;
import static appium_driver.DriverManager.getElement;
import static android.smartphones.titles_and_messages.Buttons.LETS_START_BUTTON_NAME;
import static android.smartphones.titles_and_messages.Buttons.SKIP_BUTTON_NAME;
import static android.smartphones.titles_and_messages.Pages.*;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class SmartSmokeTest extends BaseTest {

    @Test(priority = 0, enabled = false)
    public void skipIntro() {
        waitManager.waitElementToBeClickable(15, getElement(introductionPageSmart.skipButton));
        clickOnElement(introductionPageSmart.skipButton);
    }

    @Test(testName = "TC BILTAPPTST-334_1,2,3,4,5,6", enabled = false, priority = 1, description = "Introduction page swipe")
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

    @Test(testName = "TC BILTAPPTST-334_7", enabled = false, priority = 2, description = "Introduction page swipe")
    public void introductionLastPageTest() {
        waitManager.waitElementToBeClickable(10, getElement(introductionPageSmart.letsGetStartedButton));
        String result = getElement(introductionPageSmart.letsGetStartedButton).getText();
        clickOnElement(introductionPageSmart.letsGetStartedButton);
        Assert.assertEquals(result, LETS_START_BUTTON_NAME);
    }

    @Test(priority = 3, enabled = false)
    public void turnOnLabsModeTest() {
        settingsManagerSmart.turnOnLabsMode();
        settingsManagerSmart.goToHomePage();
    }

    @Test(testName = "TC BILTAPPTST-466", enabled = false, priority = 4, description = "[Android] Introduction page buttons")
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

    @Test(testName = "TC BILTAPPTST-468_1,2,3", enabled = true, priority = 5, description = "Settings menu: SignIn")
    public void settingsMenuSignInTest() {
        settingsManagerSmart.openSignInFromSettings();
        String result = signInMenu.getMenuTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        Assert.assertEquals(result, SIGN_IN_PAGE_NAME_SMART);
    }

    @Test(testName = "TC BILTAPPTST-469_1,2,3", enabled = true, priority = 6, description = "Settings menu: Terms of Use")
    public void settingsMenuTermsOfUseTest() {
        settingsManagerSmart.openTermsOfUseFromSettings();
        String result = widgetView.getTextViewTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        Assert.assertEquals(result, TERMS_OF_USE_PAGE_NAME);
    }

    @Test(testName = "TC BILTAPPTST-470_1,2,3", enabled = true, priority = 7, description = "Settings menu: Privacy Statement")
    public void settingsMenuPrivacyStatementTest() {
        settingsManagerSmart.openPrivacyStatementFromSettings();
        String result = widgetView.getTextViewTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        Assert.assertEquals(result, PRIVACY_STATEMENT_PAGE_NAME);
    }

    @Test(testName = "TC BILTAPPTST-471_1,2,3,4,5", enabled = true, priority = 8, description = "Settings menu: Suggestions Box")
    public void settingsMenuSuggestionsBoxTest() {
        settingsManagerSmart.openSuggestionBox();
        fillTextFieldManager.fillTextField(new SuggestionBoxMenu().getSuggestionTextField(), "test");
        baseMenu.getConfirmButton().click();
        settingsManagerSmart.openSuggestionBox();
        String result = baseMenu.getMenuTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        Assert.assertEquals(result, SUGGESTIONS_BOX_PAGE_NAME);
    }

    @Test(testName = "TC BILTAPPTST-471_6", enabled = true, priority = 9, description = "Settings menu: Suggestions Box")
    public void settingsMenuSuggestionsBoxMessageTest() {
        settingsManagerSmart.openSuggestionBox();
        List<MobileElement> listOfTextViews = widgetView.getListOfTextViews();
        boolean result = false;
        for (MobileElement element : listOfTextViews) {
            if (element.getText().equals(SUGGESTIONS_BOX_MESSAGE)) {
                System.out.println(element.getText());
                result = true;
                break;
            }
        }
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        Assert.assertEquals(result, true);
    }

}
