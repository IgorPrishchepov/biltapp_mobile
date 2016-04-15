package android.tablets.pages;

import android.global_pages.SearchPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 3/23/2016.
 */
public class SearchPageTab extends SearchPage {

    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement searchProductTextField;

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/name")})
    private List<MobileElement> listOfAvailableItems;

    @AndroidFindBy(id = "com.bilt.mobile:id/searchResult")
    private MobileElement searchResultsQuantity;

    @AndroidFindBy(id = "com.bilt.mobile:id/viewAll")
    private MobileElement searchResultsViewAllButton;

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/name")})
    private List<MobileElement> listOfProductNames;

    public MobileElement getSearchProductTextField() {
        return searchProductTextField;
    }

    public List<MobileElement> getListOfAvailableItems() {
        return listOfAvailableItems;
    }

    public MobileElement getSearchResultsQuantity() {
        return searchResultsQuantity;
    }

    public final String VIEW_ALL_PRODUCTS_BUTTON_NAME = "View all available products on Bilt";

    public MobileElement getSearchResultsViewAllButton() {
        return searchResultsViewAllButton;
    }

    public final String OOPS_MESSAGE = "Oops! We're not finding a product match.";
    public final String PLEASE_CHECK_MESSAGE = "Please check the product name and try again.";

    public List<MobileElement> getListOfProductNames() {
        return listOfProductNames;
    }
}
