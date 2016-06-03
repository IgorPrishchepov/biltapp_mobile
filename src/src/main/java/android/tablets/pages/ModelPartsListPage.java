package android.tablets.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 3/29/2016.
 */
public class ModelPartsListPage extends ModelOverviewPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/partsListTitle")
    private MobileElement partsListPageTitle;

    public MobileElement getPartsListPageTitle() {
        return partsListPageTitle;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/label")
    private MobileElement emptyPartsListPageMessage;

    public MobileElement getEmptyPartsListPageMessage() {
        return emptyPartsListPageMessage;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/action")
    private MobileElement getInstructionsPartsListButton;

    public MobileElement getGetInstructionsPartsListButton() {
        return getInstructionsPartsListButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/arrow")
    private MobileElement partsListPageBackButton;

    public MobileElement getPartsListPageBackButton() {
        return partsListPageBackButton;
    }

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/viewFlipper")})
    private List<MobileElement> partsList;

    public List<MobileElement> getPartsList() {
        return partsList;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/missingParts")
    private MobileElement missingPartsInfoButton;

    public MobileElement getMissingPartsInfoButton() {
        return missingPartsInfoButton;
    }

    @AndroidFindBy(id = "android.widget.LinearLayout")
    private MobileElement servicePhonePopUp;

    public MobileElement getServicePhonePopUp() {
        return servicePhonePopUp;
    }
}
