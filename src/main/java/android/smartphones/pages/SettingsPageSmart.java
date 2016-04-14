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

    public MobileElement getPreSettingsMenuButton() {
        return preSettingsMenuButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/signIn")
    private MobileElement signInFromSettingsButton;

    public MobileElement getSignInFromSettingsButton() {
        return signInFromSettingsButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/introduction")
    private MobileElement introductionButton;

    public MobileElement getIntroductionButton() {
        return introductionButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/termsOfUse")
    private MobileElement termsOfUseButton;

    public MobileElement getTermsOfUseButton() {
        return termsOfUseButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/privacyPolicy")
    private MobileElement privacyStatementButton;

    public MobileElement getPrivacyStatementButton() {
        return privacyStatementButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/suggestions")
    private MobileElement suggestionsBoxButton;

    public MobileElement getSuggestionsBoxButton() {
        return suggestionsBoxButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/versionStatus")
    private MobileElement versionStatusButton;

    public MobileElement getVersionStatusButton() {
        return versionStatusButton;
    }
}
