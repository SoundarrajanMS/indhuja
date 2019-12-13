package org.Sample.tng;

import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Computer {
	static WebDriver driver;
	
	@BeforeClass
	private void method1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Induja\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeMethod
	private void method2() {
    driver.get("https://www.facebook.com/");
	}
	@BeforeTest
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
    }
	@Test(enabled=false)
	private void mainFacbk1() throws Throwable {
	SoftAssert s = new SoftAssert();
	
	WebElement f = driver.findElement(By.id("email"));
	f.sendKeys("9965105007");
	WebElement f1 = driver.findElement(By.id("pass"));
      f1.sendKeys("mssoundar09");
      WebElement f2 = driver.findElement(By.id("loginbutton"));
	f2.click();
	String actual = driver.getCurrentUrl();
//	Assert.assertEquals("https://www.facebook.co/", actual);
	s.assertEquals(actual, "https://www.facebook.com/");
	
	driver.manage().window().maximize();
	}
	
	@Parameters({"usernam","password"})
	@Test
	private void mainFacbk2(@Optional ("9965105009")String s1,@Optional("mssoundar09")String s2) {
	WebElement f = driver.findElement(By.id("email"));
	f.sendKeys(s1);
	WebElement f1 = driver.findElement(By.id("pass"));
      f1.sendKeys(s2);
      WebElement f2 = driver.findElement(By.id("loginbutton"));
	f2.click();
	}
	@Test(enabled=false)
	private void mainFacbk3() {
	WebElement f = driver.findElement(By.id("email"));
	f.sendKeys("9965105007");
	WebElement f1 = driver.findElement(By.id("pass"));
      f1.sendKeys("mssoundar0");
      WebElement f2 = driver.findElement(By.id("loginbutton"));
	f2.click();
	}
	
	@Test(enabled = false)
	private void mainFacbk4() {
		String expected = driver.getCurrentUrl();
	WebElement f = driver.findElement(By.id("email"));
	f.sendKeys("996510500");
	WebElement f1 = driver.findElement(By.id("pass"));
      f1.sendKeys("mssoundar0");
      WebElement f2 = driver.findElement(By.id("loginbutton"));
	f2.click();
	String actual = driver.getCurrentUrl();
//	Assert.assertEquals(actual, "https://www.facebook.com/");
	}
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass(enabled=false)
	private void close() {
		driver.quit();
	}
	

	}


