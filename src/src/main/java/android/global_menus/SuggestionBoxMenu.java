package android.global_menus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SuggestionBoxMenu extends BaseMenu {

    @AndroidFindBy(id = "com.bilt.mobile:id/suggestion")
    private MobileElement suggestionTextField;

    public MobileElement getSuggestionTextField() {
        return suggestionTextField;
    }
}
