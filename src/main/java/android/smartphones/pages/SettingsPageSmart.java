package android.smartphones.pages;

import android.global_pages.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class SettingsPageSmart extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/settingsButton")
    private MobileElement preSettingsMenuButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/signIn")
    private MobileElement signInFromSettingsButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/introduction")
    private MobileElement introductionButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/termsOfUse")
    private MobileElement termsOfUseButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/privacyPolicy")
    private MobileElement privacyStatementButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/suggestions")
    private MobileElement suggestionsBoxButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/versionStatus")
    private MobileElement versionStatusButton;

    public MobileElement getPreSettingsMenuButton() {
        return preSettingsMenuButton;
    }

    public MobileElement getSignInFromSettingsButton() {
        return signInFromSettingsButton;
    }

    public MobileElement getIntroductionButton() {
        return introductionButton;
    }

    public MobileElement getTermsOfUseButton() {
        return termsOfUseButton;
    }

    public MobileElement getPrivacyStatementButton() {
        return privacyStatementButton;
    }

    public MobileElement getSuggestionsBoxButton() {
        return suggestionsBoxButton;
    }

    public MobileElement getVersionStatusButton() {
        return versionStatusButton;
    }
}
