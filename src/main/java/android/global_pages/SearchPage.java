package android.global_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 4/15/2016.
 */
public class SearchPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/cancelButton")
    private MobileElement cancelSearchButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/pattern")
    private MobileElement searchProductTextField;

    @AndroidFindBy(id = "com.bilt.mobile:id/allProducts")
    private MobileElement viewAllProductButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/clear")
    private MobileElement clearQueryButton;

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/container")})
    private List<MobileElement> listOfProductContainers;

    public MobileElement getCancelSearchButton() {
        return cancelSearchButton;
    }

    public MobileElement getSearchProductTextField() {
        return searchProductTextField;
    }

    public MobileElement getViewAllProductButton() {
        return viewAllProductButton;
    }

    public MobileElement getClearQueryButton() {
        return clearQueryButton;
    }

    public List<MobileElement> getListOfProductContainers() {
        return listOfProductContainers;
    }
}
