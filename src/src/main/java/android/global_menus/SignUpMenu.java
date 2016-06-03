package android.global_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/6/2016.
 */
public class SignUpMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/signUp")
    private MobileElement signUpCreateAccountButton;

    public MobileElement getSignUpCreateAccountButton() {
        return signUpCreateAccountButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/name")
    private MobileElement nameSignUpTextField;

    public MobileElement getNameSignUpTextField() {
        return nameSignUpTextField;
    }
}
