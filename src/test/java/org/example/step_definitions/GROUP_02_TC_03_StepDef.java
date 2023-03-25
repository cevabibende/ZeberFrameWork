package org.example.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilities.ConfigurationReader;
import org.example.utilities.Driver;
import org.junit.Assert;


public class GROUP_02_TC_03_StepDef extends BaseStep {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);


    }
    @When("the user clicks on search box")
    public void the_user_clicks_on_search_box() {
        pages.mainPage().clickSearchBox();
    }
    @When("the user enters {string}")
    public void the_user_enters(String productName) {
       pages.mainPage().enterProductNameToSearchBox(productName);
       pages.mainPage().clickSearchIcon();
    }
    @When("The user should see the correct search results")
    public void the_user_should_see_the_correct_search_results() {
       Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"http://5.161.191.25/categorysearch?category=&term=apple");
    }
    @Then("the user should see error messages if typed number or irrelevant characters")
    public void the_user_should_see_error_messages_if_typed_number_or_irrelevant_characters() {
      Assert.assertEquals(pages.mainPage().getWhoopsErrorMessageText(),"Whoops!");
      Assert.assertEquals(pages.mainPage().getNoResultFoundText(),"No Results Found");

    }
}
