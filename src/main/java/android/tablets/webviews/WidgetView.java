package android.tablets.webviews;

import android.tablets.pages.AbstactPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class WidgetView extends AbstactPage {

    @AndroidFindBy(id = "com.bilt.mobile:id/title")
    private MobileElement textViewTitle;

    public MobileElement getTextViewTitle() {
        return textViewTitle;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/closeButton")
    private MobileElement widgetViewCloseButton;

    public MobileElement getWidgetViewCloseButton() {
        return widgetViewCloseButton;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/webview")
    private MobileElement webViewBody;

    public MobileElement getWebViewBody() {
        return webViewBody;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/image")
    private MobileElement imageViewBody;

    public MobileElement getImageViewBody() {
        return imageViewBody;
    }

    @AndroidFindBy(id = "com.bilt.mobile:id/continueButton")
    private MobileElement continueAssemblyButton;

    public MobileElement getContinueAssemblyButton() {
        return continueAssemblyButton;
    }

    @AndroidFindBys({@AndroidFindBy(className = "android.widget.TextView")})
    private List<MobileElement> listOfTextViews;

    public List<MobileElement> getListOfTextViews() {
        return listOfTextViews;
    }


}
