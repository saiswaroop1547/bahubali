package UnitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses
(
		{
			Junit1.class,
			Junit.class,
			
			
		}
)



public class JunitTestSuite 
{
@Test
void test()
{
	System.out.println("Hi pal");
}
}
