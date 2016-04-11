package android.tablets.services;

import android.DriverManager;
import android.tablets.pages.HomePage;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SettingsManager {

    public void openLicenses() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 800, 1);
    }

    public void openSettings() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 700, 1);
    }

    public void openIntroductionPage() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 600, 1);
    }

    public void openSuggestionsBox() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 500, 1);
    }

    public void openPrivacyStatement() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 400, 1);
    }

    public void openTermsOfUse() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 300, 1);
    }

    public void openSignIn() {
        HomePage homePage = new HomePage();
        new WaitManager().waitElementToBeClickable(10, homePage.getSettingsButton());
        homePage.getSettingsButton().click();
        DriverManager.getDriver().tap(1, 40, 200, 1);
    }


}
