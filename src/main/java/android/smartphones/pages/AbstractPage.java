package android.smartphones.pages;

import android.DriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ihar_Pryshchepau on 4/11/2016.
 */
public class AbstractPage {

    public AbstractPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }
}
