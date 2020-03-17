package UnitTest;

import org.junit.experimental.categories.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
//@Categories.IncludeCategory(MonkeyTests.class)
@Categories.IncludeCategory(LoadTests.class)
@Suite.SuiteClasses
(
		{
			Test1.class,
			test2.class,
		}
)
public class Testsuits 
{
}
