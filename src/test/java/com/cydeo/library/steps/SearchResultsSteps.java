package com.cydeo.library.steps;

import com.cydeo.library.pages.Library_Login_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsSteps {
    Library_Login_page pageDrive = new Library_Login_page();

    @And("user clicks Users link")
    public void userClicksUsersLink() {
        pageDrive.usersLink.click();
    }
    @Then("user should see the table have following links")
    public void user_should_see_the_table_have_following_links(List<String> dataTable) {
        List<String> actualList=new ArrayList<>();
        for (WebElement column: pageDrive.columns){
            actualList.add(column.getText());
        }
        Assert.assertEquals(dataTable,actualList);
    }



}
