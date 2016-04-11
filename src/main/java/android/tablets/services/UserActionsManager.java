package android.tablets.services;

import android.DriverManager;
import org.openqa.selenium.Dimension;

import static android.DriverManager.getDriver;

/**
 * Created by Ihar_Pryshchepau on 3/22/2016.
 */
public class UserActionsManager {

    public void swipeToLeftNumberOfTimes(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            Dimension size = getDriver().manage().window().getSize();
            int startx = (int) (size.width * 0.8);
            int endx = (int) (size.width * 0.20);
            int starty = size.height / 2;
            getDriver().swipe(startx, starty, endx, starty, 1000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void swipeToLeft() {
        Dimension size = getDriver().manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        getDriver().swipe(startx, starty, endx, starty, 1000);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void swipeToRight() {
        Dimension size = getDriver().manage().window().getSize();
        int endx = (int) (size.width * 0.8);
        int startx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        DriverManager.getDriver().swipe(startx, starty, endx, starty, 1000);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void swipeToRightNumberOfTimes(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            Dimension size = getDriver().manage().window().getSize();
            int endx = (int) (size.width * 0.8);
            int startx = (int) (size.width * 0.20);
            int starty = size.height / 2;
            getDriver().swipe(startx, starty, endx, starty, 1000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
