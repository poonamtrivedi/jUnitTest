package jUnitTestpackage;
import static org.junit.Assert.*;
public class addNumbers {
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
