package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Eclips instalation setup\\CucumberPageObjectModel\\Feature\\Feature.feature", //the path of the feature files
		glue= "/CucumberPageObjectModel/src/main/java/StepDefination", //the path of the step definition files
		plugin= {"pretty","html:test-output"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)

public class Runner {

}
