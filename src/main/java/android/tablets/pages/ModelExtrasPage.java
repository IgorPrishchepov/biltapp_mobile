package android.tablets.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 3/29/2016.
 */
public class ModelExtrasPage extends ModelOverviewPage {

    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement extrasPageTitle;

    public MobileElement getExtrasPageTitle() {
        return extrasPageTitle;
    }

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/container")})
    private List<MobileElement> listOfWebViewContainers;

    public List<MobileElement> getListOfWebViewContainers() {
        return listOfWebViewContainers;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/arrow")
    private MobileElement extrasPageBackButton;

    public MobileElement getExtrasPageBackButton() {
        return extrasPageBackButton;
    }
}
