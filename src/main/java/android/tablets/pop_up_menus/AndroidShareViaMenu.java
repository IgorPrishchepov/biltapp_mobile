package android.tablets.pop_up_menus;

import android.global_menus.BaseMenu;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/29/2016.
 */
public class AndroidShareViaMenu extends BaseMenu {

    @AndroidFindBy(id = "android:id/title")
    private MobileElement androidShareViaMenuTitle;

    public MobileElement getAndroidShareViaMenuTitle() {
        return androidShareViaMenuTitle;
    }
}
