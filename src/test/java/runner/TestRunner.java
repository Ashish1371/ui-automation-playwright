package runner;

import com.microsoft.playwright.*;
import helpers.BrowserFactory;
import helpers.PropertyReader;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"}
        ,plugin = "json:target/cucumber-reports/CucumberTestReport.json")
public class TestRunner extends AbstractTestNGCucumberTests {
}