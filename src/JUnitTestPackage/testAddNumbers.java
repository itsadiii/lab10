package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	JUnitFunctions t = new JUnitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular integer should work", t.addNumbers(4,5),9);
	}

}