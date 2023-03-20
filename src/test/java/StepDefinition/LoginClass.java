package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

   public static WebDriver driver;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/");
    }

    @When("user is entering valid Username and Password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("username")).sendKeys("Sreedevi");
        driver.findElement(By.id("password")).sendKeys("pass123");
        Thread.sleep(2000);
    }

    @And("when user clicks on login button")
    public void when_he_clicks_on_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        driver.getPageSource().contains("logout");
        driver.close();
    }

}
