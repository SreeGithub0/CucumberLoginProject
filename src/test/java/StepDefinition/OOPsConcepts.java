package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OOPsConcepts {

    @Before
    @Given("go to login page")
    public void go_to_login_page() {
        System.out.println("Executing Before methods1");
    }
    @When("entering valid Username and Password")
    public void entering_valid_username_and_password() {
        System.out.println("Executing Before methods2");
    }
    @After
    @And("click on login button")
    public void click_on_login_button() {
        System.out.println("Executing After methods1");
    }
    @Then("navigated to the home page")
    public void navigated_to_the_home_page() {
        System.out.println("Executing After methods2");
    }

}
