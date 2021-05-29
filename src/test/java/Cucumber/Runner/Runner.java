package Cucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },

        features = "src/test/resources/features",


        glue = "Cucumber/stepdefinitons",


        tags = "@WebView",


        dryRun = false


)
public class Runner {


}
