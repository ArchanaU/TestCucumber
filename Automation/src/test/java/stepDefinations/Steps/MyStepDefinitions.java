package stepDefinations.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
        System.out.println("Given");
    }

    @When("^User searched for Cucumber Vegetable$")
    public void user_searched_for_cucumber_vegetable() throws Throwable {
        
    }

    @Then("^Cucumber results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
       
    }

}