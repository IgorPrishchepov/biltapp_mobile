package android.smartphones.pages;

import android.global_pages.HomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 4/12/2016.
 */
public class HomePageSmart extends HomePage {

    @AndroidFindBy(id = "com.bilt.mobile:id/signIn")
    private MobileElement signInButton;
}
