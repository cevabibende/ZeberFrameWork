package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilities.BrowserUtils;
import org.example.utilities.ConfigurationReader;
import org.example.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GROUP_01_TC_05_StepDef extends BaseStep {

    @Given("the user is on the sign in page")
    public void the_user_is_on_the_sign_in_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        pages.mainPage().clickWelcomeGuestButton();
        pages.mainPage().clickSignInButton();

    }

    @When("the user enters email {string}")
    public void the_user_enters_email(String email) {
        pages.loginPage().enterEmailValue(email);
    }

    @When("the user enters password as {string}")
    public void the_user_enters_password_as(String password) {
        pages.loginPage().enterPasswordValue(password);
    }

    @When("the user clicks on the sign in")
    public void the_user_clicks_on_the_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.wait(1);
        pages.loginPage().clickSignInButton();
    }

    @Then("the user should be signed in")
    public void the_user_should_be_signed_in() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://5.161.191.25/customer/account/profile");
    }

    @Then("user arrives to profile page and sees {string}, {string}, {string}, {string}, {string}")
    public void user_arrives_to_profile_page_and_sees(String string, String string2, String string3, String string4, String string5) {
        Assert.assertEquals(pages.profilePage().getFirstNameText(), "First Name");
        Assert.assertEquals(pages.profilePage().getLastNameText(), "Last Name");
        Assert.assertEquals(pages.profilePage().getGenderText(), "Gender");
        Assert.assertEquals(pages.profilePage().getDateOfBirthText(), "Date Of Birth");
        Assert.assertEquals(pages.profilePage().getEmailText(), "Email");
    }

}
