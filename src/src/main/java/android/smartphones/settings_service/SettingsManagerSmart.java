package android.smartphones.settings_service;

import appium_driver.DriverManager;
import android.global_menus.LabsModeMenu;
import android.global_services.WaitManager;
import android.smartphones.pages.HomePageSmart;
import android.smartphones.pages.PreSettingsPageSmart;
import android.smartphones.pages.SettingsPageSmart;

import static appium_driver.DriverManager.clickOnElement;

/**
 * Created by Ihar_Pryshchepau on 4/19/2016.
 */
public class SettingsManagerSmart {

    SettingsPageSmart settingsPageSmart = new SettingsPageSmart();
    HomePageSmart homePageSmart = new HomePageSmart();
    PreSettingsPageSmart preSettingsPageSmart = new PreSettingsPageSmart();


    public void openIntroduction() {
        openSettings();
        settingsPageSmart.getIntroductionButton().click();
    }

    public void turnOnLabsMode() {
        openSettings();
        LabsModeMenu labsModeMenu = new LabsModeMenu();
        new WaitManager().waitElementToBeClickable(10, settingsPageSmart.getVersionStatusButton());
        for (int i = 0; i < 5; i++) {
            DriverManager.getDriver().tap(1, settingsPageSmart.getVersionStatusButton(), 1);
        }
        labsModeMenu.getLabsModeYesButton().click();
    }

    public void openSignInFromSettings() {
        openSettings();
        settingsPageSmart.getSignInFromSettingsButton().click();
    }

    public void openTermsOfUseFromSettings() {
        openSettings();
        settingsPageSmart.getTermsOfUseButton().click();
    }

    public void openPrivacyStatementFromSettings() {
        openSettings();
        settingsPageSmart.getPrivacyStatementButton().click();
    }

    public void openSuggestionBox() {
        openSettings();
        settingsPageSmart.getSuggestionsBoxButton().click();
    }


    public void openSettings() {
        clickOnElement(homePageSmart.settingsButton);
        preSettingsPageSmart.getSettingsMenuButton().click();
    }

    public void goToHomePage() {
        settingsPageSmart.getPreSettingsMenuButton().click();
        preSettingsPageSmart.getHomePageMenuButton().click();
    }
}
