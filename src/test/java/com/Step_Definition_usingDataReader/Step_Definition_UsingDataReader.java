package com.Step_Definition_usingDataReader;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;
import com.helper.Data_Reader_Manager;
import com.pageobjectmanager.Page_Object_Manager;
import com.runner.Test_Runner_UsingDataReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition_UsingDataReader extends BassClass {
	public static WebDriver driver = Test_Runner_UsingDataReader.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^User Lanch The Url$")
	public void user_Lanch_The_Url() throws Throwable {
		String getpropUrl = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropUrl();
		getUrl(getpropUrl);
		wait1();
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		String getpropUsername = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropUsername();
		inputonElement(pom.getLp().getUsername(), getpropUsername);
	}

	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		String getpropPassword = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropPassword();
		inputonElement(pom.getLp().getPass(), getpropPassword);
	}

	@Then("^User Click On The Login Button And It Navigate To Home Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Home_Page() throws Throwable {
	    clickonElement(pom.getLp().getLogin());
	    wait1();
	}

	@When("^Select The PIM Option And Click$")
	public void select_The_PIM_Option_And_Click() throws Throwable {
	   clickonElement(pom.getSp().getPim());
	   wait1();
	}

	@When("^Select The Add Employee Option And Click$")
	public void select_The_Add_Employee_Option_And_Click() throws Throwable {
		clickonElement(pom.getSp().getAddemploy());  
		wait1();
	}

	@When("^User Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
	  inputonElement(pom.getEp().getFirstname(), Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropFirstname());
	}

	@When("^User Enter The Middlename In Middlename Field$")
	public void user_Enter_The_Middlename_In_Middlename_Field() throws Throwable {
	   inputonElement(pom.getEp().getMiddlename(), Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropMiddlename());
	}

	@When("^User Enter The Lastname in Lastname Field$")
	public void user_Enter_The_Lastname_in_Lastname_Field() throws Throwable {
	    inputonElement(pom.getEp().getLastname(), Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropLastname());
	}

	@When("^User Enter The Employeeid In Employeeid Field$")
	public void user_Enter_The_Employeeid_In_Employeeid_Field() throws Throwable {
	    clickonElement(pom.getEp().getEmpid());
	    Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		inputonElement(pom.getEp().getEmpid(), Data_Reader_Manager.getInstanceDRM().getInstanceDR().getpropEmployeeid());
	}

	@Then("^User Click On The Save Button And It Navigate To Home Page$")
	public void user_Click_On_The_Save_Button_And_It_Navigate_To_Home_Page() throws Throwable {
	  clickonElement(pom.getEp().getSubmit());
	}



}
