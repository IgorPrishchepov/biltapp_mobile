package android.tablets.pages;

import android.global_pages.HomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class HomePageTab extends HomePage {

    @AndroidFindBy(id = "com.bilt.mobile:id/existingAccount")
    private MobileElement signInButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/myStuffShow")
    private MobileElement myStuffButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/logoSearch")
    private MobileElement logoImage;

    @AndroidFindBy(id = "com.bilt.mobile:id/myStuffLbl")
    private MobileElement myStuffButtonName;

    public MobileElement getMyStuffButton() {
        return myStuffButton;
    }

    public MobileElement getSignInButton() {
        return signInButton;
    }

    public MobileElement getLogoImage() {
        return logoImage;
    }

    public MobileElement getMyStuffButtonName() {
        return myStuffButtonName;
    }
}
