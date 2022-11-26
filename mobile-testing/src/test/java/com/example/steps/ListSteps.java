package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ListSteps extends BaseTest {
    @Then("User go to list menu")
    public void userGoToListMenu() {
        listPages.clickHamburgerBtn();
        listPages.clickListMenu();
    }

    @And("User doing scroll")
    public void userDoingScroll() {
        listPages.swipeList();
    }

    @And("User doing long press in the list")
    public void userDoingLongPressInTheList() {
        listPages.longPressList();
    }

    @And("User doing tap multiple times in the list")
    public void userDoingTapMultipleTimesInTheList() {
        listPages.tapMultipleList();
    }
}
