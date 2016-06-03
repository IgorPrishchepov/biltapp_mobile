package android.global_pages;

import android.global_services.UserActionsManager;
import android.global_services.WaitManager;
import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static appium_driver.DriverManager.clickOnElement;
import static appium_driver.DriverManager.getElement;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class IntroductionPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/skipButton")
    public MobileElement skipButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/letsStarted")
    public MobileElement letsGetStartedButton;

    public void skipIntroPage() {
        IntroductionPage introductionPage = new IntroductionPage();
        new WaitManager().waitElementToBeClickable(15, getElement(introductionPage.skipButton));
        clickOnElement(introductionPage.skipButton);
    }

    public void getToSpecificIntroPage(int pageNumber) {
        WaitManager waitManager = new WaitManager();
        IntroductionPage introductionPage = new IntroductionPage();
        UserActionsManager userActionsManager = new UserActionsManager();
        waitManager.waitElementToBeClickable(15, getElement(introductionPage.skipButton));
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
