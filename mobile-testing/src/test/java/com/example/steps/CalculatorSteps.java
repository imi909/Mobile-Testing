package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.CalculatorPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorSteps extends BaseTest {
    @Given("User is already on calculator page")
    public void userIsAlreadyOnCalculatorPage() {
    }

    @When("User input {int} for first field")
    public void userInputForFirstField(int number) {
        calculatorPages.inputFirstField(number);
    }

    @Then("User click arrow button")
    public void userClickArrowButton() {
        calculatorPages.arrowBtn();
    }

    @And("User select add option")
    public void userSelectAddOption() {
        calculatorPages.addBtn();
    }

    @Then("User input {int} for second field")
    public void userInputForSecondField(int number) {
        calculatorPages.inputSecondField(number);
    }

    @And("User click equal button")
    public void userClickEqualButton() {
        calculatorPages.equalBtn();
    }

    @Then("The expected total should be {int}")
    public void theExpectedTotalShouldBe(int number) {
        calculatorPages.getResult();
    }

    @And("User select subtract option")
    public void userSelectSubtractOption() {
        calculatorPages.subtractBtn();
    }

    @And("User select divide option")
    public void userSelectDivideOption() {
        calculatorPages.divideBtn();
    }

    @And("User select multiply option")
    public void userSelectMultiplyOption() {
        calculatorPages.multiplyBtn();
    }
}
