package com.example.app.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

import java.time.Duration;

public class ListPages extends BasePages{

    public void clickHamburgerBtn(){
        click(MobileBy.AccessibilityId("Open navigation drawer"));
    }

    public void clickListMenu(){
        click(MobileBy.id("nav_list"));
    }

    public void swipeList(){
        AndroidElement element = find(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"List ke-100\"))"));
    }

    public void longPressList(){
        longPressObj(findElements(MobileBy.id("text_view")).get(8));
    }

    public void tapMultipleList(){
        tapMultipleTimes(findElements(MobileBy.id("text_view")).get(8));
    }
}
