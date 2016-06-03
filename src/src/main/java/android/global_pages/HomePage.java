package android.global_pages;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class HomePage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/settingsButton")
    public MobileElement settingsButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/pattern")
    public MobileElement yourProductSearchField;
}
