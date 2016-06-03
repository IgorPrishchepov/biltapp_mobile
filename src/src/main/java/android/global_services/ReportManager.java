package android.global_services;

import appium_driver.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ihar_Pryshchepau on 5/26/2016.
 */
public class ReportManager {
    private static final String SCREENSHOTS_DIRECTORY = "./screenshots/";

    public static void takeScreenShot(String testName) {
        File screenshotDir = new File(SCREENSHOTS_DIRECTORY);
        if (!screenshotDir.exists()) {
            screenshotDir.mkdir();
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy-h-mm-ss-a");
        String currentDate = simpleDateFormat.format(date);

        String fileName = testName + currentDate;
        File screenShotImage = (DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShotImage, new File(String.format("./test_results/screenshots/%s.jpg", fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
