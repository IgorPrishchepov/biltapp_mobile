package android.smartphones.tests;

import android.global_menus.SuggestionBoxMenu;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static appium_driver.DriverManager.getElement;
import static android.smartphones.titles_and_messages.Pages.*;

/**
 * Created by Ihar_Pryshchepau on 5/20/2016.
 */
public class SettingsMenuSmartTest extends BaseTest {

    @Test(testName = "TC BILTAPPTST-468_1,2,3", enabled = true, priority = 0, description = "Settings menu: SignIn")
    public void settingsMenuSignInTest() {
        settingsManagerSmart.openSignInFromSettings();
        String result = signInMenu.getMenuTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        Assert.assertEquals(result, SIGN_IN_PAGE_NAME_SMART);
    }

    @Test(testName = "TC BILTAPPTST-469_1,2,3", enabled = true, priority = 1, description = "Settings menu: Terms of Use")
    public void settingsMenuTermsOfUseTest() {
        settingsManagerSmart.openTermsOfUseFromSettings();
        String result = widgetView.getTextViewTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        Assert.assertEquals(result, TERMS_OF_USE_PAGE_NAME);
    }

    @Test(testName = "TC BILTAPPTST-470_1,2,3", enabled = true, priority = 2, description = "Settings menu: Privacy Statement")
    public void settingsMenuPrivacyStatementTest() {
        settingsManagerSmart.openPrivacyStatementFromSettings();
        String result = widgetView.getTextViewTitle().getText();
        baseMenu.getLeftMenuCloseButton().click();
        settingsManagerSmart.goToHomePage();
        waitManager.waitElementToBeClickable(10, getElement(homePageSmart.settingsButton));
        Assert.assertEquals(result, PRIVACY_STATEMENT_PAGE_NAME);
    }

    @Test(testName = "TC BILTAPPTST-471_1,2,3,4,5", enabled = true, priority = 3, description = "Settings menu: Suggestions Box")
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

    @Test(testName = "TC BILTAPPTST-471_6", enabled = true, priority = 4, description = "Settings menu: Suggestions Box")
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
