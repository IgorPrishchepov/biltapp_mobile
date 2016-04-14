package android.tablets.pages;

import android.global_pages.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 3/23/2016.
 */
public class SearchPage extends AbstractPage {

    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement searchProductTextField;

    public MobileElement getSearchProductTextField() {
        return searchProductTextField;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/cancelButton")
    private MobileElement cancelSearchButton;

    public MobileElement getCancelSearchButton() {
        return cancelSearchButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/allProducts")
    private MobileElement viewAllProductButton;

    public MobileElement getViewAllProductButton() {
        return viewAllProductButton;
    }

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/name")})
    private List<MobileElement> listOfAvailableItems;

    public List<MobileElement> getListOfAvailableItems() {
        return listOfAvailableItems;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/searchResult")
    private MobileElement searchResultsQuantity;

    public MobileElement getSearchResultsQuantity() {
        return searchResultsQuantity;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/container")
    private MobileElement foundItemsContainer;

    public MobileElement getFoundItemsContainer() {
        return foundItemsContainer;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/clear")
    private MobileElement clearQueryButton;

    public MobileElement getClearQueryButton() {
        return clearQueryButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/viewAll")
    private MobileElement searchResultsViewAllButton;

    public final String VIEW_ALL_PRODUCTS_BUTTON_NAME = "View all available products on Bilt";

    public MobileElement getSearchResultsViewAllButton() {
        return searchResultsViewAllButton;
    }

    @AndroidFindBys({@AndroidFindBy(className = "android.widget.TextView")})
    private List<WebElement> searchResultsTextViews;

    public List<WebElement> getSearchResultsTextViews() {
        return searchResultsTextViews;
    }

    public final String OOPS_MESSAGE = "Oops! We're not finding a product match.";
    public final String PLEASE_CHECK_MESSAGE = "Please check the product name and try again.";

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/container")})
    private List<MobileElement> listOfProductContainers;

    public List<MobileElement> getListOfProductContainers() {
        return listOfProductContainers;
    }

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/name")})
    private List<MobileElement> listOfProductNames;

    public List<MobileElement> getListOfProductNames() {
        return listOfProductNames;
    }
}
