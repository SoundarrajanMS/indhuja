package org.Sample.tng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NextApp extends BaseclassPOM1 {
	static WebDriver driver;
	@BeforeClass
	private void initalisation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Induja\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
    @BeforeMethod
    
    private void firstMethod() {
		driver.get("https://www.adactin.com/HotelApp/");

    
    }
    @BeforeTest
    private void startTime() {
	Date d = new Date();
    System.out.println(d);

	}
    @DataProvider(name="multiple")
    private Object[][] data() {
    	return new Object[][] {{"soundarrajan","9865107296"},{"9865105007","soundarrajan"},{"soundarrajan","mssoundar09"}};

	}
    @Test(dataProvider = "multiple")
    private void aditaMain1(String s2,String s3) {
    	
    WebElement A = driver.findElement(By.id("username"));
	A.sendKeys(s2);
	WebElement B = driver.findElement(By.id("password"));
    B.sendKeys(s3);
    WebElement C = driver.findElement(By.id("login"));
    C.click();
    String actual = driver.getCurrentUrl();
    SoftAssert s = new SoftAssert();
    s.assertEquals("https://www.adactin.com/HotelApp/SearchHotel.php", actual);
    s.assertAll();
    }
    
    @AfterTest
        private void secondPage() throws Throwable {
		
    
    WebElement L= driver.findElement(By.id("location"));
    L.sendKeys(excelData(1,0));
    WebElement H = driver.findElement(By.id("hotels"));
    H.sendKeys(excelData(1,1));
    WebElement R = driver.findElement(By.id("room_type"));
    R.sendKeys(excelData(1,2));
    WebElement Rn = driver.findElement(By.id("room_nos"));
    Rn.sendKeys(excelData(1,3));
    WebElement Ar = driver.findElement(By.id("adult_room"));
    Ar.sendKeys(excelData(1, 4));
    WebElement Ch = driver.findElement(By.id("child_room"));
    Ch.sendKeys(excelData(1,5));
    
    }
    
    

    @AfterClass(enabled=false)
    private void ending() {
driver.close();
	}
    
}
