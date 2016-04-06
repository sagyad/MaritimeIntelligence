import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by yadavs on 10/03/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources",
        tags = {"@suite","~@wip"},
        format = {"pretty","html:target/cucumber"},
        glue = "com.angetech.bdd.steps"
)
public class RunSuiteTest {
}
