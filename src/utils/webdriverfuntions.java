package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriverfuntions {

	protected WebDriver driver;

	public void typebyxpath(String locators,String value) {
		driver.findElement(By.xpath(locators)).clear(); // this is to clear the edit box for perticular 
		driver.findElement(By.xpath(locators)).sendKeys(value);

		// can you save this please
		// run again please
	}
}
