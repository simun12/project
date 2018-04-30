package tests;

import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.value;

public class myfirsttest extends config {

	locators loc= new locators();
	value val= new value();

	@Test
	public void mytest() {
		typebyxpath (loc.firstNameLoc, val.firstname);
		typebyxpath(loc.lastnameLoc, val.lastname);
	}
}
