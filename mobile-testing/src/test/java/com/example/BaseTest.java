package com.example;

import com.example.app.pages.CalculatorPages;
import com.example.app.pages.ListPages;
import com.example.app.pages.LoginPages;
import org.checkerframework.checker.units.qual.C;

public class BaseTest {
    public LoginPages loginPages = new LoginPages();
    public ListPages listPages = new ListPages();
    public CalculatorPages calculatorPages = new CalculatorPages();
}
