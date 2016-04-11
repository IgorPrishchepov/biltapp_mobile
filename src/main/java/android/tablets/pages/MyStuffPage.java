package android.tablets.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class MyStuffPage extends AbstactPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/productView")
    private MobileElement myStuffContainer;

    public MobileElement getMyStuffContainer() {
        return myStuffContainer;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/editbutton")
    private MobileElement editButton;

    public MobileElement getEditButton() {
        return editButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/xbutton")
    private MobileElement removeItemButton;

    public MobileElement getRemoveItemButton() {
        return removeItemButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/lineone")
    private MobileElement MyStuffIsEmptyMessageOne;

    public MobileElement getMyStuffIsEmptyMessageOne() {
        return MyStuffIsEmptyMessageOne;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/myStuffHide")
    private MobileElement myStuffHideButton;

    public MobileElement getMyStuffHideButton() {
        return myStuffHideButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/name")
    private MobileElement itemName;

    public MobileElement getItemName() {
        return itemName;
    }
}
