package org.example.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilities.Driver;
import org.junit.Assert;

public class GROUP_02_TC_09_StepDef extends BaseStep {

    @When("the user clicks on Welcome,Guest button")
    public void the_user_clicks_on_welcome_guest_button() {
       pages.mainPage().clickWelcomeGuestButton();
    }
    @When("the user clicks on Sign In")
    public void the_user_clicks_on_sign_ın() {
        // Write code here that turns the phrase above into concrete actions
        pages.mainPage().clickSignInButton();
    }

    @When("the user enters valid email as {string}")
    public void the_user_enters_valid_email_as(String email) {
      pages.loginPage().enterEmailValue(email);
    }

    @When("the user enters valid password as {string}")
    public void the_user_enters_valid_password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        pages.loginPage().enterPasswordValue(password);
    }

    @When("the user clicks on sign in button")
    public void the_user_clicks_on_sign_in_button() {
      pages.loginPage().clickSignInButton();
    }

    @When("the user clicks on About Us link")
    public void the_user_clicks_on_about_us_link() {
       pages.profilePage().clickAboutUsLink();
    }

    @Then("the user should be able to see some information in About Us page")
    public void the_user_should_be_able_to_see_some_information_in_about_us_page() {
        Assert.assertEquals(pages.mainPage().getAboutUsPageContentText(),"The user should be able to see some information on the 'About Us' page but cannot see it");

    }
}
