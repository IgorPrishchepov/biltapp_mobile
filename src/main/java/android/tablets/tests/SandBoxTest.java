package android.tablets.tests;

import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class SandBoxTest extends BaseTest {

    private int elementIndex = 0;
    private List<MobileElement> listOfAllProducts = null;

    @Test(priority = 0, enabled = true)
    public void skipIntro() {
        waitManager.waitElementToBeClickable(15, introductionPage.getSkipButton());
        introductionPage.getSkipButton().click();
        waitManager.waitElementToBeClickable(10, homePage.getSettingsButton());
    }









    /*
    @Test(testName = "TC BILTAPPTST-278", enabled = true, priority = 12, description = "Search: search products")
    public void searchFieldProductNotFoundQueryMessagesTest() throws InterruptedException {
        homePage.openSearchPage();
        //searchPage.getSearchProductTextField().sendKeys("test");
        DriverManager.getDriver().hideKeyboard();
        Thread.sleep(3000);
        int result = 0;
        List<WebElement> messages = searchPage.getSearchResultsTextViews();
        for (WebElement element : messages) {
            if (element.getText().equals(searchPage.OOPS_MESSAGE)) {
                System.out.println();
                result = result + 1;
            }
            if (element.getText().equals(searchPage.PLEASE_CHECK_MESSAGE)) {
                System.out.println(element.isDisplayed());
                result = result + 1;
            }
            if (element.getText().equals(searchPage.VIEW_ALL_PRODUCTS_BUTTON_NAME)) {
                System.out.println(element.isDisplayed());
                result = result + 1;
            }
        }
        //Assert.assertEquals(result, 3);
    }








    /*



    @Test
    public void swipeIntroduction() throws InterruptedException {
        waitManager.waitElementToBeClickable(5, introductionPage.getSkipButton());
        introductionPage.getSkipButton().click();
        settingsManager.openSettings();
        Thread.sleep(5000);
    }

    @Test(testName = "TC BILTAPPTST-278", enabled = true, priority = 12, description = "Search: search products")
    public void searchFieldProductNotFoundQueryMessagesTest() throws InterruptedException {
        homePage.openSearchPage();
        searchPage.getSearchProductTextField().sendKeys("test");
        DriverManager.getDriver().hideKeyboard();
        Thread.sleep(3000);
        int result = 0;
        List<WebElement> messages = searchPage.getSearchResultsTextViews();
        for (WebElement element : messages) {
            if (element.getText().equals(searchPage.OOPS_MESSAGE)) {
                result = result + 1;
            } else if (element.getText().equals(searchPage.PLEASE_CHECK_MESSAGE)) {
                result = result + 1;
            } else if (element.getText().equals(searchPage.VIEW_ALL_PRODUCTS_BUTTON_NAME)) {
                result = result + 1;
            }
        }
        Assert.assertEquals(result, 3);
    }

    @Test(testName = "TC BILTAPPTST-278", enabled = true, priority = 13, description = "Search: search products")
    public void searchFieldProductNotFoundQueryViewAllButtonTest() {
        waitManager.waitElementToBeClickable(10, searchPage.getSearchResultsViewAllButton());
        String result = searchPage.getSearchResultsViewAllButton().getText();
        Assert.assertEquals(result, searchPage.VIEW_ALL_PRODUCTS_BUTTON_NAME);
    }
/*
    @Test(testName = "TC BILTAPPTST-278", enabled = true, priority = 14, description = "Search: search products")
    public void searchFieldNoMessagesAfterCancelTest() throws InterruptedException {
        searchPage.getCancelSearchButton().click();
        homePage.openSearchPage();
        DriverManager.getDriver().hideKeyboard();
        Thread.sleep(3000);
        int result = 0;
        List<WebElement> messages = searchPage.getSearchResultsTextViews();
        for (WebElement element : messages) {
            if (element.getText().equals(searchPage.OOPS_MESSAGE)) {
                System.out.println(element.getText());
                result = result + 1;
            } else if (element.getText().equals(searchPage.PLEASE_CHECK_MESSAGE) & element.isDisplayed()) {
                result = result + 1;
            } else if (element.getText().equals(searchPage.VIEW_ALL_PRODUCTS_BUTTON_NAME) & element.isDisplayed()) {
                result = result + 1;
            }
        }
        Assert.assertEquals(result, 0);
    }

 @Test(testName = "TC BILTAPPTST-280_1", enabled = true, priority = 18, description = "Product: Details page")
    public void openDetailsPageOfAnyProduct() throws InterruptedException {

        //searchPage.getCancelSearchButton().click();
        homePage.openSearchPage();
        searchPage.getViewAllProductButton().click();
        waitManager.waitElementToBeVisible(20, searchPage.getSearchResultsQuantity());
        //DriverManager.getDriver().scrollTo("Weber Genesis S-330");

        List<MobileElement> listOfAllProductNames = searchPage.getListOfProductNames();
        System.out.println(listOfAllProductNames.size());
        Random random = new Random();
        int elementIndex = random.nextInt(listOfAllProductNames.size());
        String expectedName = listOfAllProductNames.get(elementIndex).getText();
        List<MobileElement> listOfAllProducts = searchPage.getListOfProductContainers();
        System.out.println(listOfAllProducts.size());
    /*    listOfAllProducts.get(elementIndex).click();
        waitManager.waitElementToBeClickable(20, modelOverviewPage.getGetInstructionsButton());
        String resultName = modelOverviewPage.getProductNameInDetailsPage().getText();
        Assert.assertEquals(resultName, expectedName);
        System.out.println(listOfAllProductNames.size());
        System.out.println(listOfAllProducts.size());
     */

}



