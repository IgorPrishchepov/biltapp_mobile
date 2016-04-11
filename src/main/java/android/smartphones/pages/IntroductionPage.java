package android.smartphones.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class IntroductionPage extends AbstractPage{

    @AndroidFindBy(id = "com.bilt.mobile:id/skipButton")
    private MobileElement skipButton;

    public final String SKIP_BUTTON_NAME = "Skip";

    public MobileElement getSkipButton() {
        return skipButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/letsStarted")
    private MobileElement letsGetStartedButton;

    public final String LETS_START_BUTTON_NAME = "Let's get started";

    public MobileElement getLetsGetStartedButton() {
        return letsGetStartedButton;
    }
}
