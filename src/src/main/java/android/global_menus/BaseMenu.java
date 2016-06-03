package android.global_menus;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class BaseMenu extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/title")
    private MobileElement menuTitle;

    @AndroidFindBy(id = "com.bilt.mobile:id/closeButton")
    private MobileElement menuCloseButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/confirmButton")
    private MobileElement confirmButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/leftCloseButton")
    private MobileElement leftMenuCloseButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/email")
    private MobileElement emailField;

    @AndroidFindBy(id = "com.bilt.mobile:id/firstName")
    private MobileElement firstNameTextField;

    @AndroidFindBy(id = "com.bilt.mobile:id/lastName")
    private MobileElement lastNameTextField;

    @AndroidFindBy(id = "com.bilt.mobile:id/password")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.bilt.mobile:id/check")
    private MobileElement agreementBILTCheckBox;

    @AndroidFindBy(id = "com.bilt.mobile:id/fakeLogin")
    private MobileElement facebookLogin;

    public MobileElement getMenuTitle() {
        return menuTitle;
    }

    public MobileElement getMenuCloseButton() {
        return menuCloseButton;
    }

    public MobileElement getConfirmButton() {
        return confirmButton;
    }

    public MobileElement getLeftMenuCloseButton() {
        return leftMenuCloseButton;
    }

    public MobileElement getEmailField() {
        return emailField;
    }

    public MobileElement getFirstNameTextField() {
        return firstNameTextField;
    }

    public MobileElement getLastNameTextField() {
        return lastNameTextField;
    }

    public MobileElement getPasswordField() {
        return passwordField;
    }

    public MobileElement getAgreementBILTCheckBox() {
        return agreementBILTCheckBox;
    }

    public MobileElement getFacebookLogin() {
        return facebookLogin;
    }
}
