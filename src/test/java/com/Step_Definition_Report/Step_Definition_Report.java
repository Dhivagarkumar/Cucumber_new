package com.Step_Definition_Report;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;
import com.helper.Data_Reader_Manager;
import com.pageobjectmanager.Page_Object_Manager;
import com.runner.Test_Runner_Report;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition_Report extends BassClass {
	
	public static WebDriver driver = Test_Runner_Report.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	

@Given("^User Lanch The Url$")
public void user_Lanch_The_Url() throws Throwable {
	String getpropUrl = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropUrl();
	getUrl(getpropUrl);
	wait1();
}

@When("^User Enter The \"([^\"]*)\" In Username Field$")
public void user_Enter_The_In_Username_Field(String user) throws Throwable {
    inputonElement(pom.getLp().getUsername(), user);  
}

@When("^User Enter The \"([^\"]*)\" In Password Field$")
public void user_Enter_The_In_Password_Field(String pass) throws Throwable {
   inputonElement(pom.getLp().getPass(), pass);
}

@Then("^User Click On The Login Button And It Navigate To Home Page$")
public void user_Click_On_The_Login_Button_And_It_Navigate_To_Home_Page() throws Throwable {
   clickonElement(pom.getLp().getLogin());
}





	

}
