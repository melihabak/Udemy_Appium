package testRunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.driverFactory;

@CucumberOptions(
            features = {"src/test/java/features"},
            glue = {"stepDefinitions","util"},
            tags = "@case1",
            plugin = {
                    "summary","pretty","html:Reports/CucumberReport/Reports.html"
            }
)
public class runner extends AbstractTestNGCucumberTests {

    static AppiumDriver driver = driverFactory.getDriver();

}
