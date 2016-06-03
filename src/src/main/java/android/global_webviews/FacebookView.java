package android.global_webviews;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/6/2016.
 */
public class FacebookView extends AbstractPage {

    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement logInFacebookButton;

    public MobileElement getLogInFacebookButton() {
        return logInFacebookButton;
    }

    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement facebookLogIn;

    public MobileElement getFacebookLogIn() {
        return facebookLogIn;
    }

    @AndroidFindBy(id = "u_0_1")
    private MobileElement facebookPassword;

    public MobileElement getFacebookPassword() {
        return facebookPassword;
    }

    @AndroidFindBy(className = "android.widget.ImageView")
    private MobileElement facebookCloseViewButton;

    public MobileElement getFacebookCloseViewButton() {
        return facebookCloseViewButton;
    }
}
