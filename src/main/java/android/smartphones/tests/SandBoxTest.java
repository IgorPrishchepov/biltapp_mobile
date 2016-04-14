package android.smartphones.tests;

import org.testng.annotations.Test;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class SandBoxTest extends BaseTest{

    @Test(priority = 0)
    public void skipIntro(){
        waitManager.waitElementToBeClickable(15, introductionPageSmart.getSkipButton());
        introductionPageSmart.getSkipButton().click();
    }
}
