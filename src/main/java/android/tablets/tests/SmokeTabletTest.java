package android.tablets.tests;

import android.DriverManager;
import android.tablets.pop_up_menus.AndroidShareViaMenu;
import android.tablets.pop_up_menus.SuggestionBoxMenu;
import android.global_webviews.FacebookView;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SmokeTabletTest extends BaseTest {

    private int elementIndex = 0;
    private List<MobileElement> listOfAllProducts = null;


    @Test(priority = 0, enabled = false)
    public void skipIntro() {
        waitManager.waitElementToBeClickable(15, introductionPage.getSkipButton());
        introductionPage.getSkipButton().click();
    }

    @Test(testName = "TC BILTAPPTST-268", enabled = true, priority = 0, description = "Introduction page swipe")
    public void swipeIntroductionPageTest() {
        waitManager.waitElementToBeClickable(15, introductionPage.getSkipButton());
        int result = 0;
        for (int i = 0; i < 3; i++) {
            String title = introductionPage.getSkipButton().getText();
            if (title.equals("Skip")) {
                result = result + 1;
            }
            waitManager.waitElementToBeClickable(40, introductionPage.getSkipButton());
            userActionsManager.swipeToLeft();
        }
        Assert.assertEquals(result, 3);
    }

    @Test(testName = "TC BILTAPPTST-268", enabled = true, priority = 1, description = "Introduction page swipe")
    public void swipeIntroductionLastPageTest() {
        String result = introductionPage.getSkipButton().getText();
        userActionsManager.swipeToLeft();
        waitManager.waitElementToBeClickable(60, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "Let's get started");
    }

    @Test(testName = "TC BILTAPPTST-269", enabled = true, priority = 2, description = "Introduction page buttons")
    public void intoductionPageButtonsTest() {
        for (int i = 0; i < 4; i++) {
            settingsManager.openIntroductionPage();
            waitManager.waitElementToBeClickable(10, introductionPage.getSkipButton());
            userActionsManager.swipeToLeftNumberOfTimes(i);
            introductionPage.getSkipButton().click();
            waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        }
    }

    @Test(testName = "TC BILTAPPTST-270", enabled = true, priority = 3, description = "Settings menu: Licenses")
    public void settingsMenuLicensesTest() {
        settingsManager.openLicenses();
        String result = widgetView.getTextViewTitle().getText();
        widgetView.getWidgetViewCloseButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "Licenses");
    }

    @Test(testName = "TC BILTAPPTST-272", enabled = true, priority = 4, description = "Settings menu: Suggestions Box")
    public void settingsMenuSuggestionsBoxTest() {
        settingsManager.openSuggestionsBox();
        SuggestionBoxMenu suggestionBoxMenu = new SuggestionBoxMenu();
        fillTextFieldManager.fillTextField(suggestionBoxMenu.getSuggestionTextField(), "text");
        try {
            suggestionBoxMenu.getConfirmButton().click();
        } catch (NoSuchElementException ex) {
            suggestionBoxMenu.getConfirmButton().click();
            ex.printStackTrace();
        }
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        settingsManager.openSuggestionsBox();
        String result = suggestionBoxMenu.getMenuTitle().getText();
        suggestionBoxMenu.getMenuCloseButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "Suggestions Box");
    }

    @Test(testName = "TC BILTAPPTST-273", enabled = true, priority = 6, description = "Settings menu: Privacy Statement")
    public void settingsMenuPrivacyStatementTest() {
        settingsManager.openPrivacyStatement();
        String result = widgetView.getTextViewTitle().getText();
        widgetView.getWidgetViewCloseButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "Privacy Statement");
    }

    @Test(testName = "TC BILTAPPTST-274", enabled = true, priority = 7, description = "Settings menu: Terms of Use")
    public void settingsMenuTermsOfUseTest() {
        settingsManager.openTermsOfUse();
        String result = widgetView.getTextViewTitle().getText();
        widgetView.getWidgetViewCloseButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "Terms of Use");
    }

    @Test(testName = "TC BILTAPPTST-275", enabled = true, priority = 8, description = "Settings menu: SignIn")
    public void settingsMenuSignInTest() {
        settingsManager.openSignIn();
        String result = signInMenu.getMenuTitle().getText();
        signInMenu.getMenuCloseButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "BILT Sign-In");
    }

    @Test(testName = "TC BILTAPPTST-276", enabled = true, priority = 9, description = "My Stuff section: first open")
    public void myStuffIsEmptyTest() {
        homePageTab.getMyStuffButton().click();
        String result = myStuffPageTab.getMyStuffIsEmptyMessageOne().getText();
        waitManager.waitElementToBeClickable(10, myStuffPageTab.getMyStuffHideButton());
        myStuffPageTab.getMyStuffHideButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, "Nothing to see here... yet.");
    }

    @Test(testName = "TC BILTAPPTST-277", enabled = true, priority = 10, description = "Search: search field edit")
    public void searchFieldTitleTest() {
        homePageTab.getYourProductSearchField().click();
        String result = searchPageTab.getSearchProductTextField().getText();
        Assert.assertEquals(result, "Your Product");

    }

    @Test(testName = "TC BILTAPPTST-277", enabled = true, priority = 11, description = "Search: search field edit")
    public void searchFieldEditQueryTest() {
        searchPageTab.getSearchProductTextField().sendKeys("test");
        waitManager.waitElementToBeClickable(10, searchPageTab.getClearQueryButton());
        searchPageTab.getClearQueryButton().click();
        waitManager.waitElementToBeClickable(10, searchPageTab.getViewAllProductButton());
        String result = searchPageTab.getViewAllProductButton().getText();
        Assert.assertEquals(result, "View all available products");
    }

    @Test(testName = "TC BILTAPPTST-277", enabled = true, priority = 12, description = "Search: search field edit")
    public void searchFieldCancelTest() {
        searchPageTab.getCancelSearchButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
    }

    @Test(testName = "TC BILTAPPTST-278_1,2", enabled = true, priority = 13, dataProvider = "Values for TC BILTAPPTST-278",
            description = "Search: search results message")
    public void searchFieldNumberOfSearchResultsTest(String query, String resultNumber) {
        homePageTab.getYourProductSearchField().click();
        searchPageTab.getSearchProductTextField().sendKeys(query);
        waitManager.waitElementToBeVisible(20, searchPageTab.getSearchResultsQuantity());
        String result = searchPageTab.getSearchResultsQuantity().getText();
        searchPageTab.getClearQueryButton().click();
        searchPageTab.getCancelSearchButton().click();
        Assert.assertEquals(result, resultNumber);
    }

    @DataProvider(name = "Values for TC BILTAPPTST-278")
    public Object[][] messagesForSearchResults() {
        return new Object[][]{
                {"test", "0 search results"},
                {"nexera", "1 search results"},
        };
    }

    @Test(testName = "TC BILTAPPTST-278_3", enabled = true, priority = 14, description = "Search: search products")
    public void searchFieldCancelNumberOfResultsTest() {
        homePageTab.getYourProductSearchField().click();
        boolean result = true;
        try {
            searchPageTab.getSearchResultsQuantity().getText();
        } catch (NoSuchElementException e) {
            result = false;
        }
        searchPageTab.getCancelSearchButton().click();
        Assert.assertEquals(result, false);
    }

    @Test(testName = "TC BILTAPPTST-279_1", enabled = true, priority = 15, dataProvider = "Values for TC BILTAPPTST-279",
            description = "Search: search product")
    public void searchProductsAutoSubmitTest(String query) {
        homePageTab.getYourProductSearchField().click();
        searchPageTab.getSearchProductTextField().sendKeys(query);
        DriverManager.getDriver().hideKeyboard();
        waitManager.waitElementToBeVisible(20, searchPageTab.getSearchResultsQuantity());
        boolean result = false;
        List<MobileElement> products = searchPageTab.getListOfProductNames();
        for (MobileElement element : products) {
            if (element.getText().contains(query)) {
                result = true;
            }
        }
        searchPageTab.getCancelSearchButton().click();
        Assert.assertEquals(result, true);
    }

    @Test(testName = "Precondition to TC BILTAPPTST-279_2", enabled = true, priority = 16)
    public void openSearchPage() {
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        homePageTab.getYourProductSearchField().click();
    }

    @Test(testName = "TC BILTAPPTST-279_2", enabled = true, priority = 17, dataProvider = "Values for TC BILTAPPTST-279",
            description = "Search: search product")
    public void searchProductsManualSubmitTest(String query) {
        searchPageTab.getSearchProductTextField().sendKeys(query);
        DriverManager.getDriver().hideKeyboard();
        waitManager.waitElementToBeVisible(20, searchPageTab.getSearchResultsQuantity());
        boolean result = false;
        List<MobileElement> products = searchPageTab.getListOfProductNames();
        for (MobileElement element : products) {
            if (element.getText().contains(query)) {
                result = true;
            }
        }
        searchPageTab.getClearQueryButton().click();
        Assert.assertEquals(result, true);
    }

    @DataProvider(name = "Values for TC BILTAPPTST-279")
    public Object[][] queriesForSearchProducts() {
        return new Object[][]{
                {"Nexera"},
                {"ACME"},
                {"Char"},
                {"SRAM"},
                {"Suncor"},
        };
    }

    @Test(testName = "TC BILTAPPTST-280_1,2,3,4", enabled = true, priority = 18, description = "Product: Details page")
    public void openDetailsPageOfAnyProduct() throws InterruptedException {
        searchPageTab.getCancelSearchButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        homePageTab.getYourProductSearchField().click();
        searchPageTab.getViewAllProductButton().click();
        waitManager.waitElementToBeVisible(20, searchPageTab.getSearchResultsQuantity());
        listOfAllProducts = new ArrayList<>(searchPageTab.getListOfProductContainers());
        Random random = new Random(System.currentTimeMillis());
        elementIndex = random.nextInt(listOfAllProducts.size());
        listOfAllProducts.get(elementIndex).click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        modelOverviewPage.getDetailsPageBackButton().click();
        listOfAllProducts.get(elementIndex).click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        modelOverviewPage.openExtrasPage();
        modelExtrasPage.getExtrasPageBackButton().click();
        listOfAllProducts.get(elementIndex).click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        modelOverviewPage.openPartsListPage();
        modelPartsListPage.getPartsListPageBackButton().click();
        listOfAllProducts.get(elementIndex).click();
    }

    @Test(testName = "TC BILTAPPTST-281_1,2", enabled = true, priority = 19, description = "Product: Overview page Registration")
    public void registrationProductMenuTest() {
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        registrationMenu = modelOverviewPage.openRegistrationMenu();
        String result = registrationMenu.getMenuTitle().getText();
        Assert.assertEquals(result, "Product Registration");
    }

    @Test(testName = "TC BILTAPPTST-281_3", enabled = true, priority = 20, description = "Product: Overview page Registration")
    public void registrationProductRegisterDisabledTest() {
        boolean result = registrationMenu.getRegisterButton().isEnabled();
        Assert.assertEquals(result, false);
    }

    @Test(testName = "TC BILTAPPTST-281_4,5", enabled = true, priority = 21, description = "Product: Overview page Registration")
    public void registrationProductRegisterEnabledTest() {
        registrationMenu.getFirstNameTextField().sendKeys("test");
        registrationMenu.getLastNameTextField().sendKeys("test");
        try {
            DriverManager.getDriver().hideKeyboard();
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        registrationMenu.getEmailField().sendKeys("t@m.ru");
        registrationMenu.getSerialNumberTextField().sendKeys("test");
        registrationMenu.getDateOfPurchaseTextField().click();
        registrationMenu.getDateOfPurchaseOkButton().click();
        registrationMenu.getAgreementBILTCheckBox().click();
        registrationMenu.getAgreementCustomerCheckBox().click();
        boolean result = registrationMenu.getRegisterButton().isEnabled();
        registrationMenu.getMenuCloseButton().click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-282_1", enabled = true, priority = 22, description = "Product: Overview page Registration")
    public void shareViaFromDetailsPageTest() {
        modelOverviewPage.getDetailsPageShareButton().click();
        AndroidShareViaMenu androidShareViaMenu = new AndroidShareViaMenu();
        String result = androidShareViaMenu.getAndroidShareViaMenuTitle().getText();
        userActionsManager.swipeToLeft();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        Assert.assertEquals(result, "Share via");
    }

    @Test(testName = "TC BILTAPPTST-282_1", enabled = true, priority = 23, description = "Product: Overview page Registration")
    public void openExtrasFromDetailsPageTest() {
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        modelOverviewPage.openExtrasPage();
        waitManager.waitElementToBeClickable(20, modelExtrasPage.getExtrasPageButton());
        String result = modelExtrasPage.getExtrasPageTitle().getText();
        Assert.assertEquals(result, "Extras:");
    }

    @Test(testName = "TC BILTAPPTST-282_2", enabled = true, priority = 24, description = "Product: Overview page Registration")
    public void openWarningsWebViewFromExtrasPageTest() {
        boolean result = false;
        List<MobileElement> listOfContainers = new ArrayList<>(modelExtrasPage.getListOfWebViewContainers());
        for (MobileElement element : listOfContainers) {
            element.click();
            waitManager.waitElementToBeVisible(20, widgetView.getTextViewTitle());
            if (widgetView.getTextViewTitle().getText().equals("Warnings and Disclaimers")) {
                result = true;
                widgetView.getWidgetViewCloseButton().click();
                break;
            } else {
                widgetView.getWidgetViewCloseButton().click();
            }
        }
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-282_3", enabled = true, priority = 25, description = "Product: Overview page Registration")
    public void openWarrantyWebViewFromExtrasPageTest() {
        boolean result = false;
        List<MobileElement> listOfContainers = new ArrayList<>(modelExtrasPage.getListOfWebViewContainers());
        for (MobileElement element : listOfContainers) {
            element.click();
            waitManager.waitElementToBeVisible(20, widgetView.getTextViewTitle());
            if (widgetView.getTextViewTitle().getText().equals("Warranty")) {
                result = true;
                widgetView.getWidgetViewCloseButton().click();
                break;
            } else {
                widgetView.getWidgetViewCloseButton().click();
            }

        }
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-282_4,5", enabled = true, priority = 26, description = "Product: Overview page Registration")
    public void openOverviewAndPartsListPagesFromExtrasPageTest() {
        modelExtrasPage.openOverviewPage();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        modelOverviewPage.getDetailsPageShareButton().click();
        userActionsManager.swipeToLeft();
        modelOverviewPage.openExtrasPage();
        modelExtrasPage.openPartsListPage();
        try {
            widgetView.getWidgetViewCloseButton().click();
        } catch (java.util.NoSuchElementException ignore) {
        }
        modelExtrasPage.openPartsListPage();
    }

    @Test(testName = "TC BILTAPPTST-286_1", enabled = true, priority = 27, description = "Product: Overview page Registration")
    public void openPartsListPageFromOverviewPageTest() {
        modelPartsListPage.openOverviewPage();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        modelOverviewPage.getDetailsPageShareButton().click();
        userActionsManager.swipeToLeft();
        modelOverviewPage.getPartsListPageButton().click();
        waitManager.waitElementToBeClickable(20, modelPartsListPage.getPartsListPageBackButton());
        String result = modelPartsListPage.getPartsListPageTitle().getText();
        Assert.assertEquals(result, "Parts List:");
    }

    @Test(testName = "TC BILTAPPTST-286_2,3", enabled = true, priority = 28, description = "Product: Overview page Registration")
    public void partsListPageContentTest() {
        waitManager.waitElementToBeClickable(10, modelPartsListPage.getGetInstructionsPartsListButton());
        String result = modelPartsListPage.getEmptyPartsListPageMessage().getText();
        Assert.assertEquals(result, "The parts list comes packaged with the instructions.");
    }

    @Test(testName = "TC BILTAPPTST-292_1,2,3", enabled = true, priority = 29, description = "Product: Download model")
    public void partsListPageGetInstructionsTest() {
        modelPartsListPage.getGetInstructionsPartsListButton().click();
        waitManager.waitElementToBeClickable(90, modelOverviewPage.getStartAssemblyButton());
        modelOverviewPage.openPartsListPage();
        boolean result = false;
        if (modelPartsListPage.getPartsList().size() > 0) {
            result = true;
        }
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-292_4", enabled = true, priority = 30, description = "Product: Download model")
    public void partsListPageMisingPartsTitleTest() {
        String result = modelPartsListPage.getMissingPartsInfoButton().getText();
        Assert.assertEquals(result, "Missing or broken parts?");
    }


    @Test(testName = "TC BILTAPPTST-292_4", enabled = true, priority = 31, description = "Product: Download model")
    public void partsListPageMisingPartsTest() throws InterruptedException {
        modelPartsListPage.getMissingPartsInfoButton().click();
        waitManager.waitElementToBeVisibleByLocator(10, By.id("com.bilt.mobile:id/callAt"));
        boolean result = DriverManager.getDriver().findElement(By.id("com.bilt.mobile:id/callAt")).isEnabled();
        DriverManager.getDriver().navigate().back();
        Thread.sleep(5000);
        modelPartsListPage.openOverviewPage();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-292_4", enabled = true, priority = 32, description = "Product: Download model")
    public void startAssemblyTest() {
        modelOverviewPage.getBackButton().click();
        waitManager.waitElementToBeClickable(10, searchPageTab.getViewAllProductButton());
        listOfAllProducts.get(elementIndex).click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
    }

    @Test(testName = "TC BILTAPPTST-294", enabled = true, priority = 33, description = "Product: Download model")
    public void extrasPageModelTest() {
        modelOverviewPage.openExtrasPage();
        waitManager.waitElementToBeClickable(20, modelExtrasPage.getExtrasPageButton());
        List<MobileElement> listOfContainers = new ArrayList<>(modelExtrasPage.getListOfWebViewContainers());
        for (MobileElement element : listOfContainers) {
            element.click();
            waitManager.waitElementToBeVisible(20, widgetView.getTextViewTitle());
            if (widgetView.getTextViewTitle().getText().equals("Warnings and Disclaimers")) {
                try {
                    widgetView.getImageViewBody();
                } catch (NoSuchElementException ex) {
                    ex.printStackTrace();
                } finally {
                    widgetView.getWidgetViewCloseButton().click();
                }
                break;
            } else {
                widgetView.getWidgetViewCloseButton().click();
            }
        }
    }

    @Test(testName = "TC BILTAPPTST-295_1", enabled = true, priority = 34, description = "Product: MyStuff")
    public void myStuffTest() {
        modelExtrasPage.openOverviewPage();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
        String productNameInDetailsPage = modelOverviewPage.getProductNameInDetailsPage().getText();
        modelOverviewPage.getBackButton().click();
        waitManager.waitElementToBeClickable(10, searchPageTab.getCancelSearchButton());
        searchPageTab.getCancelSearchButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        homePageTab.getMyStuffButton().click();
        DriverManager.getDriver().scrollTo(productNameInDetailsPage);
        DriverManager.getDriver().tap(1, myStuffPageTab.getItemName(), 1);
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
        String result = modelOverviewPage.getProductNameInDetailsPage().getText();
        Assert.assertEquals(productNameInDetailsPage, result);
    }

    @Test(testName = "TC BILTAPPTST-296_1", enabled = true, priority = 35, description = "Product: Assembly")
    public void startAssemblyWarningsTest() {
        modelOverviewPage.getStartAssemblyButton().click();
        waitManager.waitElementToBeVisible(20, widgetView.getTextViewTitle());
        String result = widgetView.getTextViewTitle().getText();
        widgetView.getWidgetViewCloseButton().click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
        Assert.assertEquals(result, "Warnings and Disclaimers");
    }

    @Test(testName = "TC BILTAPPTST-296_2_3_4", enabled = true, priority = 36, description = "Product: Assembly")
    public void assemblyPlayingTest() {
        modelOverviewPage.getStartAssemblyButton().click();
        waitManager.waitElementToBeVisible(20, widgetView.getTextViewTitle());
        widgetView.getContinueAssemblyButton().click();
        waitManager.waitElementToBeClickable(10, modelPlayerPage.getCloseViewerButton());
        modelPlayerPage.getCloseViewerButton().click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
        modelOverviewPage.getStartAssemblyButton().click();
        waitManager.waitElementToBeClickable(10, modelPlayerPage.getCloseViewerButton());
        modelPlayerPage.getCloseViewerButton().click();
        try {
            waitManager.waitElementToBeClickable(20, modelOverviewPage.getStartAssemblyButton());
        } catch (NoSuchElementException ex) {
            modelPlayerPage.getCloseViewerButton().click();
        }
    }

    @Test(testName = "TC BILTAPPTST-297_1", enabled = true, priority = 37, description = "[Android]Product:My Stuff remove model")
    public void myStuffRemoveTest() {
        modelOverviewPage.getBackButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        homePageTab.getMyStuffButton().click();
        myStuffPageTab.getEditButton().click();
        myStuffPageTab.getRemoveItemButton().click();
    }

    @Test(testName = "TC BILTAPPTST-297_2", enabled = true, priority = 38, description = "[Android]Product:My Stuff remove model")
    public void myStuffEmptyMessageOneTest() {
        String result = myStuffPageTab.getMyStuffIsEmptyMessageOne().getText();
        Assert.assertEquals(result, "Nothing to see here... yet.");
    }

    @Test(testName = "TC BILTAPPTST-297_3", enabled = true, priority = 39, description = "[Android]Product:My Stuff remove model")
    public void myStuffEmptyMessageTwoTest() {
        boolean result = false;
        List<MobileElement> listOfContainers = new ArrayList<>(widgetView.getListOfTextViews());
        for (MobileElement element : listOfContainers) {
            if (element.getText().equals("Downloaded instructions will be kept here for your future reference.")) {
                result = true;
                break;
            }
        }
        myStuffPageTab.getMyStuffHideButton().click();
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-298_1,2,3", enabled = true, priority = 40, description = "Sign In: Sign In button",
            dataProvider = "Values for TC BILTAPPTST-298_1,2")
    public void signInButtonDisabledTest(String email, String password) {
        homePageTab.getSignInButton().click();
        signInMenu.getEmailField().click();
        signInMenu.getEmailField().clear();
        signInMenu.getEmailField().sendKeys(email);
        DriverManager.getDriver().navigate().back();
        signInMenu.getPasswordField().sendKeys(password);
        DriverManager.getDriver().navigate().back();
        boolean result = signInMenu.getSignInButton().isEnabled();
        signInMenu.getMenuCloseButton().click();
        waitManager.waitElementToBeClickable(10, homePageTab.getSettingsButton());
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "Values for TC BILTAPPTST-298_1,2")
    public Object[][] inputsForEmailAndPass() {
        return new Object[][]{
                {"", ""},
                {"x", ""},
                {"xxxxxx", "22"},
                {"x@xxxx", "1"},
                {"x@.xx", "1"},
                {"xx.xx", "1"},
                {"x@x.x", "1"},
                {"x@x.xx", ""},
        };
    }

    @Test(testName = "TC BILTAPPTST-298_4", enabled = true, priority = 41, description = "Sign In: Email")
    public void signInEmailTest() {
        homePageTab.getSignInButton().click();
        signInMenu.getEmailField().click();
        signInMenu.getEmailField().clear();
        signInMenu.getEmailField().sendKeys("x@x.xx");
        DriverManager.getDriver().navigate().back();
        signInMenu.getPasswordField().click();
        signInMenu.getPasswordField().sendKeys("x");
        DriverManager.getDriver().navigate().back();
        boolean result = signInMenu.getSignInButton().isEnabled();
        signInMenu.getMenuCloseButton().click();
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-299_1,2,3", enabled = true, priority = 42, description = "Sign In: Forgot Password UI")
    public void forgotYourPasswordTitleTest() {
        homePageTab.getSignInButton().click();
        signInMenu.getForgotPasswordButton().click();
        String result = widgetView.getTextViewTitle().getText();
        forgotPasswordMenu.getLeftMenuCloseButton().click();
        waitManager.waitElementToBeClickable(10, signInMenu.getMenuCloseButton());
        signInMenu.getMenuCloseButton().click();
        Assert.assertEquals(result, "Forgot Your Password?");
    }

    @Test(testName = "TC BILTAPPTST-299_3", enabled = true, priority = 43, description = "Sign In: Forgot Password UI")
    public void forgotYourPasswordMessageTest() {
        homePageTab.getSignInButton().click();
        signInMenu.getForgotPasswordButton().click();
        boolean result = false;
        List<MobileElement> listOfTextViews = new ArrayList<>(widgetView.getListOfTextViews());
        for (MobileElement element : listOfTextViews) {
            if (element.getText().equals("Please enter the email address associated with your account.")) {
                result = true;
                break;
            }
        }
        forgotPasswordMenu.getLeftMenuCloseButton().click();
        waitManager.waitElementToBeClickable(10, signInMenu.getMenuCloseButton());
        signInMenu.getMenuCloseButton().click();
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-300_1", enabled = true, priority = 44, description = "Sign In: Forgot Password Submit")
    public void forgotYourPasswordSubmitDisabledTest() {
        homePageTab.getSignInButton().click();
        signInMenu.getForgotPasswordButton().click();
        boolean result = forgotPasswordMenu.getForgotPassSubmitButton().isEnabled();
        Assert.assertEquals(result, false);
    }

    @Test(testName = "TC BILTAPPTST-300_2", enabled = true, priority = 45, description = "Sign In: Forgot Password Submit")
    public void forgotYourPasswordSubmitEnabledTest() {
        forgotPasswordMenu.getEmailField().click();
        forgotPasswordMenu.getEmailField().clear();
        forgotPasswordMenu.getEmailField().sendKeys("x");
        DriverManager.getDriver().navigate().back();
        boolean result = forgotPasswordMenu.getForgotPassSubmitButton().isEnabled();
        forgotPasswordMenu.getLeftMenuCloseButton().click();
        waitManager.waitElementToBeClickable(10, signInMenu.getMenuCloseButton());
        signInMenu.getMenuCloseButton().click();
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-301_1,2,3", enabled = true, priority = 46, description = "Sign In: Forgot Password Submit")
    public void facebookSignInTest() {
        FacebookView facebookView = new FacebookView();
        homePageTab.getSignInButton().click();
        signInMenu.getFacebookLogin().click();
        waitManager.waitElementToBeClickable(30, facebookView.getLogInFacebookButton());
        facebookView.getFacebookCloseViewButton().click();
        homePageTab.getSignInButton().click();
        signInMenu.getFacebookLogin().click();
        waitManager.waitElementToBeClickable(30, facebookView.getLogInFacebookButton());
        DriverManager.getDriver().navigate().back();
    }

    @Test(testName = "TC BILTAPPTST-302_1", enabled = true, priority = 47, description = "Sign In: Sign Up")
    public void signUpTitleTest() {
        homePageTab.getSignInButton().click();
        signInMenu.getSignUpButton().click();
        String result = signUpMenu.getMenuTitle().getText();
        Assert.assertEquals(result, "Create Account");
    }

    @Test(testName = "TC BILTAPPTST-302_2", enabled = true, priority = 48, description = "Sign In: Sign Up")
    public void signUpNavigationTest() {
        signInMenu.getSignUpButton().click();
        signUpMenu.getLeftMenuCloseButton().click();
        signInMenu.getSignUpButton().click();
        signUpMenu.getMenuCloseButton().click();
    }

    @Test(testName = "TC BILTAPPTST-303_1", enabled = true, priority = 49, description = "Sign In: Sign Up")
    public void signUpDisabledTest() {
        homePageTab.getSignInButton().click();
        signInMenu.getSignUpButton().click();
        boolean result = signUpMenu.getSignUpCreateAccountButton().isEnabled();
        Assert.assertEquals(result, false);
    }

    @Test(testName = "TC BILTAPPTST-303_2", enabled = true, priority = 50, description = "Sign In: Sign Up")
    public void signUpEnabledTest() {
        fillTextFieldManager.fillTextField(signUpMenu.getNameSignUpTextField(), "test");
        fillTextFieldManager.fillTextField(signUpMenu.getLastNameTextField(), "test");
        fillTextFieldManager.fillTextField(signUpMenu.getEmailField(), "t@t.tt");
        fillTextFieldManager.fillTextField(signUpMenu.getPasswordField(), "test");
        signUpMenu.getAgreementBILTCheckBox().click();
        boolean result = signUpMenu.getSignUpCreateAccountButton().isEnabled();
        Assert.assertEquals(result, true);
    }

    @Test(testName = "TC BILTAPPTST-303_3", enabled = true, priority = 51, description = "Sign In: Sign Up",
            dataProvider = "Values for TC BILTAPPTST-303_3")
    public void signUpDisabledInvalidEmailTest(String email) {
        fillTextFieldManager.fillTextField(signUpMenu.getNameSignUpTextField(), "test");
        fillTextFieldManager.fillTextField(signUpMenu.getLastNameTextField(), "test");
        fillTextFieldManager.fillTextField(signUpMenu.getEmailField(), email);
        fillTextFieldManager.fillTextField(signUpMenu.getPasswordField(), "test");
        signUpMenu.getAgreementBILTCheckBox().click();
        boolean result = signUpMenu.getSignUpCreateAccountButton().isEnabled();
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "Values for TC BILTAPPTST-303_3")
    public Object[][] inputsForEmail() {
        return new Object[][]{
                {"x"},
                {"xxxxxx"},
                {"x@xxxx"},
                {"x@.xx"},
                {"xx.xx"},
                {"x@x.x"},
        };
    }


}