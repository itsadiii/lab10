package JUnitTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, testAddNumbers.class, testAddStrings.class })

public class AllTests {

}
