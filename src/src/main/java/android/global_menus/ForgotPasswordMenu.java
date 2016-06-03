package android.global_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/5/2016.
 */
public class ForgotPasswordMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/submit")
    private MobileElement forgotPassSubmitButton;

    public MobileElement getForgotPassSubmitButton() {
        return forgotPassSubmitButton;
    }
}
