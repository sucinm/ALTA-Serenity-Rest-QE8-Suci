package starter;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Latihan1",
        plugin = {"pretty"},
        features = "classpath:features/Reqres" //adjust to running feature
)
public class CucumberTestSuite {}
