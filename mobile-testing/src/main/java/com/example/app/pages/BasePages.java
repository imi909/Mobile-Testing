package com.example.app.pages;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.touch.offset.ElementOption;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class BasePages {

    TouchAction touchAction;
    public AndroidDriver<AndroidElement> getDriver(){
        return AndroidDriverInit.driver;
    }

    public AndroidElement find(By by){
        return getDriver().findElement(by);
    }

    public List<AndroidElement> findElements(By by){
        return getDriver().findElements(by);
    }

    public TouchAction getTouchAction(){
        touchAction = new TouchAction(getDriver());
        return touchAction;
    }

    public void type (By by, String text){
        AndroidElement element = find(by);
        element.clear();
        element.sendKeys(text);
    }

    public void click(By by){
        find(by).click();
    }

    public String getText(By by){
        return find(by).getText();
    }

    public boolean isDisplayed(By by){
        return find(by).isDisplayed();
    }

    public void longPressObj(AndroidElement elementToPress){
        getTouchAction().longPress(PointOption.point(elementToPress.getCenter()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .release()
                .perform();
    }

    public void tapMultipleTimes(AndroidElement elementToTap){
        getTouchAction().tap(TapOptions.tapOptions().withTapsCount(10)
                        .withElement(ElementOption.element(elementToTap)))
                .perform();
    }
}
