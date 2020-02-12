package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
//@RunWith(Cucumber.class)
@CucumberOptions(features ="Feature",glue="stepDefination",plugin={"pretty", "html:target/cucumber-reports" ,"json:target/cucumber.json"})
 
public class TestRunner extends AbstractTestNGCucumberTests {

}
