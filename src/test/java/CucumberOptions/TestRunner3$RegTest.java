package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags = {"@RegTest"},
        plugin = {"pretty","html:target/cucumberRegTest"}

        )

public class TestRunner3$RegTest {
}
