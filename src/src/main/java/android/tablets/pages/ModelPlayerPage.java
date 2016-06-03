package android.tablets.pages;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/5/2016.
 */
public class ModelPlayerPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/closeImageView")
    private MobileElement closeViewerButton;

    public MobileElement getCloseViewerButton() {
        return closeViewerButton;
    }
}
