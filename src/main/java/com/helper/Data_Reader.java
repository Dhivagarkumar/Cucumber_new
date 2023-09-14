package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_Reader {
	
	public static Properties p = new Properties();
	
	public Data_Reader() throws IOException {
		File f = new File("C://Adaction//Cucumber//src//main//java//com//Propertyfile//OrangeHrm.properties");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
	} 
	
	public String getpropUrl() {
		String Url = p.getProperty("url");
		return Url;
	}
	
	
	public  String getpropUsername() {
		String Username = p.getProperty("Username");
		return Username;
		
	}
	public String getpropPassword() {
		String Password = p.getProperty("Password");
		return Password;
	}
	
	public String getpropFirstname() {
		String Firstname = p.getProperty("Firstname");
		return Firstname;
	}
	
	public String getpropMiddlename() {
		String Middlename = p.getProperty("Middlename");
		return Middlename;
	}
	public String getpropLastname() {
		String Lastname = p.getProperty("Lastname");
		return Lastname;
	}
	public String getpropEmployeeid() {
		String Employeeid = p.getProperty("Employeeid");
		return Employeeid;
	}

}
