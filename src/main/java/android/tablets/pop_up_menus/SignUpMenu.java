package android.tablets.pop_up_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/6/2016.
 */
public class SignUpMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/fakeLogin")
    private MobileElement facebookSignUpButton;

    public MobileElement getFacebookSignUpButton() {
        return facebookSignUpButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/signUp")
    private MobileElement signUpCreateAccountButton;

    public MobileElement getSignUpCreateAccountButton() {
        return signUpCreateAccountButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/name")
    private MobileElement signUpMenuNameTextField;

    private final String SIGN_UP_FIRST_NAME_FIELD_NAME = "First Name";

    public MobileElement getSignUpMenuNameTextField() {
        return signUpMenuNameTextField;
    }
}
