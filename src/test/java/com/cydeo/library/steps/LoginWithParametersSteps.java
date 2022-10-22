package com.cydeo.library.steps;

import com.cydeo.library.pages.Library_Login_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginWithParametersSteps {
    Library_Login_page pageDriver = new Library_Login_page();

    @When("user enters {string} username")
    public void user_enters_username(String string) {
        pageDriver.username.sendKeys(string);
    }

    @When("user enters {string} password")
    public void user_enters_password(String string) {
        pageDriver.password.sendKeys(string);
    }

    @When("user logins using {string} and {string}")
    public void user_logins_using_and(String string, String string2) {
        pageDriver.username.sendKeys(string);
        pageDriver.password.sendKeys(string2 + Keys.ENTER);
    }

    @Then("user should see {int} {string}")
    public void user_should_see(Integer int1, String string) {
        Assert.assertTrue(pageDriver.userCount.isDisplayed());
        Assert.assertTrue(pageDriver.users.getText().equalsIgnoreCase(string));

    }


}
