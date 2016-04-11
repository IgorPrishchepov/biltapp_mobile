package android.tablets.pages;

import android.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class AbstactPage {

    public AbstactPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()),this);
    }

    public MobileElement getElement(MobileElement element){
        return element;
    }
}
