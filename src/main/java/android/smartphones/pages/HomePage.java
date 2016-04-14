package android.smartphones.pages;

import android.global_pages.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/12/2016.
 */
public class HomePage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/settingsButton")
    private MobileElement settingsButton;

    public MobileElement getSettingsButton() {
        return settingsButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/pattern")
    private MobileElement yourProductSearch;

    public MobileElement getYourProductSearch() {
        return yourProductSearch;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/signIn")
    private MobileElement signInButton;

    public MobileElement getSignInButton() {
        return signInButton;
    }


}
