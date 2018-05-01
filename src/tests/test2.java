package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void d() {
		System.out.println("final GSW VS Tor");
		throw new SkipException("this test will not excute");
	}
	@Test(enabled=false)
	public void e() {
		System.out.println("GSW will win in 5");
	}
	@Test(priority=1)
	public void f() {
		System.out.println("GSW will be champ again");
	}
}
