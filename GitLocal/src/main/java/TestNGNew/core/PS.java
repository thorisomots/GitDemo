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
	
	public void msg1() {
		system.out.println("This is a message from the PS class!");
	}
	
}
