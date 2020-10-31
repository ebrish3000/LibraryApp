package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.AddUserPage;
import com.cybertek.library.pages.BasePage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps extends BasePage {
    AddUserPage addUserPage = new AddUserPage();


    @Given("I am on the Users page")
    public void i_am_on_the_users_page() {
    }

    @When("I click to add user")
    public void i_click_to_add_user() {
        addUserPage.addUser.click();
        BrowserUtils.wait(2);
    }
    @Then("I should be abel to fill out the table to add new user")
    public void i_should_be_abel_to_fill_out_the_table_to_add_new_user() {
        addUserPage.fullName.sendKeys("Ebrahim Emam");
        addUserPage.email.sendKeys("ebr@gmail.com");
        addUserPage.password.sendKeys("9910");
        addUserPage.address.sendKeys("Seatac");
        addUserPage.saveChange.click();
    }
}

