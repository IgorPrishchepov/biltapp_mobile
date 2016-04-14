package android.tablets.pop_up_menus;

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

    public MobileElement getLabsModeAgreeMenuMessage() {
        return labsModeAgreeMenuMessage;
    }

    public MobileElement getLabsModeNoButton() {
        return labsModeNoButton;
    }

    public MobileElement getLabsModeYesButton() {
        return labsModeYesButton;
    }
}
