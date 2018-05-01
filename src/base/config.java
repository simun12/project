package base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.sun.media.jfxmedia.logging.Logger;

import utils.webdriverfuntions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
public class config extends webdriverfuntions{

	String browsertype="ch";

	@BeforeTest
	public void setUp() {

		if(browsertype.equalsIgnoreCase("CH")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver");
		driver = new ChromeDriver();
		Application_logs.debug("chrome");
		
	

		}
		else if(browsertype.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver");
			driver = new FirefoxDriver();
			Application_logs.debug("firefox");
		}
		
		driver.get("htpp://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	
	}
	
	

	@AfterTest
	public void tearDown (){
		//driver.quit();
	}




}
