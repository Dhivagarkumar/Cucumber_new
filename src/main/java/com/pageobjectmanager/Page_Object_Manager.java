package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.Pom.EmployeDeatiles_Page;
import com.Pom.LoginPage;
import com.Pom.SelectPage;

public class Page_Object_Manager {
	public static WebDriver driver;
	
	private  LoginPage lp;
	
	private SelectPage sp;
	
	private EmployeDeatiles_Page ep;

	

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public SelectPage getSp() {
		sp = new SelectPage(driver);
		return sp;
	}

	public EmployeDeatiles_Page getEp() {
		ep = new EmployeDeatiles_Page(driver);
		return ep;
	}
	public Page_Object_Manager(WebDriver abc) {
		driver = abc;
	
		
	}

	
	

	
	
}
