 package com.Stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;
import com.pageobjectmanager.Page_Object_Manager;
import com.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BassClass{
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	

@Given("^User Lanch The Url$")
public void user_Lanch_The_Url() throws Throwable {
	getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	wait1();
    }

@When("^User Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	
   inputonElement(pom.getLp().getUsername(),"Admin");
}

@When("^User Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {
   inputonElement(pom.getLp().getPass(),"admin123");
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
 inputonElement(pom.getEp().getFirstname(), "DHIVAGAR");
}

@When("^User Enter The Middlename In Middlename Field$")
public void user_Enter_The_Middlename_In_Middlename_Field() throws Throwable {
  inputonElement(pom.getEp().getMiddlename(), "Kumar");
}

@When("^User Enter The Lastname in Lastname Field$")
public void user_Enter_The_Lastname_in_Lastname_Field() throws Throwable {
   inputonElement(pom.getEp().getLastname(), "Dhiva007");
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
	inputonElement(pom.getEp().getEmpid(), "12345");
}

@Then("^User Click On The Save Button And It Navigate To Home Page$")
public void user_Click_On_The_Save_Button_And_It_Navigate_To_Home_Page() throws Throwable {
   clickonElement(pom.getEp().getSubmit());
}


	
}
