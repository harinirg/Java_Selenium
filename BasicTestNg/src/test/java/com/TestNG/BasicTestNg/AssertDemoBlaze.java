package com.TestNG.BasicTestNg;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AssertDemoBlaze {

     public WebDriver driver; 
     SoftAssert sa=new SoftAssert();
     @Test
     public void verifyTitle() {
    	 String expectedTitle="STORE";
    	 String actualTitle=driver.getTitle();
    	 sa.assertEquals(actualTitle, expectedTitle,"Title is not same");
    	 sa.assertAll();
     }
	 /* @Test(priority=3)
	  public void validation() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();	  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("admin");
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
	      String home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Welcome')]"))).getText();
	      String expected="Welcome Admin";
	      Assert.assertEquals(home, expected, "Login Successfull");
	      System.out.println("Login Successfull");
	  }
	 // @Ignore
	 @Test(priority=2,dependsOnMethods="validation")
	  public void invalidUserName() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("Hello");
	      driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("admin");
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();	 
	      wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert= driver.switchTo().alert();
		  String alertNotification=alert.getText();
		  alert.accept();
		  String expected="Wrong password.";
		  Assert.assertEquals(alertNotification,expected,"Username is wrong");
		  System.out.println("Username is wrong");
		  
			
	  }
	  @Test(priority=1,dependsOnMethods="validation")
	  public void invalidPassword(){
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Hello");
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
	      wait.until(ExpectedConditions.alertIsPresent());
	      Alert alert= driver.switchTo().alert();
		  String alertNotification=alert.getText();
		  alert.accept();
		  String expected="Wrong password.";
		  Assert.assertEquals(alertNotification,expected,"password is wrong");
		  System.out.println("Password is wrong");

		  
		  
	  }*/
	  @BeforeMethod
	  public void beforeMethod() {
	      //driver.get("https://demoblaze.com/");
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("--start-maximized");
		 // option.addArguments("--remote-allow-origins=*");//to remove the socketException
		  //option.addArguments("--headless");  
		  driver = new ChromeDriver(option);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demoblaze.com/");
		 
	  }
	  

	  @AfterMethod
	  public void afterMethod() {	
		  driver.quit();
	  }

	}


