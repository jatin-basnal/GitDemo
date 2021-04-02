package Testng;

import org.testng.annotations.Test;

public class Third {

	@Test(groups= {"firstgroup"})
	public void fourth() {
		System.out.println("fourth script");
	}

	@Test
	public void fifth() {
		System.out.println("fifth");
	}
	
	@Test(groups= {"firstgroup"})
	public void sixth() {
		System.out.println("sixth");
	}
}
