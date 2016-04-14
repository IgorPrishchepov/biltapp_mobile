package android.smartphones.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/12/2016.
 */
public class PreSettingsPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/homeLayout")
    private MobileElement homePageMenuButton;

    public MobileElement getHomePageMenuButton() {
        return homePageMenuButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/mystuffLayout")
    private MobileElement myStuffMenuButton;

    public MobileElement getMyStuffMenuButton() {
        return myStuffMenuButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/settingsLayout")
    private MobileElement SettingsMenuButton;

    public MobileElement getSettingsMenuButton() {
        return SettingsMenuButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/menuSignIn")
    private MobileElement signInMenuButton;

}
