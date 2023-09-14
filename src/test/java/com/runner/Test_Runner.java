package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//featurefile",
glue = "com.Stepdefinition")

public class Test_Runner extends BassClass {
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
