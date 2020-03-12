package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags = {"@SmokeTest"},
        plugin = {"pretty","html:target/cucumberSmokeTest"}
        )

public class TestRunner2$SmokeTest {
}
