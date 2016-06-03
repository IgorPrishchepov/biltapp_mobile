package android.global_pages;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 4/15/2016.
 */
public class SearchPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/cancelButton")
    public MobileElement cancelSearchButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/pattern")
    public MobileElement searchProductTextField;

    @AndroidFindBy(id = "com.bilt.mobile:id/allProducts")
    public MobileElement viewAllProductButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/clear")
    public MobileElement clearQueryButton;

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/container")})
    private List<MobileElement> listOfProductContainers;

    public List<MobileElement> getListOfProductContainers() {
        return listOfProductContainers;
    }
}
