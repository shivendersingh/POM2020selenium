package com.Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags="@launchingornghrmurl",
		features="classpath:feature",glue= {"com.cucumber.common","com.stepdefination","com.Testrunner"}
		)
public class RunnerCucumberTest extends AbstractTestNGCucumberTests {

}
