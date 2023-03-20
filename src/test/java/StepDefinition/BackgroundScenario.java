package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundScenario {
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("Is a Background scenario");
    }
    @When("I submit username and password")
    public void i_submit_username_and_password() {

    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {

    }
    @Given("User search for Lenovo Laptop")
    public void user_search_for_lenovo_laptop() {
        System.out.println("Scenario1");
    }
    @When("Add the first laptop that appears in the search result to the basket")
    public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {

    }
    @Then("User basket should display with added item")
    public void user_basket_should_display_with_added_item() {

    }
    @Given("User navigate for Lenovo Laptop")
    public void userNavigateForLenovoLaptop() {
        System.out.println("Scenario2");
    }
    @When("Add the laptop to the basket")
    public void add_the_laptop_to_the_basket() {

    }

}

