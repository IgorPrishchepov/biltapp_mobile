package android.tablets.tests;

import android.tablets.pop_up_menus.LabsModeMenu;
import org.testng.annotations.Test;

/**
 * Created by Ihar_Pryshchepau on 4/15/2016.
 */
public class AnalyticsTest extends BaseTest {

    @Test(priority = 0, enabled = true)
    public void skipIntro() {
        waitManager.waitElementToBeClickable(15, introductionPage.getSkipButton());
        introductionPage.getSkipButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
    }

    @Test(priority = 1, enabled = false, description = "Production, default settings, analytics ON")
    public void openLicensesFiftyTimes() {
        for (int i = 0; i < 50; i++) {
            settingsManager.openLicenses();
            widgetView.getWidgetViewCloseButton().click();
        }
    }

    @Test(priority = 2, enabled = true)
    public void openLabsModeTest() {
        settingsManager.openLabMode();
        LabsModeMenu labsModeMenu = new LabsModeMenu();
        labsModeMenu.getLabsModeYesButton().click();
        homePageTab.getSettingsButton().click();
    }

    @Test(priority = 3, enabled = false, description = "Production, Labs Mode ON, analytics OFF")
    public void openPrivacyStatementFiftyTimes() {
        for (int i = 0; i < 50; i++) {
            waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
            homePageTab.getSettingsButton().click();
            settingsManager.openMenuItem(1, 40, 400, 1);
            widgetView.getWidgetViewCloseButton().click();
        }
    }

    @Test(priority = 4, enabled = true, description = "Production, Labs Mode ON, analytics ON")
    public void turnOnAnalyticsTest(){
        homePageTab.getSettingsButton().click();
        settingsManager.openMenuItem(1, 40, 800, 1);
        new LabsModeMenu().getAnalyticsCheckBox().click();
        new LabsModeMenu().getLeftMenuCloseButton().click();
    }

    @Test(priority = 3, enabled = true, description = "Production, Labs Mode ON, analytics ON")
    public void openTermsOfUsetFiftyTimes() {
        for (int i = 0; i < 50; i++) {
            waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
            homePageTab.getSettingsButton().click();
            settingsManager.openMenuItem(1, 40, 300, 1);
            widgetView.getWidgetViewCloseButton().click();
        }
    }


}
