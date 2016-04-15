package android.tablets.pop_up_menus;

import android.global_menus.BaseMenu;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/29/2016.
 */
public class RegistrationMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/serialNumber")
    private MobileElement serialNumberTextField;

    public MobileElement getSerialNumberTextField() {
        return serialNumberTextField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/date")
    private MobileElement dateOfPurchaseTextField;

    public MobileElement getDateOfPurchaseTextField() {
        return dateOfPurchaseTextField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/agreementBox")
    private MobileElement agreementCustomerCheckBox;

    public MobileElement getAgreementCustomerCheckBox() {
        return agreementCustomerCheckBox;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/confirmButton")
    private MobileElement registerButton;

    public MobileElement getRegisterButton() {
        return registerButton;
    }

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement dateOfPurchaseOkButton;

    public MobileElement getDateOfPurchaseOkButton() {
        return dateOfPurchaseOkButton;
    }
}
