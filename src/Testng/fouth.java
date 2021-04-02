package Testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fouth {

	@Parameters({"URL","username"})
	@Test
	public void seven(String first, String username) {
		System.out.println("seventh script");
		System.out.println(first);
		System.out.println(username);
	}

	@Test(groups= {"firstgroup"})
	public void eight() {
		System.out.println("eighthth");
	}
	
	@Test
	public void nine() {
		System.out.println("nineth");
	}
	
	@BeforeTest
	public void tenth() {
		System.out.println("This is the tenth test case");
	}
	
	@BeforeSuite
	public void bf() {
		System.out.println("i am the best in learning");
	}
	
	@Test(dependsOnMethods= {"nine"})
	public void box() {
		System.out.println("box is a numbered collection");
	}
	
	@Test(enabled=false)
	public void boxes() {
		System.out.println("boxes is a string collection");
	}
	
	@Test(timeOut=4000)
	public void line() {
		System.out.println("line is a float collection");
	}
}
