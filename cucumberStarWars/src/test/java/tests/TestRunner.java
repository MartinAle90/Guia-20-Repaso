package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"StepDefinitions"},
//        monochrome = true,
        plugin = {"pretty", "html:target/results.html" })

public class TestRunner {
}
/*De esta forma podemos correr todos los test de forma parales, y no andar esperando a que se termine la ejecucion de uno*/
//public class RunCucumberTest extends AbstractTestNGCucumberTests{
//
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//}
