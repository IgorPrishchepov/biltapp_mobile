package android.global_services;

import android.DriverManager;
import io.appium.java_client.MobileElement;

/**
 * Created by Ihar_Pryshchepau on 4/6/2016.
 */
public class FillTextFieldManager {

    public void fillTextField(MobileElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);
        DriverManager.getDriver().hideKeyboard();
    }
}
