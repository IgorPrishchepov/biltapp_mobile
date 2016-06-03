package android.smartphones.pages;

import android.global_pages.SearchPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 4/15/2016.
 */
public class SearchPageSmart extends SearchPage {

    @AndroidFindBys({@AndroidFindBy(id = "com.bilt.mobile:id/nameHL")})
    private List<MobileElement> listOfAvailableItems;

    public List<MobileElement> getListOfAvailableItems() {
        return listOfAvailableItems;
    }
}
