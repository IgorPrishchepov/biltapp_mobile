package android.smartphones.pages;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/12/2016.
 */
public class PreSettingsPageSmart extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/homeLayout")
    private MobileElement homePageMenuButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/mystuffLayout")
    private MobileElement myStuffMenuButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/settingsLayout")
    private MobileElement SettingsMenuButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/menuSignIn")
    private MobileElement signInMenuButton;

    public MobileElement getHomePageMenuButton() {
        return homePageMenuButton;
    }

    public MobileElement getMyStuffMenuButton() {
        return myStuffMenuButton;
    }

    public MobileElement getSettingsMenuButton() {
        return SettingsMenuButton;
    }
}
