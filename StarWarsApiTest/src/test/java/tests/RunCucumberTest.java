package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"StepDefinitions"},
        plugin = { "html:target/results.html", "message:target/results.ndjson" })

public class RunCucumberTest extends AbstractTestNGCucumberTests{

//    @Override
//    @DataProvider(parallel = true)
//
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}