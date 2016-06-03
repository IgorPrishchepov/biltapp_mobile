package android.tablets.settings_service;

import appium_driver.DriverManager;
import android.tablets.pages.HomePageTab;
import android.global_services.WaitManager;

import static appium_driver.DriverManager.*;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SettingsManagerTab {

    public void openMenuItem(int fingers, int x, int y, int duration) {
        DriverManager.getDriver().tap(fingers, x, y, duration);
    }

    public void openLabMode() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        for (int i = 0; i < 5; i++) {
            DriverManager.getDriver().tap(1, 40, 900, 1);
        }
    }

    public void openLicenses() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        DriverManager.getDriver().tap(1, 40, 800, 1);
    }

    public void openIntroductionPage() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        DriverManager.getDriver().tap(1, 40, 700, 1);
    }

    public void openSuggestionsBox() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        DriverManager.getDriver().tap(1, 40, 600, 1);
    }

    public void openPrivacyStatement() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        DriverManager.getDriver().tap(1, 40, 500, 1);
    }

    public void openTermsOfUse() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        DriverManager.getDriver().tap(1, 40, 400, 1);
    }

    public void openSignIn() {
        HomePageTab homePageTab = new HomePageTab();
        new WaitManager().waitElementToBeClickable(10, getElement(homePageTab.settingsButton));
        clickOnElement(homePageTab.settingsButton);
        DriverManager.getDriver().tap(1, 40, 300, 1);
    }


}
