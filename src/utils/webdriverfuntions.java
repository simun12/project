package utils;



import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriverfuntions {

	public static Logger Application_logs= Logger.getLogger("devpinoyLogger");
	
	protected WebDriver driver;

	public void typebyxpath(String locators,String value) {
		//driver.findElement(By.xpath(locators)).clear(); // this is to clear the edit box for perticular 
		driver.findElement(By.xpath(locators)).sendKeys(value);

		
	}
}
