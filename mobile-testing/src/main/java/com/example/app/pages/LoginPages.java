package com.example.app.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPages extends BasePages{
    public void inputEmail(String email){
        type(MobileBy.id("username"), email);
    }

    public void inputPassword(String password){
        type(MobileBy.id("password"), password);
    }

    public void clickLoginButton(){
        click(MobileBy.id("login"));
    }

    public String getTitle(){
        return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
    }

    public boolean checkBurgerBtnAppear(){
        By locator = MobileBy.AccessibilityId("Open navigation drawer");
        WebDriverWait wait = new WebDriverWait(getDriver(),10, 1000);
        AndroidElement burgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return burgerBtn.isDisplayed();
    }
}
