package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.webdriverfuntions;

public class config extends webdriverfuntions{

	// try not to use chromedriver 2 == rename it to chromedriver if doesn't work
	// save it please
	// fix the code = cmd a and cmd i and then save it -- do it now plz

	@BeforeTest
	public void setUp() {

		// /Users/mohammadhasan/workspac
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		// max the window first
		// implic wait for 45 sec
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
	}

	// ADD AFTER TEST PLESE - wait
	// please fix both function now
	@AfterTest
	public void tearDown (){
		//driver.quit();
	}




}
