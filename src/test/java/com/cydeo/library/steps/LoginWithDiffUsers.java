package com.cydeo.library.steps;

import com.cydeo.library.pages.Library_Login_page;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginWithDiffUsers {
    Library_Login_page pageDriver=new Library_Login_page();
    @Then("user should see {string} in the account")
    public void userShouldSeeInTheAccount(String arg0) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pageDriver.accountName));
        Assert.assertEquals(arg0,pageDriver.accountName.getText());
        pageDriver.account.click();
        pageDriver.logOutBtn.click();
    }
}
