package android.tablets.pages;

import android.services.UserActionsManager;
import android.services.WaitManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class IntroductionPage extends AbstactPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/skipButton")
    private MobileElement skipButton;

    private final String SKIP_BUTTON_NAME = "Skip";

    public MobileElement getSkipButton() {
                       return skipButton;

    }

    public void skipIntroPage() {
        IntroductionPage introductionPage = new IntroductionPage();
        new WaitManager().waitElementToBeClickable(15, introductionPage.getSkipButton());
        introductionPage.getSkipButton().click();
    }

    public void getToSpecificIntroPage(int pageNumber)  {
        WaitManager waitManager = new WaitManager();
        IntroductionPage introductionPage = new IntroductionPage();
        UserActionsManager userActionsManager = new UserActionsManager();
        waitManager.waitElementToBeClickable(15, introductionPage.getSkipButton());
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
