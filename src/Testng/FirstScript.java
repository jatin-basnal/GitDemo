package Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FirstScript {

	@AfterSuite
	public void as() {
		System.out.println("I am the worst in learning");
	}
	
	@AfterTest
	public void demo() {
		System.out.println("First Testng Script");
	}

	@Test(groups= {"firstgroup"})
	public void second() {
		System.out.println("Second Testing Script");
	}
}
