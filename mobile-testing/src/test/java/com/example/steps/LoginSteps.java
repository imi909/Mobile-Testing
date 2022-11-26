package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.BasePages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class LoginSteps extends BaseTest {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
    }

    @When("User input username {string}")
    public void userInputUsername(String username) {
        loginPages.inputEmail(username);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        loginPages.inputPassword(password);
    }

    @Then("User click button login")
    public void userClickButtonLogin() {
        loginPages.clickLoginButton();
    }

    @Then("User successfully login")
    public void userSuccessfullyLogin() {
        String titleText = loginPages.getTitle();
        Assertions.assertEquals("Calculator", titleText);
        boolean isDiplayed = loginPages.checkBurgerBtnAppear();
        Assertions.assertTrue(isDiplayed);
        MatcherAssert.assertThat(isDiplayed, Matchers.equalTo(true));
    }
}
