package TestNGNew.core;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	void testRun() {
		int a = 3;

//		  PS call = new PS();
//		  
//		  call.doThis();

		doThis();

		PS2 math = new PS2(a);

		System.out.println(math.decrement());
		System.out.println(math.increment());
		System.out.println(math.multiplyByTwo());
		System.out.println(math.multiplyByThree());
		System.out.println("Completed");
		System.out.println("Now to the next test!!!");

	}
}
