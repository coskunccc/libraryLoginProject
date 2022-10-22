package com.cydeo.library.steps;

import com.cydeo.library.pages.Library_Login_page;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Library_Login_Steps {
    Library_Login_page pageDriver = new Library_Login_page();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://library3.cydeo.com/login.html");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        pageDriver.username.sendKeys("student4@library");
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        pageDriver.password.sendKeys("8u6iaONh");
    }

    @When("user clicks the Sign in button")
    public void user_clicks_the_sign_in_button() {
        pageDriver.signinButton.click();
    }

    @Then("user should see the library homepage")
    public void user_should_see_the_library_homepage() {
        Assert.assertTrue(pageDriver.libraryLogo.isDisplayed());
        Driver.closeDriver();

    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        pageDriver.username.sendKeys("librarian5@library");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        pageDriver.password.sendKeys("GUgEFTI7");
    }

}
