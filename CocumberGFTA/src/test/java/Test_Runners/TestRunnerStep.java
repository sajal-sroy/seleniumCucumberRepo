package Test_Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\jenkins_workspace\\CocumberGFTA\\src\\test\\java",glue={"Step_Defs"})
public class TestRunnerStep {

}
