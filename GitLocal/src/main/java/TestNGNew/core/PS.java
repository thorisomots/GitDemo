package TestNGNew.core;

import org.testng.annotations.BeforeMethod;

public class PS {

	
	public void  doThis() {
		System.out.println("I'm a method from the parent!!!");
	}
	
	@BeforeMethod
	void breforeMethod() {
		System.out.println("Run first!!!");
	}
	
}
