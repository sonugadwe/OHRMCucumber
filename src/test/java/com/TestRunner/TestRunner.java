package com.TestRunner;

import org.junit.runner.RunWith;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features ="F:\\FULL TIME\\FinalProject\\OHRMCucumber\\src\\test\\resources\\Features\\TCA_Login.feature",
		glue = { "src\\test\\java\\com\\StepDefination\\Login_Step.java" },
		format= {"pretty","html:test-output","json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml"}, //to generate different types of reporting

		/*plugin = {
				"pretty", "html:src/test/resources/Reports/cucumber-html-report",
				"json:src/test/resources/Reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreport.html" },*/

		monochrome = true

)
public class TestRunner{
	
}

/*public class TestRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("\\src\\test\\resources\\extent-config.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	}
*/

