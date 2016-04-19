package android.global_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class LabsModeMenu extends BaseMenu {

    @AndroidFindBy(id = "android:id/message")
    private MobileElement labsModeAgreeMenuMessage;

    @AndroidFindBy(id = "android:id/button2")
    private MobileElement labsModeNoButton;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement labsModeYesButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/loggingCheckbox")
    private MobileElement loggingCheckBox;

    @AndroidFindBy(id = "com.bilt.mobile:id/analyticsCheckbox")
    private MobileElement analyticsCheckBox;

    @AndroidFindBy(id = "com.bilt.mobile:id/urlHhost")
    private MobileElement urlTextField;

    @AndroidFindBy(id = "com.bilt.mobile:id/saveButton")
    private MobileElement saveButton;

    public MobileElement getLabsModeAgreeMenuMessage() {
        return labsModeAgreeMenuMessage;
    }

    public MobileElement getLabsModeNoButton() {
        return labsModeNoButton;
    }

    public MobileElement getLabsModeYesButton() {
        return labsModeYesButton;
    }

    public MobileElement getLoggingCheckBox() {
        return loggingCheckBox;
    }

    public MobileElement getAnalyticsCheckBox() {
        return analyticsCheckBox;
    }

    public MobileElement getUrlTextField() {
        return urlTextField;}

    public MobileElement getSaveButton() {
        return saveButton;
    }
}
