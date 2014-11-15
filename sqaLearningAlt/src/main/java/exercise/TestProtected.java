package exercise;

import inheritence.Vehicle;

public class TestProtected extends Vehicle {
	
	public void testProtected(){
		super.source = "ac";
		new TestProtected().source = "ac";		
	}
}
