package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Featurefile_Report",
glue = "com.Step_Definition_Report",
plugin = {"html:HtmlReport/OrangeHtml.html","pretty","json:JsonReport/OrangeJson.json",
		"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/Orange.html"})


public class Test_Runner_Report extends BassClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		driver = browserlanch("Chrome");
	}
	
	@AfterClass
	public static void tear_Dwon() {
		quit();

	}

}
