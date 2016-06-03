package android.tablets.pages;

import appium_driver.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class MyStuffPageTab extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/productView")
    private MobileElement myStuffContainer;

    @AndroidFindBy(id = "com.bilt.mobile:id/editbutton")
    private MobileElement editButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/xbutton")
    private MobileElement removeItemButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/lineone")
    private MobileElement MyStuffIsEmptyMessageOne;

    @AndroidFindBy(id = "com.bilt.mobile:id/myStuffHide")
    private MobileElement myStuffHideButton;

    @AndroidFindBy(id = "com.bilt.mobile:id/name")
    private MobileElement itemName;

    public MobileElement getMyStuffContainer() {
        return myStuffContainer;
    }

    public MobileElement getEditButton() {
        return editButton;
    }

    public MobileElement getRemoveItemButton() {
        return removeItemButton;
    }

    public MobileElement getMyStuffIsEmptyMessageOne() {
        return MyStuffIsEmptyMessageOne;
    }

    public MobileElement getMyStuffHideButton() {
        return myStuffHideButton;
    }

    public MobileElement getItemName() {
        return itemName;
    }
}
