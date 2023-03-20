package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\14088\\IdeaProjects\\CucumberLoginProj\\src\\test\\java\\FeatureFile",
        glue ={"StepDefinition"}, tags = "@Smoke",
         /*plugin = {"pretty"},*/
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports2"}
)
public class TestRunner {
}
