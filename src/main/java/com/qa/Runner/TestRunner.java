package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Java\\Selenium_WorkSpace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\LoginPage.feature", //the path of the feature files
		glue={"com\\qa\\StepDefinitions"}, //the path of the step definition files
		format = {"pretty","html:test-outout","json:json_cucumber/index.json","junit:junit_cucumber/index.xml"},//to generate different types of reporting
		dryRun = false, //to check the mapping is proper between feature file and step def file
		//tags = {"@test2"},
		strict = true, //it will check if any step is not defined in step definition file
		monochrome = true //display the console output in a proper readable format
		
		
		//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
		//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
		
		
		)
public class TestRunner {

	
}
