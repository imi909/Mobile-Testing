package com.example.app.pages;

import io.appium.java_client.MobileBy;

public class CalculatorPages extends BasePages {
    int firstField, secondField;

    public void inputFirstField(int number){
        type(MobileBy.id("et_1"), String.valueOf(number));
        firstField = number;
    }

    public void inputSecondField(int number){
        type(MobileBy.id("et_2"), String.valueOf(number));
        secondField = number;
    }

    public void arrowBtn(){
        click(MobileBy.id("spinner_1"));
    }

    public void addBtn(){
        click(MobileBy.xpath("//android.widget.TextView[@text='+']"));
    }

    public void subtractBtn(){
        click(MobileBy.xpath("//android.widget.TextView[@text='-']"));
    }

    public void divideBtn(){
        click(MobileBy.xpath("//android.widget.TextView[@text='/']"));
    }

    public void multiplyBtn(){
        click(MobileBy.xpath("//android.widget.TextView[@text='*']"));
    }

    public void equalBtn(){
        click(MobileBy.id("acb_calculate"));
    }

    public String getResult(){
        return getText(MobileBy.id("tv_result"));
    }
}
