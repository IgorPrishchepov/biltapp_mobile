package android.tablets.pop_up_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SettingsMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/urlHhost")
    private MobileElement urlInputField;

    public MobileElement getUrlInputField() {
        return urlInputField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/ok")
    private MobileElement okSettingsButton;

    public MobileElement getOkSettingsButton() {
        return okSettingsButton;
    }


}
