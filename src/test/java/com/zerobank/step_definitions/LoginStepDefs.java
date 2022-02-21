package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user logged in")
    public void the_user_logged_in() {
        new LoginPage().login();
    }
    @Given("The user login with {string} and {string}")
    public void the_user_login_with_and(String username, String password) {
        new LoginPage().login(username,password);
    }

    @Then("The user should be able to see the title {string}")
    public void the_user_should_be_able_to_see_the_title(String expectedTitle) {
       Assert.assertEquals(expectedTitle,Driver.get().getTitle());
    }

    @Then("The user should be able to see the message {string}")
    public void the_user_should_be_able_to_see_the_message(String expectedMessage) {
      Assert.assertEquals(expectedMessage,new LoginPage().errorMessage.getText());
    }

}
