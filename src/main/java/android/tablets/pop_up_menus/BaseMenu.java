package android.tablets.pop_up_menus;

import android.tablets.pages.AbstactPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class BaseMenu extends AbstactPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/title")
    private MobileElement menuTitle;

    public MobileElement getMenuTitle() {
        return menuTitle;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/closeButton")
    private MobileElement menuCloseButton;

    public MobileElement getMenuCloseButton() {
        return menuCloseButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/confirmButton")
    private MobileElement confirmButton;

    public MobileElement getConfirmButton() {
        return confirmButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/leftCloseButton")
    private MobileElement leftMenuCloseButton;

    public MobileElement getLeftMenuCloseButton() {
        return leftMenuCloseButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/email")
    private MobileElement emailField;

    public MobileElement getEmailField() {
        return emailField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/firstName")
    private MobileElement firstNameTextField;

    public MobileElement getFirstNameTextField() {
        return firstNameTextField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/lastName")
    private MobileElement lastNameTextField;

    public MobileElement getLastNameTextField() {
        return lastNameTextField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/password")
    private MobileElement passwordField;

    public MobileElement getPasswordField() {
        return passwordField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/check")
    private MobileElement agreementBILTCheckBox;

    public MobileElement getAgreementBILTCheckBox() {
        return agreementBILTCheckBox;
    }
}
