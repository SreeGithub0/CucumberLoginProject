package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

    public static WebDriver driver;

    @Given("user will be on Homepage")
    public void  Homepage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/");
    }

    @When("^user enters valid (.*) and (.*)$")
    public void UserCredentials(String username, String password){
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("when he clicks on login button")
    public void Loginbtn(){
        driver.findElement(By.id("login")).click();

    }

    @Then("user need to navigate to Landing Page")
    public void LandingPage(){
        driver.getPageSource().contains("LogOut");
        driver.close();
    }
}
