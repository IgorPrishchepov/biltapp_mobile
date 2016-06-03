package android.global_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SignInMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/login")
    private MobileElement signInButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/forgot")
    private MobileElement forgotPasswordButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/signUp")
    private MobileElement signUpButton;

    public MobileElement getSignInButton() {
        return signInButton;
    }

    public MobileElement getForgotPasswordButton() {
        return forgotPasswordButton;
    }

    public MobileElement getSignUpButton() {
        return signUpButton;
    }
}
