package android.global_pages;

import android.DriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ihar_Pryshchepau on 4/14/2016.
 */
public class AbstractPage {

    public AbstractPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }
}
