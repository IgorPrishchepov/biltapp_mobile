package android.smartphones.pages;

import android.global_pages.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class IntroductionPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/skipButton")
    private MobileElement skipButton;

    public MobileElement getSkipButton() {
        return skipButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/letsStarted")
    private MobileElement letsGetStartedButton;

    public MobileElement getLetsGetStartedButton() {
        return letsGetStartedButton;
    }
}
