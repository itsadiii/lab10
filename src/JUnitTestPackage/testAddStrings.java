package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	JUnitFunctions t = new JUnitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular string addition should work", t.addStrings("a","b"),"ab");
	}
}