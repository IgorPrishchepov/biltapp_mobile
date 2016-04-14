package android.global_pages;

import android.services.UserActionsManager;
import android.services.WaitManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class IntroductionPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/skipButton")
    private MobileElement skipButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/letsStarted")
    private MobileElement letsGetStartedButton;

    public MobileElement getSkipButton() {
        return skipButton;
    }

    public MobileElement getLetsGetStartedButton() {
        return letsGetStartedButton;
    }

    public void skipIntroPage() {
        IntroductionPage introductionPage = new IntroductionPage();
        new WaitManager().waitElementToBeClickable(15, introductionPage.getSkipButton());
        introductionPage.getSkipButton().click();
    }

    public void getToSpecificIntroPage(int pageNumber)  {
        WaitManager waitManager = new WaitManager();
        IntroductionPage introductionPageTab = new IntroductionPage();
        UserActionsManager userActionsManager = new UserActionsManager();
        waitManager.waitElementToBeClickable(15, introductionPageTab.getSkipButton());
        if (pageNumber > 0 && pageNumber < 5) {
            for (int i = 0; i < pageNumber - 1; i++) {
                userActionsManager.swipeToLeft();
            }
        } else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Page number of Introduction section must be between 1 and 4");
        }
    }
}
