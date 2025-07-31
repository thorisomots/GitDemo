package TestNGNew.core;

public class PS2 extends PS3 {

	
	int a;
	
	public PS2(int a2) {
		
		super(a2);
		this.a = a2;
	}

	public int increment() {
		a = a+1;
		
		return a;
	}
	
	public int decrement() {
		a=a-1;
		
		return a;
		
	}
}
