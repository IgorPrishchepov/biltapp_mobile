package android.smartphones.pages;

import android.global_pages.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/15/2016.
 */
public class MysStuffPageSmart extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/hamburgerButton")
    private MobileElement closeMyStuffButton;






    public MobileElement getCloseMyStuffButton() {
        return closeMyStuffButton;
    }
}
