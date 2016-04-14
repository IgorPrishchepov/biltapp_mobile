package android.tablets.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class HomePage extends AbstactPage {

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







    @AndroidFindBy(id = "com.bilt.mobile:id/myStuffShow")
    private MobileElement myStuffButton;

    public MobileElement getMyStuffButton() {
        return myStuffButton;
    }


    @AndroidFindBy(id = "com.bilt.mobile:id/existingAccount")
    private MobileElement signInButton;

    public MobileElement getSignInButton() {
        return signInButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/logoSearch")
    private MobileElement logoImage;

    public MobileElement getLogoImage() {
        return logoImage;
    }

    public void openSearchPage() {
        yourProductSearch.click();
    }

    public void openMyStuff() {
        myStuffButton.click();
    }


}
