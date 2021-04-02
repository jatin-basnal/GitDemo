package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondScript {
	
	@Test(dataProvider = "student")
	public void third(String user, String pass) {
		System.out.println(user);
		System.out.println(" third script");
		System.out.println(pass);
	}
	
	@DataProvider
	public Object student() {
		Object[][] data = new Object[4][2];
		data[0][0] = "first username";
		data[0][1] = "First Password";
		data[1][0] = "second username";
		data[1][1] = "second Password";
		data[2][0] = "third username";
		data[2][1] = "third Password";
		data[3][0] = "fourth username";
		data[3][1] = "Fourth Password";
		return data;
		
	}
}
