package day6JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FirstJUnitTestCase.class, ScrollingExample.class })

public class AllTests {

}
