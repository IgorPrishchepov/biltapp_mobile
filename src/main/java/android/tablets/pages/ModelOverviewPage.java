package android.tablets.pages;

import android.global_pages.AbstractPage;
import android.tablets.pop_up_menus.RegistrationMenu;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Ihar_Pryshchepau on 3/25/2016.
 */
public class ModelOverviewPage extends AbstractPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/getAssembly")
    private MobileElement getInstructionsButton;

    public MobileElement getGetInstructionsButton() {
        return getInstructionsButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/startAssembly")
    private MobileElement startAssemblyButton;

    public MobileElement getStartAssemblyButton() {
        return startAssemblyButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/productName")
    private MobileElement productNameInDetailsPage;

    public MobileElement getProductNameInDetailsPage() {
        return productNameInDetailsPage;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/back")
    private MobileElement detailsPageBackButton;

    public MobileElement getDetailsPageBackButton() {
        return detailsPageBackButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/overview")
    private MobileElement detailsPageOverviewButton;

    public MobileElement getDetailsPageOverviewButton() {
        return detailsPageOverviewButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/partsList")
    private MobileElement partsListPageButton;

    public MobileElement getPartsListPageButton() {
        return partsListPageButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/extras")
    private MobileElement extrasPageButton;

    public MobileElement getExtrasPageButton() {
        return extrasPageButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/registerButton")
    private MobileElement detailsPageRegistrationButton;

    public MobileElement getDetailsPageRegistrationButton() {
        return detailsPageRegistrationButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/sharingImg")
    private MobileElement detailsPageShareButton;

    public MobileElement getDetailsPageShareButton() {
        return detailsPageShareButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/back")
    private MobileElement backButton;

    public MobileElement getBackButton() {
        return backButton;
    }

    public RegistrationMenu openRegistrationMenu() {
        detailsPageRegistrationButton.click();
        return new RegistrationMenu();
    }

    public void openOverviewPage() {
        detailsPageOverviewButton.click();
    }

    public void openPartsListPage() {
        partsListPageButton.click();
    }

    public void openExtrasPage() {
        extrasPageButton.click();
    }


}
