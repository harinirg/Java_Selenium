package com.TestNG.BasicTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsExample {
  @Test
  public void LoginTest() {
	  System.out.println("Login the Application");

  }
  @Test
  public void LogOutTest() {
	  System.out.println("LogOut the Application");

  }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("---------Before Test----------");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("---------After Test----------");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This will execute Before Suite");


  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will execute After Suite");

  }

}
